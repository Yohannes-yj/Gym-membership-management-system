package gui;


import database.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchMemberPanel extends JPanel {

    public SearchMemberPanel() {

        setLayout(new GridLayout(3,2));

        JTextField idField = new JTextField();

        JTextArea resultArea = new JTextArea();

        JButton searchButton = new JButton("Search");

        add(new JLabel("Member ID"));
        add(idField);

        add(searchButton);

        add(new JScrollPane(resultArea));

        searchButton.addActionListener(e -> {

            try {

                Connection conn =
                        DBConnection.getConnection();

                String sql =
                        "SELECT * FROM members WHERE member_id=?";

                PreparedStatement ps =
                        conn.prepareStatement(sql);

                ps.setInt(
                        1,
                        Integer.parseInt(
                                idField.getText()
                        )
                );

                ResultSet rs =
                        ps.executeQuery();

                if(rs.next()) {

                    resultArea.setText(

                            "Name : "
                                    + rs.getString("name")

                                    + "\nAge : "

                                    + rs.getInt("age")

                                    + "\nPhone : "

                                    + rs.getString("phone")

                                    + "\nType : "

                                    + rs.getString("membership_type")
                    );
                }

                else {

                    resultArea.setText(
                            "Member not found."
                    );
                }

                conn.close();

            }

            catch(Exception ex) {

                ex.printStackTrace();

            }

        });

    }

}