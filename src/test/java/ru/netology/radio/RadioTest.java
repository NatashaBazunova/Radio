package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testCurrentStation() {
        Radio rad = new Radio();
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        // int expected = 7;
        // int actual = rad.getCurrentStation();

        assertEquals(15, rad.getCurrentStation());
    }

    @Test
    public void testSetStationMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        // int expected = 0;
        // int actual = rad.getCurrentStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void testSetStationMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(19);
        //int expected = 9;
        //int actual = rad.getCurrentStation();

        assertEquals(19, rad.getCurrentStation());
    }

    @Test
    public void testSetStationOverMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(23);
        //int expected = 0;
        //int actual = rad.getCurrentStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void testSetStationUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        //int expected = 0;
        //int actual = rad.getCurrentStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void testNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);
        rad.nextStation();
        //int expected = 5;
        // int actual = rad.getCurrentStation();

        assertEquals(5, rad.getCurrentStation());
    }

    @Test
    public void testNextStationMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.nextStation();
        //int expected = 1;
        //int actual = rad.getCurrentStation();

        assertEquals(1, rad.getCurrentStation());
    }

    @Test
    public void testNextStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.nextStation();
        //int expected = 1;
        //int actual = rad.getCurrentStation();

        assertEquals(8, rad.getCurrentStation());
    }
//    @Test
//    public void testNextStationOverMax() {
//        Radio rad = new Radio();
//        rad.setCurrentStation(20);
//        rad.nextStation();
//        // expected = 0;
//        // int actual = rad.getCurrentStation();
//
//        assertEquals(0, rad.getCurrentStation());
//    }

    @Test
    public void testNextStationMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(19);
        rad.nextStation();
        //int expected = 0;
        //int actual = rad.getCurrentStation();

        assertEquals(0, rad.getCurrentStation());
    }

//    @Test
//    public void testNextStationUnderMin() {
//        Radio rad = new Radio();
//        rad.setCurrentStation(-3);
//        rad.nextStation();
//        //int expected = 1;
//        // int actual = rad.getCurrentStation();
//
//        assertEquals(0, rad.getCurrentStation());
//    }

    @Test
    public void testPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.prevStation();
        //     int expected = 6;
        //      actual = rad.getCurrentStation();

        assertEquals(6, rad.getCurrentStation());
    }

    @Test
    public void testPrevStationMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(19);
        rad.prevStation();
        //int expected = 8;
        //int actual = rad.getCurrentStation();

        assertEquals(18, rad.getCurrentStation());
    }

    @Test
    public void testPrevStationMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();
        //int expected = 9;
        //int actual = rad.getCurrentStation();

        assertEquals(19, rad.getCurrentStation());
    }

    @Test
    public void testPrevStationUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(-3);
        rad.prevStation();
        //int expected = 9;
        //int actual = rad.getCurrentStation();

        assertEquals(19, rad.getCurrentStation());
    }

    @Test
    public void testPrevStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prevStation();
        //int expected = 9;
        //int actual = rad.getCurrentStation();

        assertEquals(0, rad.getCurrentStation());
    }
    @Test
    public void testPrevStationOverMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(20);
        rad.prevStation();
        //int expected = 9;
        //int actual = rad.getCurrentStation();

        assertEquals(19, rad.getCurrentStation());
    }

    @Test
    public void testCurrentVolume() {
        Radio vol = new Radio();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(1);
        //  int expected = 1;
        // int actual = vol.getCurrentVolume();

        assertEquals(1, vol.getCurrentVolume());
    }

    @Test
    public void testSetVolumeMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        //  int expected = 0;
        //  int actual = vol.getCurrentVolume();

        assertEquals(0, vol.getCurrentVolume());
    }

    @Test
    public void testSetVolumeMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        // int expected = 10;
        // int actual = vol.getCurrentVolume();

        assertEquals(100, vol.getCurrentVolume());
    }

    @Test
    public void testSetVolumeOverMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(101);
        //   int expected = 10;
        //   int actual = vol.getCurrentVolume();

        assertEquals(0, vol.getCurrentVolume());
    }

    @Test
    public void testSetVolumeUnderMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(-6);
        //  int expected = 100;
        // int actual = vol.getCurrentVolume();

        assertEquals(0, vol.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(4);
        vol.increaseVolume();
        // int expected = 5;
        //int actual = vol.getCurrentVolume();

        assertEquals(5, vol.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolumeMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.increaseVolume();
        //  int expected = 100;
        //  int actual = vol.getCurrentVolume();

        assertEquals(100, vol.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolumeMiddle() {
        Radio vol = new Radio();
        vol.setCurrentVolume(50);
        vol.increaseVolume();
        //  int expected = 100;
        //  int actual = vol.getCurrentVolume();

        assertEquals(51, vol.getCurrentVolume());
    }

//    @Test
//    public void testIncreaseVolumeOverMax() {
//        Radio vol = new Radio();
//        vol.setCurrentVolume(101);
//        vol.increaseVolume();
//        //  int expected = 100;
//        // int actual = vol.getCurrentVolume();
//
//        assertEquals(100, vol.getCurrentVolume());
//    }

    @Test
    public void testIncreaseVolumeMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.increaseVolume();
        //  int expected = 1;
        //  int actual = vol.getCurrentVolume();

        assertEquals(1, vol.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(4);
        vol.decreaseVolume();
        //   int expected = 3;
        //   int actual = vol.getCurrentVolume();

        assertEquals(3, vol.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeMin() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.decreaseVolume();
        // int expected = 0;
        // int actual = vol.getCurrentVolume();

        assertEquals(0, vol.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeMax() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);
        vol.decreaseVolume();
        // int expected = 9;
        // int actual = vol.getCurrentVolume();

        assertEquals(99, vol.getCurrentVolume());
    }

    @Test
    public void getAmount() {
        Radio rad = new Radio(20);
        assertEquals(20, rad.getAmount());
    }
}