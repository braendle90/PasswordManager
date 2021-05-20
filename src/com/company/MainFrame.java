package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class MainFrame extends JFrame {


    private JPanel Background;
    private JTextPane TextPanel;
    private JButton btn_loadData;
    private JButton btn_createLogin;

    public MainFrame(){
        super("Haupt Fenster");
        this.setContentPane(this.Background);
        this.pack();
        btn_loadData.addActionListener(e -> {
            try {
                FileReader reader = new FileReader("src/com/company/database.txt");
                BufferedReader br = new BufferedReader(reader);
                TextPanel.read(br, null);
                br.close();
                TextPanel.requestFocus();
            }
            catch(Exception e2)
            {
                System.out.println(e2);
            }
        });

        btn_createLogin.addActionListener(e -> {
            CreateNewPassword createNewPassword = new CreateNewPassword();
            createNewPassword.setSize(800, 600);
            createNewPassword.setVisible(true);
            createNewPassword.ActionListenerCreate();
        });
    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.setSize(800, 600);


    }

}
