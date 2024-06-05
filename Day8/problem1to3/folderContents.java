package com.ey;

import java.io.File;

public class folderContents {

    public static void main(String[] args) {
        // Replace this with the path of the folder you want to display
        String folderPath = "D:\\Java Practice\\Day8\\src";
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            displayFolderContents(folder);
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }

    public static void displayFolderContents(File folder) {
        // Get all files and folders within the current folder
        File[] filesAndFolders = folder.listFiles();
        if (filesAndFolders != null) {
            for (File file : filesAndFolders) {
                // Check if the file object is a directory
                if (file.isDirectory()) {
                    // Print the directory name
                    System.out.println(file.getAbsolutePath());
                    // Recursively display the contents of the directory
                    displayFolderContents(file);
                }
            }
        }
    }
}
