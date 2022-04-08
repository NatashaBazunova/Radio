package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            this.currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            this.currentStation = maxStation;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 & currentStation <= 9) {
            this.currentStation = currentStation;
        } else {
            this.currentStation = minStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            this.currentVolume = minVolume;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 & currentVolume <= 10) {
            this.currentVolume = currentVolume;
        } else {
            this.currentVolume = maxVolume;
        }
    }
}
