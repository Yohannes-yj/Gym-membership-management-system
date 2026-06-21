package model;

public abstract class MembershipPlan extends Object implements Payable {

    protected String planName;

    public MembershipPlan(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public abstract double calculateFee();
}