package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private static final String PATH = "src\\main\\resources\\com\\example\\chef_koltsegek_2024.csv";
    public static ArrayList<Data> readFile() throws FileNotFoundException {
        ArrayList<Data> data = new ArrayList<>();
        File file = new File(PATH);
        Scanner sc = new Scanner(file);
        sc.nextLine();
        while (sc.hasNextLine()) {
            data.add(new Data(sc.nextLine()));
        }
        sc.close();
        return data;
    }
    public static void writeFile(ArrayList<Data> data) throws IOException {
        FileWriter fw = new FileWriter(PATH);
        String rawdata = "id;chefname;datum;kategoria;osszeg;megjegyzes\n";
        for (Data elem : data) {
            rawdata += elem.toString()+"\n";
        }
        System.out.println(rawdata);
        fw.write(rawdata);
        fw.close();
    }
}
