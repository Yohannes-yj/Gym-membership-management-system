package main;

import model.Member;
import service.MemberService;
import service.AttendanceService;
import service.PaymentService;
import exception.InvalidMembershipException;

import java.util.Scanner;

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

<<<<<<< HEAD
            System.out.println("\n====== FITTRACK GYM ======");
=======
            System.out.println("\n===== FITTRACK GYM =====");
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a

            System.out.println("1. Register Member");
            System.out.println("2. View Members");
            System.out.println("3. Record Attendance");
            System.out.println("4. View Attendance");
            System.out.println("5. Make Payment");
            System.out.println("6. View Payments");
            System.out.println("7. Exit");

<<<<<<< HEAD
            System.out.print("Choose: ");
=======
            System.out.print("Enter Choice: ");
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a

            choice = input.nextInt();

            switch(choice) {

                case 1:

<<<<<<< HEAD
                    registerMember(
                            input,
                            memberService
                    );
=======
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

                        System.out.print("Membership Type: ");
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

                        memberService
                                .registerMember(member);

                    } catch (
                            InvalidMembershipException e
                    ) {

                        System.out.println(
                                e.getMessage()
                        );
                    }
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a

                    break;

                case 2:

<<<<<<< HEAD
                    memberService.displayAllMembers();
=======
                    memberService
                            .displayAllMembers();
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a

                    break;

                case 3:

<<<<<<< HEAD
                    recordAttendance(
                            input,
                            attendanceService
                    );

=======
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

                    attendanceService
                            .checkIn(
                                    memberId,
                                    date
                            );

>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a
                    break;

                case 4:

<<<<<<< HEAD
                    attendanceService.showAttendance();
=======
                    attendanceService
                            .showAttendance();
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a

                    break;

                case 5:

<<<<<<< HEAD
                    makePayment(
                            input,
                            paymentService
                    );

=======
                    System.out.print(
                            "Member ID: "
                    );

                    memberId =
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

                    date =
                            input.nextLine();

                    paymentService
                            .makePayment(
                                    memberId,
                                    amount,
                                    date
                            );

>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a
                    break;

                case 6:

<<<<<<< HEAD
                    paymentService.displayPayments();
=======
                    paymentService
                            .displayPayments();
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a

                    break;

                case 7:

                    System.out.println(
<<<<<<< HEAD
                            "Thank you!"
=======
                            "Exiting System..."
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a
                    );

                    break;

                default:

                    System.out.println(
<<<<<<< HEAD
                            "Invalid Option"
=======
                            "Invalid Choice"
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a
                    );
            }

        } while(choice != 7);
<<<<<<< HEAD
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
=======

        input.close();
>>>>>>> ce6cbdb93257e7651fe6a39b8c6fd5219cd4058a
    }
}
