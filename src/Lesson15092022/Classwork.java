package Lesson15092022;

import java.util.Arrays;

public class Classwork {

  private int[] arrya;

    public Classwork(int[] arrya) {
        this.arrya = new int[10];
    }

    @Override
    public String toString() {
        return "Classwork{" +
                "arrya=" + Arrays.toString(arrya) +
                '}';
    }

    public boolean add(int value){
      int[] arrya2=arrya;
      arrya= new int[arrya2.length+1];
      System.arraycopy(arrya2,0,arrya,0, arrya2.length);
      arrya[arrya.length-1]=value;
        System.out.println(arrya);
      return true;
}
public int[] add(int position, int value){
        int[]arrya2=arrya;
        arrya=new int[arrya2.length+1];
        int j=0;
        for(int i =0; i<arrya.length-1; i++){
            if(i==position){
                arrya[i]=value;
            } else {
                arrya[i]=arrya2[j];
                j++;
            }
        }
    System.out.println(arrya);
        return arrya;
}
    public int get(int index){
        System.out.println(arrya);
      return arrya[index];

    }
}

