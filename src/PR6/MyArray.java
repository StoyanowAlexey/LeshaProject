package PR6;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class MyArray {
    private Integer [] arr;
    private int size;
    MyArray(){
        arr = new Integer [8];
    }
    MyArray(boolean f){
        if(f) arr = new Integer [8];
        else {
                Random random = new Random();
                for (int i = 0; i < 8; i++) {
                    arr[i] = random.nextInt();
                }
        }
    }
    MyArray(int size){
        this.size = size;
        arr = new Integer[size];
    }

    MyArray(int size, boolean f){
        arr = new Integer [size];
        if(f){
            Random random = new Random();
            for(int i = 0; i < size; i++){
                arr[i] = random.nextInt();
            }
        }
    }
    MyArray(Integer[] myArray){
        myArray = arr;
    }
    void fill (int k){
        Random random = new Random();
        for(int i = 0; i < k; i++){
            arr[i] = random.nextInt(10,20);
            System.out.print(arr[i] + " ");
        }
    }
     public String toString(){
        StringBuilder ch = new StringBuilder();
        for(int i = 0; i < size; i++){
            ch.append(arr[i]).append(" ");
        }
        return ch.toString();
     }
     public int Size(){
        return size;
     }
     int get(int index){
        if(index < 0 || index > size) return -1;
        else return arr[index];
     }
     int set(int index, int newValue){
        if(index < 0 || index > size) return -1;
        else {
            int ch = arr[index];
            arr[index] = newValue;
            return ch;
        }
     }
     void sort(boolean f){
        int [] ch = new int[0];
        if(f) Arrays.sort(arr);
        else Arrays.sort(arr,Collections.reverseOrder());
     }
     Integer [] subArray(int indexFrom, int indexTo){
        Integer [] getChisla;
        getChisla = new Integer[indexTo - indexFrom];
        for(int i = indexFrom; i < indexTo; i++){
            getChisla[i] = arr[i];
        }
        return getChisla;
     }
     boolean equals (Integer [] mas1 ,Integer [] mas2) {
         boolean f = true;
         for (int i = 0; i < size; i++) {
             if (mas1[i] != mas2[i]) {
                 f = false;
                 break;
             }
         }
         return f;
     }
}
