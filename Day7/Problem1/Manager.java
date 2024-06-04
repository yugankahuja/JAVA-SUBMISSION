package com.ey.problem1;

public class Manager extends Thread {
    private String name;
    private ConferenceRoomBookingJob bookingJob;

    public Manager(String name) {
        this.name = name;
        this.bookingJob = new ConferenceRoomBookingJob(name);
    }

    @Override
    public void run() {
        bookingJob.run();
    }
}
