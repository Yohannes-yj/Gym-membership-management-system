package service;
import exception.InvalidMembershipException;
import java.util.ArrayList;
import model.Member;

public class MemberService {

    private ArrayList<Member> members;

    public MemberService() {
        members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully!");
    }
    public void registerMember(Member member)
        throws InvalidMembershipException {

    if(member.getAge() < 16) {

        throw new InvalidMembershipException(
                "Member must be at least 16 years old."
        );
    }

    members.add(member);

    System.out.println(
            "Member registered successfully."
    );
}
    public boolean deleteMember(int id) {

    Member member = findMember(id);

    if(member != null) {

        members.remove(member);

        return true;
    }

    return false;
}
    public boolean updatePhone(
        int id,
        String newPhone) {

    Member member = findMember(id);

    if(member != null) {

        member.setPhone(newPhone);

        return true;
    }

    return false;
}

    public void displayAllMembers() {

        if (members.isEmpty()) {
            System.out.println("No members found.");
            return;
        }

        for (Member member : members) {
            member.displayInfo();
            System.out.println("------------------");
        }
    }

    public Member findMember(int id) {

        for (Member member : members) {

            if (member.getId() == id) {
                return member;
            }
        }

        return null;
    }
}