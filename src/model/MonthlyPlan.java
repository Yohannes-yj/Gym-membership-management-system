package model;

public class MonthlyPlan extends MembershipPlan{
    public MonthlyPlan(){
        super("Monthly Plan");
    }
    @Override
    public double calculateFee() {
        return 450.00;
    }
}
