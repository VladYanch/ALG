import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DynArray arr;
        arr = new DynArray();
        arr.add(1);
        System.out.println(arr);
        arr.add(2);
        System.out.println(arr);
        System.out.println(arr.capacity);

//        так и не понял как один массив другим подменять
    }
//    Реализовать динамический массив, который при добавлении элементов
//    увеличивает свой размера в 2 раза, если места для добавления элемента оказывается недостаточно.
//    У динамического массива должны быть следующие методы:
//    add(int value): void | Добавляет элемент в конец
//    addAt(int index, int value) : void | Добавляет элемент по индексу со сдвигом всех элементов начиная с текущего и до последнего на 1
//    get(int index): int | Возвращает элемент по индексу
//    remove(): void | Удаляет последний элемент
//    removeAt(int index): void | Удаляет элемент по индексу
//    set(int index, int value): void | Меняет значение элемента по индексу на указанное
//    contains(int value): boolean | Проверяет, присутствует ли указанный элемент в списке
//8 size(): int | Возвращает размер списка
//    clear(): void | Удаляет все элементы из списка, размер списка становится изначальным
//    shrinkSize(): void | Уменьшает массив до размера, равного количеству элементов в нем
}