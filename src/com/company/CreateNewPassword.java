package com.company;

import javax.swing.*;
import java.awt.*;

public class CreateNewPassword extends javax.swing.JFrame{
    private JPanel Background;
    private JButton button1;
    private JButton button2;
    private JTextField TITLETextField;
    private JTextField USERNAMETextField;
    private JTextField PASSWORTTextField;
    private JTextField WEBSITETextField;
    private JLabel lbl_title;
    private JLabel lbl_username;
    private JLabel lbl_password;
    private JLabel lbl_website;

    public CreateNewPassword(){
        super("test");
        this.setContentPane(this.Background);
        this.pack();
    }

    public static void main(String[] args) {
        CreateNewPassword createNewPassword = new CreateNewPassword();
        createNewPassword.setSize(800,600);
        createNewPassword.setVisible(true);
    }
}
