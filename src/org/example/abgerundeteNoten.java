package org.example;
import java.util.Arrays;

public class abgerundeteNoten {
    private int[] note;

    public abgerundeteNoten(int[] note) {
        this.note = note;
    }

    public int[] rotunjit() {
        int[] noterotunjite = new int[note.length];

        for (int i : note) {
            if (i < 38) {
                continue;
            } else if ((i + 3)% 5 == 0) {
                i = i + 3;
            } else if ((i + 2) % 5 == 0) {
                i = i + 3;
            } else if ((i + 1) % 5 == 0) {
                i = i + 3;
            } else {
                continue;
            }
        }
    return note;
    }
}
