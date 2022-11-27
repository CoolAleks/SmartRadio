package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    Radio myRadio = new Radio();


    @Test
    void shouldSetCurrentStationCorrectly() {
        myRadio.setCurrentStation(0);
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationError() {
        myRadio.setCurrentStation(20);
        int actual = myRadio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationSet0() {
        myRadio.setCurrentStation(9);
        int actual = myRadio.nextStation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void shouldNextStation() {
        myRadio.setCurrentStation(5);
        int actual = myRadio.nextStation();
        int expected = 6;
        assertEquals(expected, actual);


    }

    @Test
    void shouldNextStationSetInValue() {
        Radio myRadio3 = new Radio(12,9);
        int actual = myRadio3.nextStation();
        int expected = 12;
        assertEquals(expected, actual);

    }
    @Test
    void shouldNextStationSet1() {
        myRadio.setCurrentStation(0);
        int actual = myRadio.nextStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationCorrect() {
        myRadio.setCurrentStation(0);
        int actual = myRadio.prevStation();
        int expectet = 9;
        assertEquals(expectet, actual);
    }

    @Test
    void shouldPrevStationChanel1() {
        myRadio.setCurrentStation(1);
        int actual = myRadio.prevStation();
        int expectet = 0;
        assertEquals(expectet, actual);
    }

    @Test
    void shouldCurrentVolumeCorrect() {
        myRadio.setCurrentVolume(9);
        int actual = myRadio.getCurrentVolume();
        int expectet = 9;
        assertEquals(expectet, actual);
    }
    @Test
    void shouldIncreaseVolumeStandart() {
        Radio myRadio2 = new Radio(0,5);
        myRadio2.increaseVolume();
        int actual = myRadio2.getCurrentVolume();
        int expectet = 6;
        assertEquals(expectet, actual);
    }
    @Test
    void shouldIncreaseVolumeBorderLow() {
        Radio myRadio2 = new Radio(0,0);
        myRadio2.increaseVolume();
        int actual = myRadio2.getCurrentVolume();
        int expectet = 1;
        assertEquals(expectet, actual);
    }
    @Test
    void shouldIncreaseVolumeBorderHigh() {
        Radio myRadio2 = new Radio(0,10);
        myRadio2.increaseVolume();
        int actual = myRadio2.getCurrentVolume();
        int expectet = 10;
        assertEquals(expectet, actual);
    }
    @Test
    void shouldDecreaseVolumeBorderHigh() {
        Radio myRadio2 = new Radio(0,10);
        myRadio2.decreaseVolume();
        int actual = myRadio2.getCurrentVolume();
        int expectet = 9;
        assertEquals(expectet, actual);
    }
    @Test
    void shouldDecreaseVolumeBorderLow() {
        Radio myRadio2 = new Radio(0,0);
        myRadio2.decreaseVolume();
        int actual = myRadio2.getCurrentVolume();
        int expectet = 0;
        assertEquals(expectet, actual);
    }
    @Test
    void shouldDecreaseVolumeStandart() {
        Radio myRadio2 = new Radio(0,7);
        myRadio2.decreaseVolume();
        int actual = myRadio2.getCurrentVolume();
        int expectet = 6;
        assertEquals(expectet, actual);
    }
}