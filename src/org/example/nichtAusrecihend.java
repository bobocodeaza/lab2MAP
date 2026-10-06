package org.example;

public class nichtAusrecihend {
    private int[] note;

    public nichtAusrecihend(int[] note){
        this.note = note;
    }

    int[] ausreichendeNoten = new int[100];
    int index=0;

    public int[] picat() {
        for (int i : note){
            if (i<40){
                ausreichendeNoten[index]=i;
                index++;
            }
        }
        return ausreichendeNoten;
    }

}
