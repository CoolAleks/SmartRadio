package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 10) {
            this.currentVolume = currentVolume;
        }
    }

    public Radio() {
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9 || currentStation < 0) {
            return;
        } else {
            this.currentStation = currentStation;
        }
    }


    public int nextStation() {
        switch (currentStation) {
            case 9:
                return currentStation = 0;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 6:
                return currentStation += 1;
            default:
                return currentStation;
        }
    }

    public int prevStation() {
        if (currentStation == 0) {
            return currentStation = 9;
        } else return currentStation -= 1;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}

