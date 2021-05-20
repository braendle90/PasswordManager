package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class WriteFile {

    private String loginInformation;

    public WriteFile(String loginInformation) {
        this.loginInformation = loginInformation;
    }

    public void writeInformationToFile() throws IOException {


        FileWriter writer = new FileWriter(Main.fileLocation, StandardCharsets.UTF_8, true);

        writer.write("\n" + loginInformation);

        writer.close();



    }



}
