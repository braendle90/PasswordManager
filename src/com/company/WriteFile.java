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

        //writer.write("\n" + createData);


        writer.write("\n"+ createData.toString() );


        writer.close();


    }

    public String ObjectToString() {

        data = createData.getID()+ createData.getTitle()+createData.getUsername()+createData.getHashcode()+ createData.getWebsite();



        return data;


    }


}
