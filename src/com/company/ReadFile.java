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

        BufferedReader reader = new BufferedReader(new FileReader(Main.fileLocation));

        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.contains(findID)) {
                loginInformation = Arrays.asList(currentLine.split(","));
                //System.out.println("Zeile ist: " + loginInformation);

            }
        }

        reader.close();

        return loginInformation;


    }

}
