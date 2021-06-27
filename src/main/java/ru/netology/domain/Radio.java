package ru.netology.domain;

public class Radio {

    private int maxVolume = 10;
    private int minVolume = 0;
    public int currentVolume;
    public int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;


    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int nextStation(int currentRadioStation) {
        if (currentRadioStation >= 9) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }
        return this.currentRadioStation;
    }

    public int prevStation(int currentRadioStation) {
        if (currentRadioStation <= 0) {
            this.currentRadioStation = 9;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }
        return this.currentRadioStation;
    }


    public int increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else if (currentVolume > 10) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }


    public int decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else if (currentVolume < 0) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }
}
