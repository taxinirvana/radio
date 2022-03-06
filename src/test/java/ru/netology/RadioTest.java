package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void testNext() {
        Radio cond = new Radio();

        cond.setCurrentChannelNext(8);

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrev() {
        Radio cond = new Radio();

        cond.setCurrentChannelPrev(1);

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrev1() {
        Radio cond = new Radio();

        cond.setCurrentChannelPrev(9);

        int expected = 8;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrev2() {
        Radio cond = new Radio();

        cond.setCurrentChannelPrev(0);

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }


    @Test
    public void testChannel1() {
        Radio cond = new Radio();

        cond.setCurrentChannel(9);

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChannel2() {
        Radio cond = new Radio();

        cond.setCurrentChannel(11);

        int expected = 11;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChannel3() {
        Radio cond = new Radio();

        cond.setCurrentChannel(-1);

        int expected = -1;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaximum() {
        Radio cond = new Radio();

        cond.setCurrentVolumeMax(9);

        int expected = 10;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMax() {
        Radio cond = new Radio();

        cond.setCurrentVolumeMax(11);

        int expected = 10;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxi() {
        Radio cond = new Radio();

        cond.setCurrentVolumeMax(8);

        int expected = 9;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMinimum() {
        Radio cond = new Radio();

        cond.setCurrentVolumeMin(5);

        int expected = 4;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMin() {
        Radio cond = new Radio();

        cond.setCurrentVolumeMin(-1);

        int expected = 0;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMini() {
        Radio cond = new Radio();

        cond.setCurrentVolumeMin(0);

        int expected = 0;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void test5() {
        Radio cond = new Radio();

        cond.setCurrentChannel(5);

        int expected = 5;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        Radio cond = new Radio();

        cond.setCurrentChannel(9);

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        Radio cond = new Radio();

        cond.setCurrentChannel(0);

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio cond = new Radio();

        cond.setCurrentChannelNext(1);

        int expected = 2;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio cond = new Radio();

        cond.setCurrentChannelNext(9);

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }
}