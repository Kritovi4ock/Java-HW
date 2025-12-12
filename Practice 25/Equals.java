class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Переопределяем метод equals
    @Override
    public boolean equals(Object obj) {
        // 1. Проверяем, ссылается ли obj на тот же объект (оптимизация)
        if (this == obj) {
            return true;
        }
        
        // 2. Проверяем, не является ли obj null
        if (obj == null) {
            return false;
        }
        
        // 3. Проверяем, того же ли класса объекты
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        // 4. Приводим к нужному типу
        Point other = (Point) obj;
        
        // 5. Сравниваем поля
        return x == other.x && y == other.y;
    }
    
    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}

public class Equals {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(5, 15);
        
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false
        System.out.println("p1.equals(null): " + p1.equals(null)); // false
        System.out.println("p1.equals(\"строка\"): " + p1.equals("строка")); // false
        
        // Соглашения для equals():
        // 1. Рефлексивность: x.equals(x) всегда true
        // 2. Симметричность: если x.equals(y) true, то y.equals(x) true
        // 3. Транзитивность: если x.equals(y) и y.equals(z), то x.equals(z)
        // 4. Согласованность: повторные вызовы дают одинаковый результат
        // 5. x.equals(null) всегда false
        // 6. Согласованность с hashCode(): если equals() true, то hashCode() одинаковый
    }
}