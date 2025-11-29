public class ScopeExample {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 2;  // b видна только внутри этого блока
        }
        int c = a + b;  // ОШИБКА КОМПИЛЯЦИИ!
        // Переменная b не видна за пределами своего блока

    }
}