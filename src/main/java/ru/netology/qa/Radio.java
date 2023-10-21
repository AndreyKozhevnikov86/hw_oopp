package ru.netology.qa;

public class Radio {

    private int currentVolume;          // текущая громкость
    private int currentRadioStation;        // текущая радиостанция
    private int maxStations;
    public Radio() {
        this.maxStations = 9;
    }
    public Radio(int stationsCount) {
        this.maxStations = stationsCount - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {  // установка радиостанции
        if (CurrentRadioStation > maxStations) {
            return;
        }
        if (CurrentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {   // установка громкости
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {                // следующая радиостанция
        if (currentRadioStation < maxStations) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {                // предыдущая радиостанция
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxStations;
        }
    }

    public void volumeUp() {                // увеличение громкости на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void volumeDown() {              // уменьшение громкости на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}

