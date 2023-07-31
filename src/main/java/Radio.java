public class Radio {

    private int radioStationNumber;
    private int currentVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setToMaxRadioStationNumber() {
        radioStationNumber = 9;
    }

    public void next() {
        if (radioStationNumber < 9) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

