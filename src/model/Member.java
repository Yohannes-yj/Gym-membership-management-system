package model;

public class Member extends Person {

    private String membershipType;

    public Member() {
        super();
    }

    public Member(int id,
                  String name,
                  int age,
                  String phone,
                  String membershipType) {

        super(id, name, age, phone);
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Membership Type: " + membershipType);
    }
    @Override
    public String toString() {
        return getId() + "," +
               getName() + "," +
               getAge() + "," +
               getPhone() + "," +
               membershipType;
    }

}