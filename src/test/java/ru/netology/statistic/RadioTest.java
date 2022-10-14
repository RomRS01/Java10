package ru.netology.statistic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {
    @Test
    public void shouSetStation() {
        Radio cond = new Radio();
        cond.setStation(7);
        int expected = 7;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouSetStationOverMax() {
        Radio cond = new Radio();
        cond.setStation(12);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouSetStationBelowMin() {
        Radio cond = new Radio();
        cond.setStation(-1);
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouIncreaseStation() {
        Radio cond = new Radio();
        cond.setStation(7);
        cond.increaseStation();
        int expected = 8;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouIncreaseStationOverMax() {
        Radio cond = new Radio();
        cond.setStation(9);
        cond.increaseStation();
        int expected = 0;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouReduceStation() {
        Radio cond = new Radio();
        cond.setStation(7);
        cond.reduceStation();
        int expected = 6;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouIncreaseStationBelowMin() {
        Radio cond = new Radio();
        cond.setStation(0);
        cond.reduceStation();
        int expected = 9;
        int actual = cond.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouIncreaseVolume() {
        Radio cond = new Radio();
        cond.insertVolume(7);
        cond.increaseVolume();
        int expected = 8;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shoureduceVolume() {
        Radio cond = new Radio();
        cond.insertVolume(7);
        cond.reduceVolume();
        int expected = 6;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
