public class Main {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(task1(arr, 3));
        System.out.println(task1(arr, 12));

        System.out.println("=================================================");


        int[] a1 = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int[] a2 = new int[] { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        int[] a3 = new int[] { 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int[] a4 = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
        int[] a5 = new int[] { 1 };

        System.out.println(task2(a1));
        System.out.println(task2(a2));
        System.out.println(task2(a3));
        System.out.println(task2(a4));
        System.out.println(task2(a5));
    }

    /* TODO
     *   Шаг 1: Обход массива
     *   Шаг 2: Сопоставьте ключевой элемент с элементом массива
     *   Шаг 3: Если ключевой элемент найден, верните позицию индекса элемента массива.
     *   Шаг 4: Если ключевой элемент не найден, верните -1
     * */

    public static int task1(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }


    /* TODO
     *   Шаг 1: Обход массива через один элемент
     *   Шаг 2: Если элемент отличается от первого то мы нашли не задублированный элемент
     *   Шаг 3: Вернем элемент
     *   Шаг 4: Если ключевой элемент не найден, верните -1 или что то еще :)
     *   ...
     *   Шаг 5: Исправить ошибку ArrayIndexOutOfBoundsException
     *
     * */

    public static int task2(int[] arr) {
        int l = arr.length;

        if (l == 1) {
            return arr[0];
        }

        if (arr[l - 1] != arr[l - 2]) {
            return arr[l - 1];
        }

        for (int i = 0; i < l - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }
}