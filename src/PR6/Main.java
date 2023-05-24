package PR6;

public class Main {
    public static void main(String [] args){
        int size,chislo;
        boolean result;
        MyArray array1 = new MyArray();
        MyArray array2 = new MyArray(true);
        MyArray array3 = new MyArray(5);
        array3.fill(5);
        MyArray array4 = new MyArray(new Integer[]{1, 2, 3, 4, 5});
        MyArray array5 = new MyArray(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("Array 1: " + array3);
        size = array5.Size();
        System.out.print("Array 5 , size = " + size);
        chislo = array5.get(4);
        System.out.println("Array 5, index " + 4 + " chislo = " + chislo);
        array4.set(0,45);
        array4.sort(true);

    }
    // Integer and int ; string buider
}
