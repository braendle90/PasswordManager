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

    public JTextField getTxt_CPanel_Title() {
        return txt_CPanel_Title;
    }

    public void setTxt_CPanel_Title(JTextField txt_CPanel_Title) {
        this.txt_CPanel_Title = txt_CPanel_Title;
    }

    public JTextField getTxt_CPanel_username() {
        return txt_CPanel_username;
    }

    public void setTxt_CPanel_username(JTextField txt_CPanel_username) {
        this.txt_CPanel_username = txt_CPanel_username;
    }

    public JTextField getTxt_CPanel_password() {
        return txt_CPanel_password;
    }

    public void setTxt_CPanel_password(JTextField txt_CPanel_password) {
        this.txt_CPanel_password = txt_CPanel_password;
    }

    public JTextField getTxt_CPanel_website() {
        return txt_CPanel_website;
    }

    public void setTxt_CPanel_website(JTextField txt_CPanel_website) {
        this.txt_CPanel_website = txt_CPanel_website;
    }

    public JLabel getLbl_cPanel_ID() {
        return lbl_cPanel_ID;
    }

    public void setLbl_cPanel_ID(JLabel lbl_cPanel_ID) {
        this.lbl_cPanel_ID = lbl_cPanel_ID;
    }
}

