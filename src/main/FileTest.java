package main;

import service.PaymentService;
import file.ReportGenerator;

public class FileTest {

    public static void main(String[] args) {

        PaymentService service =
                new PaymentService();

        service.makePayment(
                1,
                500,
                "2026-06-20"
        );

        service.makePayment(
                2,
                1300,
                "2026-06-20"
        );

        ReportGenerator.savePayments(
                service.getPayments()
        );

        System.out.println(
                "\nReading File:\n"
        );

        ReportGenerator.readPayments();
    }
}
