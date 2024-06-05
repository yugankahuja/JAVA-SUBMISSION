package com.ey.problem4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadChargeRecord {
    public static void main(String[] args) {
        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream("ChargeRecord.ser"));

            System.out.println("Call Details:");
            System.out.println("FromNumber\tToNumber\tCharge");
            while (true) {
                CallDetailRecord callRecord = (CallDetailRecord) inputStream.readObject();
                System.out.println(callRecord);
            }
        } catch (IOException | ClassNotFoundException e) {
            // End of file reached or file not found
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
