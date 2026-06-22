package model;

public class QuarterlyPlan extends MembershipPlan {

    public QuarterlyPlan() {
        super("Quarterly Plan");
    }

    @Override
    public double calculateFee() {
        return 1300;
    }
}
