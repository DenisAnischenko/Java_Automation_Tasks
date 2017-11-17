package org.my.model;

import java.io.*;

public class Printer {

    public void PrintResult(String result) {
        try {
            File outputPath = new File("bank_results.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
            writer.write(result);
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Лажа какая-та братан...");
        }
    }

}
