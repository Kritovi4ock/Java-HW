public class BreakContinue {
    public static void main(String[] args) {
        // break - выход из цикла
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break; // выходим при i=3
            System.out.println("i = " + i);
        }
        // Вывод: i = 1, i = 2
        
        // continue - пропуск итерации
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // пропускаем i=3
            System.out.println("j = " + i);
        }
        // Вывод: j = 1, j = 2, j = 4, j = 5
    }
}