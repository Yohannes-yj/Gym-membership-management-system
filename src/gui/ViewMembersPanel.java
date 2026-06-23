package gui;

import database.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewMembersPanel extends JPanel {

    private JTable table;
    private DefaultTableModel model;

    public ViewMembersPanel() {

        setLayout(new BorderLayout());

        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Phone");
        model.addColumn("Membership Type");

        table = new JTable(model);

        JButton refreshButton =
                new JButton("Refresh");

        refreshButton.addActionListener(
                e -> loadMembers()
        );

        add(new JScrollPane(table),
                BorderLayout.CENTER);

        add(refreshButton,
                BorderLayout.SOUTH);

        loadMembers();
    }

    private void loadMembers() {

        model.setRowCount(0);

        try {

            Connection conn =
                    DBConnection.getConnection();

            Statement stmt =
                    conn.createStatement();

            ResultSet rs =
                    stmt.executeQuery(
                            "SELECT * FROM members"
                    );

            while (rs.next()) {

                model.addRow(
                        new Object[]{

                                rs.getInt("member_id"),

                                rs.getString("name"),

                                rs.getInt("age"),

                                rs.getString("phone"),

                                rs.getString("membership_type")
                        });
            }

            conn.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}