package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int numberStations = 10;

    //создали конструкторы для количества радиостанций
    public Radio () {
            }

    public Radio(int numberStations) {
        this.numberStations = numberStations;
    }
    //метод, возвращающий количество станций
    public int getNumberStations () {
        return numberStations;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > numberStations - 1) {
            return;
        }
        if (currentChannel < 0) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void CurrentChannelNext() {
        if (currentChannel <= numberStations - 2) {
            currentChannel = currentChannel + 1;
        } else currentChannel = 0;

    }

    public void CurrentChannelPrev() {
        if (currentChannel >= 1) {
            currentChannel = currentChannel - 1;
        } else currentChannel = numberStations - 1;

    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void VolumeMax() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void VolumeMin() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

}
