package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public void nextStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prevStation () {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }

    }

    public void setRemoteControl(int currentRadioStation){
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
