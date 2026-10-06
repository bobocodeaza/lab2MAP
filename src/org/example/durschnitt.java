package org.example;

public class durschnitt {
    private int[] note;

    public durschnitt (int [] note){
      this.note=note;
    }

    public double medie(){
        int cate= note.length;
        int sum=0;
        for (int i:note){
            sum= sum+i;
        }
        double medianumerelor= (double) sum /cate;
        return Math.round(medianumerelor *100.0)/100.0;
    }
}
