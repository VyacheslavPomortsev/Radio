import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationSince7() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(7);

        int expected = 7;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMinus1() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxToRadioStation() {
        Radio radio = new Radio();

        radio.setToMaxRadioStationNumber();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNextRadioStationSince9() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNextRadioStationSince0() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);
        radio.next();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNextRadioStationSince1() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(1);
        radio.next();

        int expected = 2;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevRadioStationSince1() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevRadioStationSince0() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevRadioStationSince9() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NewNumberRadioStationSince0() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NewNumberRadioStationSince9() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NewNumberRadioStationSince10() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeSince100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeSince99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeSince0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeSince100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.downVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeSince1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.downVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeSince0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.downVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newCurrentVolumeMinus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actuale = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }

    @Test
    public void newCurrentVolumeSince101() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actuale = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actuale);
    }
}


