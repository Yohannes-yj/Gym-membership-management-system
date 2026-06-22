package file;

import model.Payment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReportGenerator {
    public static void readPayments() {

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader(
                                "payments.txt"
                        )
                );

        String line;

        while((line = reader.readLine())
                != null) {

            System.out.println(line);
        }

        reader.close();

    } catch(IOException e) {

        System.out.println(
                e.getMessage()
        );
    }
} 
    public static void savePayments(
            ArrayList<Payment> payments) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "payments.txt"
                    );

            for(Payment payment : payments) {

                writer.write(
                        payment.getMemberId()
                        + ","
                        + payment.getAmount()
                        + ","
                        + payment.getPaymentDate()
                        + "\n"
                );
            }

            writer.close();

            System.out.println(
                    "Report saved."
            );

        } catch(IOException e) {

            System.out.println(
                    "File Error: "
                    + e.getMessage()
            );
        }
    }
}
