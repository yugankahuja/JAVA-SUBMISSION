package com.ey;

import java.io.File;

public class FileSearchUtility {

    public static void main(String[] args) {
        // Replace these with the path to search and the file name to find
        String searchPath = "D:\\Java Practice\\Day7";
        String fileNameToFind = "Main.java";

        File searchDirectory = new File(searchPath);
        if (searchDirectory.exists() && searchDirectory.isDirectory()) {
            boolean found = searchFile(searchDirectory, fileNameToFind);
            if (!found) {
                System.out.println("File not found: " + fileNameToFind);
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }

    public static boolean searchFile(File directory, String fileNameToFind) {
        // Get all files and folders within the current directory
        File[] filesAndFolders = directory.listFiles();
        if (filesAndFolders != null) {
            for (File file : filesAndFolders) {
                // Check if the current file is the one we are looking for
                if (file.isFile() && file.getName().equals(fileNameToFind)) {
                    System.out.println("File found: " + file.getAbsolutePath());
                    return true;
                } 
                // If the current file is a directory, recursively search within it
                else if (file.isDirectory()) {
                    boolean found = searchFile(file, fileNameToFind);
                    if (found) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

