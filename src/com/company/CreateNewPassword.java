package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class CreateNewPassword extends javax.swing.JFrame {
    private JPanel Background;
    private JButton createPasswordButton;
    private JButton resetButton;
    private JTextField TITLETextField;
    private JTextField USERNAMETextField;
    private JTextField PASSWORTTextField;
    private JTextField WEBSITETextField;
    private JLabel lbl_title;
    private JLabel lbl_username;
    private JLabel lbl_password;
    private JLabel lbl_website;


    public CreateNewPassword() {

        super("Create Password");
        this.setContentPane(this.Background);
        this.pack();

    }

    public static void main(String[] args) {
        CreateNewPassword createNewPassword = new CreateNewPassword();
        createNewPassword.setSize(800, 600);
        createNewPassword.setVisible(true);



    }

    public void ActionListenerCreate(){

        createPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {

                int id = Integer.parseInt(ReadFile.readLastID()) + 1;


                CreateData cd = null;
                try {
                    cd = new CreateData(id, TITLETextField.getText(), USERNAMETextField.getText(), HashCode.setSecurePassword(PASSWORTTextField.getText()), WEBSITETextField.getText());
                } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    noSuchAlgorithmException.printStackTrace();
                }
                WriteFile writeFile = new WriteFile(cd);
                try {
                    writeFile.writeInformationToFile();
                    writeFile.writeLastID();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
}
