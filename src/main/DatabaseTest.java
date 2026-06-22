package main;

import database.MemberDAO;
import model.Member;

public class DatabaseTest {

    public static void main(String[] args) {

        MemberDAO dao =
                new MemberDAO();

        Member member =
                new Member(
                        1,
                        "John",
                        22,
                        "0912345678",
                        "Monthly"
                );

        dao.addMember(member);

        dao.viewMembers();

        dao.updatePhone(
                1,
                "0999999999"
        );

        dao.viewMembers();

        dao.deleteMember(1);

        dao.viewMembers();
    }
}