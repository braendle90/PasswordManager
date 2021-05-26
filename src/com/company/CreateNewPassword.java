package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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

    public CreateNewPassword(int x ,int y) {

        super("Create Password");
        this.setContentPane(this.Background);
        this.pack();
        createPasswordButton.setEnabled(false);
        this.setSize(x,y);
        this.setVisible(true);


        resetButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TITLETextField.setText("");
                USERNAMETextField.setText("");
                PASSWORTTextField.setText("");
                WEBSITETextField.setText("");
                createPasswordButton.setEnabled(false);

            }
        });

        TITLETextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                checkIfTextHasInput();
            }
        });
    }

    public void checkIfTextHasInput() {

        if (TITLETextField.getText().length() == 0) {
            createPasswordButton.setEnabled(false);

        }
        if (TITLETextField.getText().length() >= 1) {
            createPasswordButton.setEnabled(true);
        }
    }


    public void ActionListenerCreate() {

        createPasswordButton.addActionListener(e -> {
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
        });

    }


}
