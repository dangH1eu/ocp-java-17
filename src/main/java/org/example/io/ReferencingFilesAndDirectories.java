package org.example.io;

import org.example.Main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReferencingFilesAndDirectories {
    

    public static void main(String[] args) {
        Main.hr("Creating a File or Path");
        Main.shr("Creating a File");

        File file = new File("example.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println("File path: " + absolutePath);

        Main.shr("Creating a Path");

        File zooFile1 = new File("filetest/stripes.txt");
        System.out.println(zooFile1.getAbsolutePath());
        Path zooPath1 = Path.of("filetest/stripes.txt");
        Path zooPath2 = Paths.get("filetest/stripes.txt");
        System.out.println(Files.exists(zooPath1));

        Main.shr("Switching between File and Path");
        File file2 = new File("eagle");
        Path nowPath = file2.toPath();
        File file3 = nowPath.toFile();

    }
}
