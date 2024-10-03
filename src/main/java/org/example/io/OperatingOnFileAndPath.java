package org.example.io;

import org.example.Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class OperatingOnFileAndPath {

    public static void io() {
//        var file = new File("D:\\programs");
        var file = new File("zoo.txt");
        if(file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if(file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last modified: " + file.lastModified());
            }
            else {
                for(File subfile : file.listFiles()) {
                    System.out.println("    " + subfile.getName());
                }
            }
        }
    }

    public static void nio() throws IOException {
//        var path = Path.of("D:\\programs");
        var path = Path.of("zoo.txt");
        if(Files.exists(path)) {
            System.out.println("Absolute Path: " + path.toAbsolutePath());
            System.out.println("Is Directory: " + Files.isDirectory(path));
            System.out.println("Parent Path: " + path.getParent());
            if(Files.isRegularFile(path)) {
                System.out.println("Size: " + Files.size(path));
                System.out.println("Last modified: " + Files.getLastModifiedTime(path));
            }
            else {
                try(Stream<Path> stream = Files.list(path)){
                    stream.forEach(p -> System.out.println("    " + p.getFileName()));
                }
            }

        }

    }

    public static void main(String[] args) throws IOException {
        Main.hr("Using Shared Functionality");
        io();
        nio();

        Main.hr("Handling Methods That Declare IOException");






    }
}
