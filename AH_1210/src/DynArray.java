import java.lang.reflect.Array;
import java.util.Arrays;

public class DynArray {

    public int[] arr;
    public int indexLast = 0;
    public int capacity = 1;

    public DynArray() {
        this.arr = new int[1];
        this.indexLast = 0;
        this.capacity = 1;
   }

    //    Добавляет элемент в конец
    public void add(int value) {
        if (indexLast == capacity) {
             this.arr=changeSize();}
        arr[indexLast]=value;
        indexLast++;
    }


    public int[] changeSize() {
        int[] arrNew = new int[arr.length*2];
        for (int i : arr) {
            arrNew[i] = arr[i];
        }
        capacity = capacity*2;
        return arrNew;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}
