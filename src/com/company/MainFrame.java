package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFrame extends JFrame {


    private JPanel Background;
    private JTextPane TextPanel;
    private CustomControl customControl;
    private JButton btn_loadData;
    private JButton btn_createLogin;
    private CreateData createData;
    private String currentLine;

    public MainFrame(){
        super("Haupt Fenster");
        this.setContentPane(this.Background);
        this.pack();

        btn_loadData.addActionListener(e -> {
            try {
                loadData();
            } catch (IOException ioException) {
                ioException.printStackTrace();
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
    private void loadData() throws IOException{
        List<String> getDataList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(Main.fileLocation));
        while ((currentLine = reader.readLine()) != null){
            CustomControl cc = new CustomControl(createData);
            getDataList = Arrays.asList(currentLine.split(","));
            for (int i = 0; i < currentLine.length(); i++) {
                cc.getLbl_cPanel_ID().setText(Integer.toString(createData.getID()));
            }
        }

     }

}
