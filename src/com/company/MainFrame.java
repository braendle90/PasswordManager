package com.company;

import javax.swing.*;

public class MainFrame extends JFrame {


    private JPanel Background;
    private JButton button1;

    public MainFrame(){
        super("Haupt Fenster");
        this.setContentPane(this.Background);
        this.pack();
    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.setSize(800,600);

    }
}
