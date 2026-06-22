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

            System.out.println("\n===== FITTRACK GYM =====");

            System.out.println("1. Register Member");
            System.out.println("2. View Members");
            System.out.println("3. Record Attendance");
            System.out.println("4. View Attendance");
            System.out.println("5. Make Payment");
            System.out.println("6. View Payments");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            choice = input.nextInt();

            switch(choice) {

                case 1:

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

                    break;

                case 2:

                    memberService
                            .displayAllMembers();

                    break;

                case 3:

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

                    break;

                case 4:

                    attendanceService
                            .showAttendance();

                    break;

                case 5:

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

                    break;

                case 6:

                    paymentService
                            .displayPayments();

                    break;

                case 7:

                    System.out.println(
                            "Exiting System..."
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid Choice"
                    );
            }

        } while(choice != 7);

        input.close();
    }
}
