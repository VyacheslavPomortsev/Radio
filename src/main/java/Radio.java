public class Radio {
    private int radioStationNumber;
    private int currentVolume;
    private int radioStationSize = 10;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = radioStationSize - 1;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;

    public Radio(int radioStationSize) {
        maxRadioStationNumber = radioStationSize - 1;
    }

    public Radio() {
        radioStationSize = 10;
    }


    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setToMaxRadioStationNumber() {
        radioStationNumber = maxRadioStationNumber;
    }

    public void next() {
        if (radioStationNumber < maxRadioStationNumber) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = minRadioStationNumber;
        }
    }

    public void prev() {
        if (radioStationNumber > minRadioStationNumber) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = maxRadioStationNumber;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= minCurrentVolume) {
            newCurrentVolume = minCurrentVolume;
        }
        if (newCurrentVolume > maxCurrentVolume) {
            newCurrentVolume = maxCurrentVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}

