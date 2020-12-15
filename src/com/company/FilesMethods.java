package com.company;

import java.io.File;
import java.util.Objects;

public class FilesMethods {
    public static void getAllFiles(File dir){
        browseFiles(dir);
    }
    public static void cleanupDirectory(File dir) {
        for (File file: Objects.requireNonNull(dir.listFiles())) {
            if (file.isDirectory()){
                cleanupDirectory(file);
            }
            file.delete();

        }
    }

    public static void browseFiles(File dir){
       if(dir.exists()){
           for (File file: Objects.requireNonNull(dir.listFiles())){
               System.out.println(file.getPath());
            if(file.getName().equals("node_modules")){
                cleanupDirectory(file);
                file.delete();
            }else if(file.isDirectory()){
                browseFiles(file);
            }

           }
       }
    }
}
