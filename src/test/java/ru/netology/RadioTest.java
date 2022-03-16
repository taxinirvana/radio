package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    //тесты на переключение канала на +1
    @Test
    public void testNext() {
        Radio cond = new Radio();
        cond.setCurrentChannel(8);
        cond.CurrentChannelNext();

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testNext1() {
        Radio cond = new Radio();
        cond.setCurrentChannel(-1);

        cond.CurrentChannelNext();


        int expected = 1;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testNext2() {
        Radio cond = new Radio();
        cond.setCurrentChannel(9);

        cond.CurrentChannelNext();

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testNext3() {
        Radio cond = new Radio();
        cond.setCurrentChannel(10);

        cond.CurrentChannelNext();

        int expected = 1;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    // тесты на переключение канала на -1
    @Test
    public void testPrev() {
        Radio cond = new Radio();
        cond.setCurrentChannel(-1);
        cond.CurrentChannelPrev();

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrev1() {
        Radio cond = new Radio();
        cond.setCurrentChannel(0);
        cond.CurrentChannelPrev();

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrev2() {
        Radio cond = new Radio();
        cond.setCurrentChannel(1);
        cond.CurrentChannelPrev();

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    //тесты на выбор канала нажатием кнопки
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

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChannel3() {
        Radio cond = new Radio();

        cond.setCurrentChannel(-1);

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChannel4() {
        Radio cond = new Radio();

        cond.setCurrentChannel(5);

        int expected = 5;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChannel5() {
        Radio cond = new Radio();

        cond.setCurrentChannel(9);

        int expected = 9;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void testChannel6() {
        Radio cond = new Radio();

        cond.setCurrentChannel(0);

        int expected = 0;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }


    //тесты на увеличение громкости на 1
    @Test
    public void testMaximum() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

        cond.VolumeMax();

        int expected = 10;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);
        cond.VolumeMax();

        int expected = 10;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxi() {
        Radio cond = new Radio();
        cond.setCurrentVolume(8);
        cond.VolumeMax();

        int expected = 9;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //тесты на уменьшение громкости -1
    @Test
    public void testMinimum() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        cond.VolumeMin();

        int expected = 4;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);
        cond.VolumeMin();

        int expected = 0;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMini() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.VolumeMin();

        int expected = 0;

        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void testNext3hfkrikuh() {
        Radio cond = new Radio();
        cond.setCurrentChannel(0);
        cond.CurrentChannelNext();

        int expected = 1;

        int actual = cond.getCurrentChannel();

        assertEquals(expected, actual);
    }
}