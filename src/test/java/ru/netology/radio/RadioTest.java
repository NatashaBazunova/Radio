package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testCurrentStation () {
        Radio rad = new Radio ();
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetStation () {
        Radio rad = new Radio ();
        rad.setCurrentStation(7);
        int expected = 7;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetStationMin () {
        Radio rad = new Radio ();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetStationMax () {
        Radio rad = new Radio ();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetStationOverMax () {
        Radio rad = new Radio();
        rad.setCurrentStation(13);
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetStationUnderMin () {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation () {
        Radio rad = new Radio();
        rad.setCurrentStation(4);
        rad.nextStation();
        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testNextStationMin () {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testNextStationOverMax () {
        Radio rad = new Radio();
        rad.setCurrentStation(11);
        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testNextStationMax () {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testNextStationUnderMin () {
        Radio rad = new Radio();
        rad.setCurrentStation(-3);
        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testPrevStation () {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.prevStation();
        int expected = 6;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testPrevStationMax () {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prevStation();
        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testPrevStationMin () {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testPrevStationUnderMin () {
        Radio rad = new Radio();
        rad.setCurrentStation(-3);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testPrevStationOverMax () {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume () {
        Radio vol = new Radio ();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetVolume () {
        Radio vol = new Radio ();
        vol.setCurrentVolume(1);
        int expected = 1;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetVolumeMin () {
        Radio vol = new Radio ();
        vol.setCurrentVolume(0);
        int expected = 0;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetVolumeMax () {
        Radio vol = new Radio ();
        vol.setCurrentVolume(10);
        int expected = 10;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetVolumeOverMax () {
        Radio vol = new Radio ();
        vol.setCurrentVolume(21);
        int expected = 10;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetVolumeUnderMin () {
        Radio vol = new Radio ();
        vol.setCurrentVolume(-6);
        int expected = 10;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume () {
        Radio vol = new Radio();
        vol.setCurrentVolume(4);
        vol.increaseVolume();
        int expected = 5;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeMax () {
        Radio vol = new Radio();
        vol.setCurrentVolume(10);
        vol.increaseVolume();
        int expected = 10;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeOverMax () {
        Radio vol = new Radio();
        vol.setCurrentVolume(17);
        vol.increaseVolume();
        int expected = 10;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeMin () {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.increaseVolume();
        int expected = 1;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume () {
        Radio vol = new Radio();
        vol.setCurrentVolume(4);
        vol.decreaseVolume();
        int expected = 3;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeMin () {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);
        vol.decreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeMax () {
        Radio vol = new Radio();
        vol.setCurrentVolume(10);
        vol.decreaseVolume();
        int expected = 9;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
}