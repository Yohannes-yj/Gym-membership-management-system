package file;

import database.DBConnection;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberReportGenerator {

    public static void exportMembers() {

        try {

            FileWriter writer =
                    new FileWriter(
                            "MembersReport.txt"
                    );

            Connection conn =
                    DBConnection.getConnection();

            Statement stmt =
                    conn.createStatement();

            ResultSet rs =
                    stmt.executeQuery(
                            "SELECT * FROM members"
                    );

            while(rs.next()) {

                writer.write(

                        rs.getInt("member_id")

                                + " "

                                + rs.getString("name")

                                + " "

                                + rs.getString("membership_type")

                                + "\n"

                );

            }

            writer.close();

            conn.close();

        }

        catch(Exception e) {

            e.printStackTrace();

        }

    }

}