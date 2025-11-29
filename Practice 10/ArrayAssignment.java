public class ArrayAssignment {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};

        System.out.println("a1[0] = " + a1[0]); // 1
        System.out.println("a2[0] = " + a2[0]); // 6
        
        a1 = a2; // a1 теперь ссылается на тот же массив, что и a2

        System.out.println("a1[0] = " + a1[0]); // 6
        System.out.println("a2[0] = " + a2[0]); // 6
        
        a1[0] = 100; // меняем через a1

        System.out.println("a1[0] = " + a1[0]); // 100
        System.out.println("a2[0] = " + a2[0]); // 100 (та же ссылка!)
    }
}