package ru.netology.statistic;

public class Radio {
    public int amountStation = 10;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 100;
    public int currentStation = 0;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.currentStation =0;
    }


    public Radio() {
        this.amountStation = 10;
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
        if (currentStation < amountStation - 1) {
            currentStation = currentStation + 1;
        } else currentStation = 0;
    }

    public void reduceStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = amountStation - 1;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > amountStation) {
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




