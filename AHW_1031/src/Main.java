public class Main {
    public static void main(String[] args) {
        //First level: 1. Linear Search
        //    Given an array arr[] of N elements,
        //    the challenge is to write a function to find a given element x in arr[].
        int item = 7;
        int index = 0;
        int[] arr = {2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8};

        index = itemFinder(item, arr);
        if (index>0) {
            System.out.println("Символ " + item +" найден в массиве индекс: "+index);
            System.out.println(toString(arr));
        } else {
            System.out.println("Символ " + item + " не найден в массиве");
        }

    // Variant 2
    //    Find the element that appears once in a sorted array
    //    Given a sorted array in which all elements occur twice
    //    (one after the other) and one element appears only once.
        index = 0;
        item =0;
        index = findNotDouble (arr);
        int[] arr1 = new int[arr.length + 1];
        if (index!= -1) {
            for (int i = 0; i < index ; i=i+2) {
                arr1[i] = arr[i];
                arr1[i+1] = arr[i+1];
            }
            item=arr1[index]=arr1[index+1]=arr[index];
            System.out.println("Непарный символ " + item +" найден в массиве индекс: "+index);
            for (int i = index+2; i < arr.length ; i=i+2) {
                arr1[i] = arr[i];
                arr1[i+1] = arr[i];
            }
        }
        index++;
        System.out.println("В массив добавлен символ " + item + " в позицию: "+index);
        System.out.println(toString(arr1));
    }
    public static int itemFinder(int item, int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        int i = -1;
        return i;
    }

    public static int findNotDouble (int[] arr) {
        for (int i = 0; i < arr.length; i=i+2) {
            if (arr[i] != arr[i+1]) {
                return i;
            }
        }
        int i = -1;
        return i;
    }

    public static StringBuilder toString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append((arr[i])).append(" ");
        }
        return stringBuilder;
    }
}