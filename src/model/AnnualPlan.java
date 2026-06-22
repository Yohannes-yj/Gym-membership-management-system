package model;

public class AnnualPlan extends MembershipPlan {

    public AnnualPlan() {
        super("Annual Plan");
    }

    @Override
    public double calculateFee() {
        return 5000;
    }
}
