package com.ey;import java.io.*;

public class FileCopyUtility {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopyUtility <source-file> <destination-file>");
            return;
        }

        String sourceFilePath = args[0];
        String destinationFilePath = args[1];

        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist: " + sourceFilePath);
            return;
        }

        if (destinationFile.exists()) {
            System.out.print("Destination file exists. Do you want to overwrite? (Yes/No): ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String response = reader.readLine();
                if (!response.equalsIgnoreCase("Yes")) {
                    System.out.println("File copy operation aborted.");
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (InputStream in = new FileInputStream(sourceFile); OutputStream out = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}
