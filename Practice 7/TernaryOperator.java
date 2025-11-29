public class TernaryOperator {
    public static void main(String[] args) {
        int a = 2;
        
        // Исходный код с if-else
        int i = 0;
        if (a == 1) {
            i = 1;
        } else if (a == 2) {
            i = 2;
        } else {
            i = 3;
        }
        System.out.println("if-else результат: " + i);
        
        // Тот же код через тернарный оператор
        int j = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println("тернарный оператор результат: " + j);
    }
}