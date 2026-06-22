package file;

import model.Member;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BackupManager {

    public static void backupMembers(
            ArrayList<Member> members) {

        try {

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream(
                                    "members.dat"
                            )
                    );

            out.writeObject(members);

            out.close();

            System.out.println(
                    "Backup completed."
            );

        } catch(Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}
