package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("where is the file? : ");
        String path = sc.nextLine();

        File file = new File(path);
        if(file.exists()){
           FilesMethods.getAllFiles(file);
        }else{
            System.out.println("path doesn't founded");
        }

    }

}
