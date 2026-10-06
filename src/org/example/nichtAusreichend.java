package org.example;
import java.util.Arrays;

public class nichtAusreichend {
    private int[] note;

    public nichtAusreichend(int[] note) {
        this.note = note;
    }

    public int[] picat() {
        int[] ausreichendeNoten = new int[note.length];
        int index = 0;

        for (int i : note) {
            if (i > 40) {
                ausreichendeNoten[index] = i;
                index++;
            }
        }

        return Arrays.copyOf(ausreichendeNoten, index);

    }
}
