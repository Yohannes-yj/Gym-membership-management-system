package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Member;

public class MemberDAO {

    public void addMember(Member member) {

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO members VALUES (?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, member.getId());
            ps.setString(2, member.getName());
            ps.setInt(3, member.getAge());
            ps.setString(4, member.getPhone());
            ps.setString(5, member.getMembershipType());

            System.out.println("Before executeUpdate");

            ps.executeUpdate();

            System.out.println("After executeUpdate");
            System.out.println("Member inserted.");

            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void viewMembers() {

        String sql = "SELECT * FROM members";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("member_id")
                                + " "
                                + rs.getString("name")
                                + " "
                                + rs.getString("membership_type")
                );
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void deleteMember(int id) {

        String sql = "DELETE FROM members WHERE member_id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Member deleted.");

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void updatePhone(int id, String newPhone) {

        String sql = "UPDATE members SET phone=? WHERE member_id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, newPhone);

            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Phone updated.");

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}