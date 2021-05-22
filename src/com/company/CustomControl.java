package com.company;

import javax.swing.*;

public class CustomControl extends JFrame {
    private JPanel customPanel;
    private JTextField txt_CPanel_Title;
    private JTextField txt_CPanel_username;
    private JTextField txt_CPanel_password;
    private JTextField txt_CPanel_website;
    private JLabel lbl_cPanel_ID;
    private CreateData createData;

    public CustomControl(CreateData createData) {
        lbl_cPanel_ID.setText(Integer.toString(createData.getID()));
        txt_CPanel_Title.setText(createData.getTitle());
        txt_CPanel_username.setText(createData.getUsername());
        txt_CPanel_password.setText(createData.getHashcode());
        txt_CPanel_website.setText(createData.getWebsite());
        this.createData = createData;
        this.setContentPane(customPanel);
        this.pack();
    }
}

