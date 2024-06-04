package com.ey.problem1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConferenceRoomBookingJob implements Runnable {
    private static final Lock lock = new ReentrantLock();
    private static boolean isRoomAvailable = true;
    private String managerName;

    public ConferenceRoomBookingJob(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public void run() {
        checkAndBookRoom();
    }

    private void checkAndBookRoom() {
        System.out.println(managerName + " is checking the availability of the conference room.");
        lock.lock();
        try {
            if (isRoomAvailable) {
                System.out.println(managerName + " found the conference room available and is booking it.");
                isRoomAvailable = false;
                conductMeeting();
                isRoomAvailable = true;
            } else {
                System.out.println(managerName + " found the conference room occupied and cannot book it.");
            }
        } finally {
            lock.unlock();
        }
    }

    private void conductMeeting() {
        System.out.println(managerName + " is conducting the meeting.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(managerName + " has finished the meeting.");
    }
}
