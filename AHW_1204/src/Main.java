import java.util.Arrays;
import java.util.Random;

public class Main {
    /*
    1. На основе кода из гита выполнить сравнение производительности алгоритмов bubble sort и quick sort
    при количестве элементов в 1000, 10000, 1000000 (Опционально можно применить эти же проверки к merge sort)
    Вычислить скорость выполнения обоих алгоритмов сортировки в наносекундах (использовать System.nanoTime) до и после выполнения метода
     */

    public static void main(String[] args) {
        //test(10);
        test(1000);
        test(10000);
//        test(1000000); // программа виснет без причин и не досчитывает
    }

    private static void test(int size) {
        Random r = new Random();

        int[] arr = new int[size];
        int[] arrCopy = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt() % size;
            arrCopy[i] = arr[i];
        }
//        System.out.println(Arrays.toString(arr));

        long start;
        long stop;

        // bubble sort
        long bubbleCount = 0;
        start = System.nanoTime();
        bubbleCount = bubbleSort(arr);
        stop = System.nanoTime();
//        System.out.println(Arrays.toString(arr));

        System.out.println("Bubble sort, size " + size +  " count " + bubbleCount + " time= "+ ((stop - start) / 1_000_000_000.0));

        // quick sort
        long quickCount = 0;
        start = System.nanoTime();
        QuickSort.quickSort(arrCopy);
        stop = System.nanoTime();
        System.out.println("Quick sort, size " + size +  " count " + QuickSort.count + " time= " + ((stop - start) / 1_000_000_000.0));

        System.out.println("Quick sort is " + ((float) bubbleCount / QuickSort.count)+ " faster");
    }

    static long bubbleSort(int[] arr) {
        // Написать условия циклов
        // Выполнить сравнение каждого элемента с каждым
        // Если текущий элемент больше следующего, поменять их местами
        long count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // swap elements if first > second

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return count += 1;
    }
}