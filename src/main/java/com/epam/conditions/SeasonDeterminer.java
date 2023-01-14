package com.epam.conditions;

import java.lang.ref.WeakReference;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String ans;
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            ans = "Winter";
        } else if (monthNumber > 2 && monthNumber < 6) {
            ans = "Spring";
        } else if (monthNumber > 5 && monthNumber < 9) {
            ans = "Summer";
        } else if (monthNumber > 8 && monthNumber < 12) {
            ans = "Autumn";
        } else {
            ans = "Wrong month number";
        }
        System.out.println(ans);
    }

}
