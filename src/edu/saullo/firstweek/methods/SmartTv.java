package edu.saullo.firstweek.methods;

public class SmartTv {

    boolean isOn = false;
    int currentChannel = 1;
    int currentVolume = 25;

    public void changeChannel(int numberChannel) {
        currentChannel = numberChannel;
    }

    public void nextChannel() {
        currentChannel++;
    }

    public void previousChannel() {
        currentChannel--;
    }

    public void increaseVolume() {
        currentVolume++;
    }

    public void decreaseVolume() {
        currentVolume--;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}
