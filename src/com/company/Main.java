package com.company;

import java.io.IOException;

public class Main {

    static String fileLocation = "src/com/company/database.txt";

    public static void main(String[] args) throws IOException {

        CreateData cd = new CreateData(123,"abc","hans","879diojkf","fb.me");

        WriteFile writeFile = new WriteFile(cd);
        writeFile.writeInformationToFile();

        ReadFile rf = new ReadFile(1);

        System.out.println(rf.getFileFromDatabase().get(1));


    }
}
