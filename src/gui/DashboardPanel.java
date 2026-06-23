package gui;

import database.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DashboardPanel extends JPanel {

    private JLabel totalMembersLabel;
    private JLabel premiumMembersLabel;

    public DashboardPanel() {

        setLayout(new GridLayout(2,1,20,20));

        totalMembersLabel = new JLabel();
        premiumMembersLabel = new JLabel();

        totalMembersLabel.setFont(new Font("Arial",Font.BOLD,25));
        premiumMembersLabel.setFont(new Font("Arial",Font.BOLD,25));

        add(totalMembersLabel);
        add(premiumMembersLabel);

        loadStatistics();
    }

    private void loadStatistics() {

        try {

            Connection conn = DBConnection.getConnection();

            Statement stmt = conn.createStatement();

            ResultSet rs1 =
                    stmt.executeQuery(
                            "SELECT COUNT(*) FROM members"
                    );

            if(rs1.next()) {

                totalMembersLabel.setText(
                        "Total Members : "
                                + rs1.getInt(1)
                );
            }

            ResultSet rs2 =
                    stmt.executeQuery(
                            "SELECT COUNT(*) FROM members WHERE membership_type='Premium'"
                    );

            if(rs2.next()) {

                premiumMembersLabel.setText(
                        "Premium Members : "
                                + rs2.getInt(1)
                );
            }

            conn.close();

        }

        catch(Exception e) {

            e.printStackTrace();

        }

    }

}