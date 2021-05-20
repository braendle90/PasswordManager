package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {

    //String fileLocation = "src/com/company/database.txt";
    private String currentLine;
    private String findID;
    private List<String> loginInformation;

    public ReadFile(int findID) {
        this.findID = Integer.toString(findID);
    }

    public List<String> getFileFromDatabase() throws IOException {

        int index = 0;


        BufferedReader reader = new BufferedReader(new FileReader(Main.fileLocation));

        while ((currentLine = reader.readLine()) != null) {
            index++;
            loginInformation = Arrays.asList(currentLine.split(","));

            if (loginInformation.get(0).equals(findID)) {

                System.out.println("Zeile ist: " + loginInformation.get(0));

            }
        }

        reader.close();

        return loginInformation;


    }

}
