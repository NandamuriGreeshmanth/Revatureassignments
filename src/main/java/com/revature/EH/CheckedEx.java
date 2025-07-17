package com.revature.EH;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedEx {
    public static void main(String[] args) {

        try {
            FileReader fi = new FileReader("file1234.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
