package ru.netology.sqr;

public class SQRService {

    public int countSquares(int minimum, int maximum) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= minimum && i * i <= maximum) {
                 {
                    counter++;

                }

            }

        }
        return counter;
    }

}
