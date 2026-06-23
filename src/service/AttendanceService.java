package service;

import java.util.ArrayList;
import model.Attendance;

public class AttendanceService {

    private ArrayList<Attendance> attendanceList;

    public AttendanceService() {
        attendanceList = new ArrayList<>();
    }

    public void checkIn(int memberId, String date) {

        Attendance attendance =
                new Attendance(memberId, date);

        attendanceList.add(attendance);

        System.out.println("Attendance recorded.");
    }

    public void showAttendance() {

        for (Attendance attendance : attendanceList) {

            System.out.println(attendance);

        }
    }
}