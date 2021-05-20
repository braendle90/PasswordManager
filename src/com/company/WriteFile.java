package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class WriteFile {

    private CreateData createData;

    private String data;

    public WriteFile(CreateData cd) {
        this.createData = cd;


    }

    public void writeInformationToFile() throws IOException {


        FileWriter writer = new FileWriter(Main.fileLocation, StandardCharsets.UTF_8, true);

        writer.write("\n" + createData.toString());

        writer.close();

    }

    public void writeLastID() throws IOException {

        FileWriter writeID = new FileWriter("src/com/company/config.txt", StandardCharsets.UTF_8, false);
        writeID.write(String.valueOf(createData.getID()));

        writeID.close();

    }


}
