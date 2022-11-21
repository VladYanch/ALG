public class Main {
    public static void main(String[] args) {
        //1
        System.out.println(xinRec(2,10, 1));
        //2
        System.out.println(xin2(2,4));

        //3
        int[] a =  {100,112,256,349,770};
        int[] b = {72,86,113,119,265,445,892};
        System.out.println(finder(a,b,7));

        //4 не доделал
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        System.out.println(repeatCount(arr,2));

    }

//     1. Даны два целых числа x и n, напишите функцию для вычисления x^n
//        решение 1 - рекурсивно O(n)
//        решение 2 - улучшить решение 1 до O(lon n)
    public static int xinRec(int a,int b, int res) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        }
        int counter = b;
        if (counter == 1) {
            return res;
        } else {
            counter--;
            res = a * xinRec(a, counter, res);
        }
        return res;
    }

// решение 2 - улучшить решение 1 до O(lon n)
    public static int xin2(int a,int b) {
        int res=1;
        for (int i = 1; i <= b; i++) {
            res = res * a;
        }
        return res;
    }
//        Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
//        Массив 1 - 100 112 256 349 770
//        Массив 2 - 72 86 113 119 265 445 892
//        к = 7
//        Вывод : 256
//        Окончательный отсортированный массив -
//        72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//        7-й элемент этого массива равен 256.
    public static int finder(int[] a, int[] b, int k) {
        if (k>(a.length+ b.length -1)){return -1;}
        int aIndex = 0;
        int bIndex = 0;
        int count  = 1;
        for (int i = 0; i < (a.length+ b.length -1); i++) {

            if (a[aIndex]>b[bIndex] && count==k) { return b[bIndex];
            } else if (a[aIndex]<b[bIndex] && count==k) {return a[aIndex];
            } else if (a[aIndex]>b[bIndex] && count!=k) {
                bIndex++;
            }   else {
                aIndex++;
            }
            count++;
        }
        return -1;
    }
//        Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[]. Ожидаемая временная сложность O(Log n)
//        arr[] = {1, 1, 2, 2, 2, 2, 3,}
//        x = 2
//        Вывод: 4 раза
    public static int repeatCount(int[] arr, int x) {
        int indexEnd= arr.length/2;
        int indexStart = 0;
        int res = 0;
        if (x>arr[arr.length-1]) {return 0;}

        for (int i = 0; indexEnd < arr.length-1; i++) {
            if (arr[indexEnd]<x) {
                indexStart = indexEnd;
                indexEnd = indexEnd + (arr.length-indexEnd)/2;
            } else if (arr[indexEnd]>x) {
                indexEnd = indexEnd/2;
            } else {

                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[indexEnd-1] == arr[indexEnd]) {
                        for (int k = indexStart; k < arr.length-1  ; k++) {
                            if (arr[k+1] == arr[k]) {
                                res++;
                            } else {return res;
                            }
                        }
                    }
                }
            }

        }
        return res;
    }


}




