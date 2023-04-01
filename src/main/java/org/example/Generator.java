package org.example;
import java.io.*;

public class Generator {
    public static void main(String args[]) throws IOException {

        File file = new File("Test.txt");
        file.createNewFile();
        try {
            OutputStream output = new FileOutputStream(file, false);
            PrintStream stream = new PrintStream(output);
            for (int j = 0 ; j < 10000000; j++) {
                stream.print(((int) (Math.random()*100000)) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
