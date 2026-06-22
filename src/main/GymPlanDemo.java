package main;

import model.*;

public class GymPlanDemo {

    public static void main(String[] args) {

        MembershipPlan[] plans = {

                new MonthlyPlan(),
                new QuarterlyPlan(),
                new AnnualPlan()
        };

        for (MembershipPlan plan : plans) {

            System.out.println(
                    plan.getPlanName()
                            + " Fee = "
                            + plan.calculateFee()
            );
        }
    }
}