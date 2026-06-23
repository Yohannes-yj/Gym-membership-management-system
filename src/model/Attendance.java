package model;

public class Attendance {

    private int memberId;
    private String date;

    public Attendance(int memberId, String date) {
        this.memberId = memberId;
        this.date = date;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return memberId + " " + date;
    }
}