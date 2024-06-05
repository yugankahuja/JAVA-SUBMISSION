package com.ey.problem4;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CallDetailRecordApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("ChargeRecord.ser"));

            while (continueInput) {
                System.out.print("Enter From Number: ");
                int fromNumber = scanner.nextInt();

                System.out.print("Enter To Number: ");
                int toNumber = scanner.nextInt();

                System.out.print("Enter Duration (minutes): ");
                float duration = scanner.nextFloat();

                CallDetailRecord callRecord = new CallDetailRecord(fromNumber, toNumber, duration);
                outputStream.writeObject(callRecord);

                System.out.print("Do you want to enter another record? (Yes/No): ");
                String choice = scanner.next();
                continueInput = choice.equalsIgnoreCase("Yes");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            scanner.close();
        }
    }
}

