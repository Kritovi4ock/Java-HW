import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9};
        int[] arr2 = {5, 3, 8, 1, 9};
        int[] arr3 = {1, 3, 5, 8, 9};
        
        // toString - красивый вывод массива
        System.out.println("toString: " + Arrays.toString(arr));
        
        // sort - сортировка
        Arrays.sort(arr);
        System.out.println("После sort: " + Arrays.toString(arr));
        
        // binarySearch - поиск в отсортированном массиве
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("binarySearch 8: " + index);
        
        // equals - сравнение массивов
        boolean equal = Arrays.equals(arr, arr2);
        System.out.println("equals arr и arr2: " + equal);
        
        // compare - сравнение с порядком (Java 9+)
        int comparison = Arrays.compare(arr, arr3);
        System.out.println("compare arr и arr3: " + comparison);
    }
}