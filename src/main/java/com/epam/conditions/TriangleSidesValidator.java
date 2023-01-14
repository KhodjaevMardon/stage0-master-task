package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        double sumOfSides = firstSide + secondSide + thirdSide;
        boolean result =
                !(firstSide * 2 >= sumOfSides) && !(secondSide * 2 >= sumOfSides) && !(thirdSide * 2 >= sumOfSides);
        System.out.println(result ? "this is a valid triangle" : "it's not a triangle");
    }

}
