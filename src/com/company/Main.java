package com.company;

import java.io.IOException;

public class Main {

    static String fileLocation = "src/com/company/database.txt";
    static String IdLocation = "src/com/company/config.txt";


    public static void main(String[] args) throws IOException {



        CreateNewPassword createNewPassword = new CreateNewPassword(600,800);


        createNewPassword.ActionListenerCreate();



    }
}
