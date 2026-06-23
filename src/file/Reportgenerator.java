package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Payment;

public class ReportGenerator {

    public static void savePayments(
            ArrayList<Payment> payments) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "payments.txt");

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
                    "Report Generated.");

        }

        catch(IOException e) {

            e.printStackTrace();

        }

    }

}