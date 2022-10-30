package ru.netology.statistic;

public class Radio {
    public int maxStation = 10;
    public int minStation = 0;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 100;
    public int currentStation = minStation;

    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public Radio(int size) {
        maxStation = minStation + size - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void insertVolume(int newVolume) {
        if (newVolume < minVolume ) {
            return;
        }
        if (newVolume > maxVolume ) {
            return;
        }
        currentVolume = newVolume;
    }


    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else currentStation = minStation;
    }

    public void reduceStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else currentStation = maxStation;
    }

    public void setStation(int newStation) {
        if (newStation < minStation) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        currentStation = newStation;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}



