package main;

import exception.InvalidMembershipException;
import model.Member;
import service.MemberService;

public class ExceptionTest {

    public static void main(String[] args) {

        MemberService service =
                new MemberService();

        try {

            Member m1 =
                    new Member(
                            1,
                            "John",
                            14,
                            "0911111111",
                            "Monthly"
                    );

            service.registerMember(m1);

        }
        catch (InvalidMembershipException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }

        finally {

            System.out.println(
                    "Registration process finished."
            );
        }
    }
}