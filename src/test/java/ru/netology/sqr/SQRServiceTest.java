package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void countSquaresBorders() {
        SQRService service = new SQRService();
        int minimum = 200;
        int maximum = 300;
        int expected = 3;
        int actual = service.countSquares(minimum, maximum);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSquaresMaximum() {
        SQRService service = new SQRService();
        int minimum = 10;
        int maximum = 11000;
        int expected = 90;
        int actual = service.countSquares(minimum, maximum);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSquaresMaximumZero() {
        SQRService service = new SQRService();
        int minimum = 10000;
        int maximum = 11000;
        int expected = 0;
        int actual = service.countSquares(minimum, maximum);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSquaresFiveThousand() {
        SQRService service = new SQRService();
        int minimum = 100;
        int maximum = 5000;
        int expected = 61;
        int actual = service.countSquares(minimum, maximum);
        assertEquals(expected, actual);
    }

    @Test
    void countSquaresMinimum() {
        SQRService service = new SQRService();
        int minimum = 0;
        int maximum = 100;
        int expected = 1;
        int actual = service.countSquares(minimum, maximum);
        assertEquals(expected, actual);
    }
    @Test
    void countSquaresMinimumZero() {
        SQRService service = new SQRService();
        int minimum = 0;
        int maximum = 99;
        int expected = 0;
        int actual = service.countSquares(minimum, maximum);
        assertEquals(expected, actual);
    }
}