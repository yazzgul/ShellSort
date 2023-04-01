package org.example;
import java.io.*;
import java.util.ArrayList;

import static org.example.Sort.ShellSort;

public class Test {
    public static void main(String args[]) throws IOException {

        InputStream stream = new FileInputStream("/Users/yazgul/Documents/ShellSort/Test.txt");
        InputStreamReader streamReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(streamReader);
        String line;
        ArrayList<Integer> array = new ArrayList<>();
        while((line = reader.readLine()) != null) {
            array.add(Integer.parseInt(line));
        }
        System.out.println("Неотсортированный список");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(" " + array.get(i));
        }
        System.out.println();

        long startTime = System.nanoTime();
        ShellSort(array);
        long endTime = System.nanoTime();
        System.out.println();
        System.out.print("Время работы: ");
        System.out.print((double)(endTime - startTime)/1000000 + " миллисекунд");
        System.out.println();
        System.out.println();
        System.out.println("Отсортированный список");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(" " + array.get(i));
        }
    }
}





