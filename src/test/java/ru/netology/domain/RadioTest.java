package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    void nextRadioStationAboveMax() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(9);

        service.setCurrentRadioStation(10);

        int expected = 0;
        int actual = service.nextStation(service.getCurrentRadioStation());
        assertEquals(expected, actual);

    }

    @Test
    void nextRadioStationEqualMax() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(9);

        service.setCurrentRadioStation(9);

        int expected = 0;
        int actual = service.nextStation(service.getCurrentRadioStation());
        assertEquals(expected, actual);

    }

    @Test
    void nextRadioStationBelowMax() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(9);

        service.setCurrentRadioStation(8);

        int expected = 9;
        int actual = service.nextStation(service.getCurrentRadioStation());
        assertEquals(expected, actual);

    }

    @Test
    void nextRadioStationEqualMin() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(9);

        service.setCurrentRadioStation(0);

        int expected = 1;
        int actual = service.nextStation(service.getCurrentRadioStation());
        assertEquals(expected, actual);

    }

    @Test
    void prevStationBelowMin() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(0);

        service.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = service.prevStation(service.getCurrentRadioStation());
        assertEquals(expected, actual);
    }

    @Test
    void prevStationEqualMin() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(0);

        service.setCurrentRadioStation(0);

        int expected = 9;
        int actual = service.prevStation(service.getCurrentRadioStation());
        assertEquals(expected, actual);
    }

    @Test
    void prevStationAboveMin() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(0);

        service.setCurrentRadioStation(9);

        int expected = 8;
        int actual = service.prevStation(service.getCurrentRadioStation());
        assertEquals(expected, actual);
    }

    @Test
    void maxRadioStation() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);

        service.setMaxRadioStation(9);

        int expected = 9;
        int actual = service.getMaxRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minRadioStation() {
        Radio service = new Radio();
        service.setMinRadioStation(0);

        service.setMinRadioStation(0);

        int expected = 0;
        int actual = service.getMinRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void remoteControlAboveMax() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(5);

        service.setCurrentRadioStation(10);

        int expected = 5;
        int actual = service.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void remoteControlBelowMin() {
        Radio service = new Radio();
        service.setMaxRadioStation(9);
        service.setMinRadioStation(0);
        service.setCurrentRadioStation(-1);

        service.setCurrentRadioStation(-1);

        int expected = 0;

        int actual = service.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeAboveMax() {
        Radio service = new Radio();
        service.setMaxVolume(10);
        service.setMinVolume(0);
        service.setCurrentVolume(10);

        service.setCurrentVolume(11);

        int expected = 10;
        int actual = service.increaseVolume(service.getCurrentVolume());
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeEqualMax() {
        Radio service = new Radio();
        service.setMaxVolume(10);
        service.setMinVolume(0);
        service.setCurrentVolume(10);

        service.setCurrentVolume(10);

        int expected = 10;
        int actual = service.increaseVolume(service.getCurrentVolume());
        assertEquals(expected, actual);
    }


    @Test
    void increaseVolumeBelowMax() {
        Radio service = new Radio();
        service.setMaxVolume(10);
        service.setMinVolume(0);
        service.setCurrentVolume(1);

        service.setCurrentVolume(0);

        int expected = 1;
        int actual = service.increaseVolume(service.getCurrentVolume());
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeEqualMin() {
        Radio service = new Radio();
        service.setMaxVolume(10);
        service.setMinVolume(0);
        service.setCurrentVolume(0);

        service.setCurrentVolume(0);

        int expected = 0;
        int actual = service.decreaseVolume(service.getCurrentVolume());
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeBelowMin() {
        Radio service = new Radio();
        service.setMaxVolume(10);
        service.setMinVolume(0);
        service.setCurrentVolume(0);

        service.setCurrentVolume(-1);

        int expected = 0;
        int actual = service.decreaseVolume(service.getCurrentVolume());
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeAboveMin() {
        Radio service = new Radio();
        service.setMaxVolume(10);
        service.setMinVolume(0);
        service.setCurrentVolume(0);


        service.setCurrentVolume(2);

        int expected = 1;
        int actual = service.decreaseVolume(service.getCurrentVolume());
        assertEquals(expected, actual);
    }

    @Test
    void maxVolume() {
        Radio service = new Radio();
        service.setMaxVolume(10);

        service.setMaxVolume(10);

        int expected = 10;
        int actual = service.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    void minVolume() {
        Radio service = new Radio();
        service.setMinVolume(0);

        service.setMinVolume(0);

        int expected = 0;
        int actual = service.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    void currentVolumeAboveMax() {
        Radio service = new Radio();
        int currentVolume = 11;
        service.setMaxVolume(10);
//        service.setMinVolume(0);
//        service.setCurrentVolume(11);

//        service.setCurrentVolume(11);

        int expected = 10;
        int actual = service.increaseVolume(currentVolume);
        assertEquals(expected, actual);
    }
    @Test
    void currentVolumeBeloqMin() {
        Radio service = new Radio();
        int currentVolume = -1;
        service.setMinVolume(0);

        int expected = 0;
        int actual = service.decreaseVolume(currentVolume);
        assertEquals(expected, actual);
    }
}
