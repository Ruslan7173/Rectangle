package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerectangle {



    public static List<Rectangl1> load (String namefile) throws Exception {
        List<Rectangl1> rectangl1s = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(namefile))){
            while (sc.hasNext()){
                String s = sc.nextLine();
                String [] mas = s.split("  ");
                double x = Double.parseDouble((mas[0]));
                double y = Double.parseDouble((mas[0]));
                Rectangl1 r = new Rectangl1(x, y);
                rectangl1s.add(r);
            }

        }
        return rectangl1s;
    }

//        Scanner scanner = new Scanner(namefile);
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();



    }

