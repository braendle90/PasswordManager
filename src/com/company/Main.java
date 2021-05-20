package com.company;

import java.io.IOException;

public class Main {

    static String fileLocation = "src/com/company/database.txt";

    public static void main(String[] args) throws IOException {


        String information = "2,Instagram,max,7890oiujh,insta.me";

        WriteFile writeFile = new WriteFile(information);
        writeFile.writeInformationToFile();

        ReadFile rf = new ReadFile(1);

        System.out.println(rf.getFileFromDatabase().get(1));


    }
}
