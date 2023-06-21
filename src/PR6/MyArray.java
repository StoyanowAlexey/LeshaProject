package PR6;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
public class MyArray {
    private Integer [] arr;
    private int size;
    MyArray(){
        arr = new Integer [8];
        size = arr.length;
    }
    MyArray(boolean f){
        arr = new Integer [8];
        size = arr.length;
        if(f) {
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(1, 10);
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
        arr = myArray;
        size = arr.length;
    }
    void fill (int k){
        Random random = new Random();
        for(int i = 0; i < k; i++){
            arr[i] = random.nextInt(10,20);
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
        return arr != null ? arr.length : 0;
     }
     int get(int index){
        if(index < 0 || index > size)
            return -1;
        else
            return arr[index];
     }
     int set(int index, int newValue){
        if(index < 0 || index > size - 1) return -1;
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
     //@Override
     /*boolean equals (MyArray mas2) {
         boolean f = true;
         for (int i = 0; i < size; i++) {
             if (arr[i] != mas2[i] || arr.length != mas2.length) {
                 f = false;
                 break;
             }
         }
         return f;
     }
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArray myArray = (MyArray) o;
        boolean f = true;
        if(myArray.size != ((MyArray) o).size) f = false;
        else {
            for(int i = 0; i < myArray.size; i++){
                if(((MyArray) o).arr[i] != this.arr[i]) {
                    f = false;
                    break;
                }
            }
        }
        return f;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }
}
//