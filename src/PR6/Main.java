package PR6;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        int size,chislo;
        boolean result;
        Integer [] subArray;
        MyArray array1 = new MyArray();
        MyArray array2 = new MyArray(true);
        MyArray array3 = new MyArray(5);
        array1.fill(8);
        array3.fill(5);
        MyArray array4 = new MyArray(new Integer[]{1, 2, 3, 4, 5});
        MyArray array5 = new MyArray(new Integer[]{1, 2, 3, 4, 5});
        MyArray array6 = new MyArray(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("Array 1: " + array1);
        System.out.println("Array 2: " + array2);
        System.out.println("Array 3: " + array3);
        System.out.println("Array 4: " + array4);
        System.out.println("Array 5: " + array5);
        System.out.println("Array 6: " + array6);
        size = array5.Size();
        System.out.print("Array 5 , size = " + size);
        chislo = array5.get(4);
        System.out.println("Array 5, index " + 4 + " chislo = " + chislo);
        System.out.println();
        System.out.println("Array 4  - " + array4);
        array4.set(0,45);
        System.out.println("New Array 4  - " + array4);
        array4.sort(false);
        System.out.println("Array 4 sort - " + array4);
        array4.sort(true);
        System.out.println("Array 4 sort - " + array4);
        subArray = array4.subArray(0,3);
        System.out.print("Array 4(index from - 0, index to - 3) - " );
        printIntegerArray(subArray);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Array 4: " + array4  + ", array 5: " + array5 + ", array 6: " + array6);
        result = array4.equals(array5);
        System.out.println("Equal? (array 4, array 5) - " + result);
        result = array6.equals(array5);
        System.out.println("Equal (array5, array6) - " + result);
        //String string = "RRR.RRR..R.R";
        //var splitarray = string.replace("R", " ");
        //System.out.println("String = " + string.replace(".", " "));
    }

    public static void printIntegerArray(Integer [] array){
         Arrays.stream(array).toList().forEach(it -> System.out.print(it + " "));
    }
    /// Integer and int ; string buider
    // разница между примитивными и обектными типами данных
}
