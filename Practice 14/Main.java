public class Main {
    public static void main(String[] args) {
        
        // Пример 1: Прямая инициализация
        A1 obj1 = new A1();
        System.out.println("1. Прямая инициализация: a = " + obj1.a);
        
        // Пример 2: В конструкторе без параметров
        A2 obj2 = new A2();
        System.out.println("2. В конструкторе без параметров: a = " + obj2.a);
        
        // Пример 3: В параметризованном конструкторе
        A3 obj3 = new A3(42);
        System.out.println("3. В параметризованном конструкторе: a = " + obj3.a);
        
        // Пример 4: В блоке инициализации
        A4 obj4 = new A4();
        System.out.println("4. В блоке инициализации: a = " + obj4.a);
        
        // Пример 5: Через вызов метода
        A5 obj5 = new A5();
        System.out.println("5. Через вызов метода: a = " + obj5.a);
        
        // Пример 6: Через цепочку конструкторов
        A6 obj6 = new A6();
        System.out.println("6. Через цепочку конструкторов: a = " + obj6.a);
        
        // Пример 7: Условная инициализация
        A7 obj7 = new A7();
        System.out.println("7. Условная инициализация: a = " + obj7.a);
        
        // Пример 8: Использование final с разными модификаторами доступа
        A8 obj8 = new A8(100);
        System.out.println("8. Разные модификаторы доступа: a = " + obj8.getA());
    }
}

// 1. Прямая инициализация
class A1 {
    public final int a = 10;
}

// 2. В конструкторе без параметров
class A2 {
    public final int a;
    
    public A2() {
        a = 20;
    }
}

// 3. В параметризованном конструкторе
class A3 {
    public final int a;
    
    public A3(int value) {
        a = value;
    }
}

// 4. В блоке инициализации
class A4 {
    public final int a;
    
    {
        a = 40;  // Блок инициализации выполняется перед конструктором
    }
    
    public A4() {
        // a уже инициализировано
    }
}

// 5. Через вызов метода
class A5 {
    public final int a = calculateValue();
    
    private int calculateValue() {
        return 50;
    }
}

// 6. Через цепочку конструкторов
class A6 {
    public final int a;
    
    public A6() {
        this(60);  // Вызов другого конструктора
    }
    
    public A6(int value) {
        a = value;  // Фактическая инициализация
    }
}

// 7. Условная инициализация
class A7 {
    public final int a = (System.currentTimeMillis() % 2 == 0) ? 70 : 71;
}

// 8. С разными модификаторами доступа
class A8 {
    private final int a;  // private final поле
    
    public A8(int value) {
        a = value;
    }
    
    public int getA() {
        return a;  // Только геттер, сеттера нет
    }
}