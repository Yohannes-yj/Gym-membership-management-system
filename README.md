                           FITTRACK GYM SYSTEM
Project Architecture Diagram
┌─────────────────────────────────────────────┐
│                 Main Menu                   │
│         GymManagementSystem.java            │
└─────────────────────────────────────────────┘
                     │
                     ▼

┌─────────────────────────────────────────────┐
│                Service Layer                │
├─────────────────────────────────────────────┤
│ MemberService                              │
│ AttendanceService                          │
│ PaymentService                             │
└─────────────────────────────────────────────┘
                     │
                     ▼

┌─────────────────────────────────────────────┐
│                 Model Layer                 │
├─────────────────────────────────────────────┤
│ Person                                     │
│ Member                                     │
│ Trainer                                    │
│ Attendance                                 │
│ Payment                                    │
│ MembershipPlan                             │
└─────────────────────────────────────────────┘
                     │
          ┌──────────┴──────────┐
          ▼                     ▼

┌─────────────────┐   ┌─────────────────┐
│ File Handling   │   │ Database Layer  │
├─────────────────┤   ├─────────────────┤
│ ReportGenerator │   │ DBConnection    │
│ BackupManager   │   │ MemberDAO       │
└─────────────────┘   └─────────────────┘
