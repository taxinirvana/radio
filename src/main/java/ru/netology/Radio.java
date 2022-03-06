package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;


    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannelNext(int currentChannel) {
        if (currentChannel < 9) {
            currentChannel = currentChannel+1;
        }
        if (currentChannel +1 >= 9) {
            currentChannel = 0;
        }

        this.currentChannel = currentChannel;
    }

    public void setCurrentChannelPrev(int currentChannel) {
        if (currentChannel > 0) {
            currentChannel = currentChannel -1;
        }
        if (currentChannel -1 <= 0) {
            currentChannel = 9;
        }

        this.currentChannel = currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= 0){
            if (currentChannel <= 9){

        }

        }
        this.currentChannel = currentChannel;
        }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolumeMax(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeMin(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }
}
