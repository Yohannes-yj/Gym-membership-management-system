package main;

import exception.InvalidMembershipException;
import file.ReportGenerator;
import java.util.Scanner;
import model.Member;
import service.AttendanceService;
import service.MemberService;
import service.PaymentService;

public class GymManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MemberService memberService =
                new MemberService();

        AttendanceService attendanceService =
                new AttendanceService();

        PaymentService paymentService =
                new PaymentService();

        int choice;

        do {

            System.out.println("\n====== FITTRACK GYM ======");

            System.out.println("1. Register Member");
            System.out.println("2. View Members");
            System.out.println("3. Record Attendance");
            System.out.println("4. View Attendance");
            System.out.println("5. Make Payment");
            System.out.println("6. View Payments");
            System.out.println("7. Generate Payment Report");
            System.out.println("8. View Payment Report");
            System.out.println("9. Exit");

            System.out.print("Choose: ");

            choice = input.nextInt();

            switch(choice) {

                case 1 -> registerMember(
                            input,
                            memberService
                    );

                case 2 -> memberService.displayAllMembers();

                case 3 -> recordAttendance(
                            input,
                            attendanceService
                    );

                case 4 -> attendanceService.showAttendance();

                case 5 -> makePayment(
                            input,
                            paymentService
                    );

                case 6 -> paymentService.displayPayments();

                
                case 7 -> ReportGenerator.savePayments(
            paymentService.getPayments());

case 8 -> ReportGenerator.readPayments();
    
                default -> System.out.println(
                            "Invalid Option"
                    );
            }

        } while(choice != 9);
    }

    public static void registerMember(
            Scanner input,
            MemberService service) {

        try {

            System.out.print("ID: ");
            int id = input.nextInt();

            input.nextLine();

            System.out.print("Name: ");
            String name =
                    input.nextLine();

            System.out.print("Age: ");
            int age =
                    input.nextInt();

            input.nextLine();

            System.out.print("Phone: ");
            String phone =
                    input.nextLine();

            System.out.print(
                    "Membership Type: "
            );

            String type =
                    input.nextLine();

            Member member =
                    new Member(
                            id,
                            name,
                            age,
                            phone,
                            type
                    );

            service.registerMember(
                    member
            );

        } catch(
                InvalidMembershipException e
        ) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public static void recordAttendance(
            Scanner input,
            AttendanceService service) {

        System.out.print(
                "Member ID: "
        );

        int memberId =
                input.nextInt();

        input.nextLine();

        System.out.print(
                "Date: "
        );

        String date =
                input.nextLine();

        service.checkIn(
                memberId,
                date
        );
    }

    public static void makePayment(
            Scanner input,
            PaymentService service) {

        System.out.print(
                "Member ID: "
        );

        int memberId =
                input.nextInt();

        System.out.print(
                "Amount: "
        );

        double amount =
                input.nextDouble();

        input.nextLine();

        System.out.print(
                "Date: "
        );

        String date =
                input.nextLine();

        service.makePayment(
                memberId,
                amount,
                date
        );
    }
}