package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        System.out.println(power(numberToPrint, power));
    }

    private int power(int num, int pow) {
        if (pow == 0) return 1;
        if (pow == 1) return num;

        int result = power(num, pow / 2);
        return pow % 2 == 0 ? result * result : result * result * num;
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
