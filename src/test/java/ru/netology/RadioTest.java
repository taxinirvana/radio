package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void test() {
        Radio cond = new Radio();

        cond.setCurrentChannelNext(8);

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Radio cond = new Radio();

        cond.setCurrentChannelPrev(1);

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio cond = new Radio();

        cond.setCurrentChannel(9);

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio cond = new Radio();

        cond.setCurrentVolumeMax(9);

        int expected = 10;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio cond = new Radio();

        cond.setCurrentVolumeMin(1);

        int expected = 0;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }


}