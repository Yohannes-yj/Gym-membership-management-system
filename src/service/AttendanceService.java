package service;

import model.Attendance;
import java.util.ArrayList;

public class AttendanceService {

    private ArrayList<Attendance> records;

    public AttendanceService() {

        records = new ArrayList<>();
    }

    public void checkIn(
            int memberId,
            String date) {

        records.add(
                new Attendance(
                        memberId,
                        date
                )
        );

        System.out.println(
                "Attendance recorded."
        );
    }

    public void showAttendance() {

        for(Attendance a : records) {

            System.out.println(
                    "Member ID: "
                            + a.getMemberId()
                            + " Date: "
                            + a.getDate()
            );
        }
    }
}
