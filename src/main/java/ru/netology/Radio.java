package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;


    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > 9) {
            return;
        }
        if (currentChannel < 0) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void currentChannelNext() {
        if (currentChannel <= 8) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }

    }

    public void currentChannelPrev() {
        if (currentChannel >= 1) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 9;
        }

    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void volumeMax() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeMin() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

}
