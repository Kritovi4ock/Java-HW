class Calculator {
    // Перегруженные методы - одинаковое имя, разные параметры
    
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    String add(String a, String b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(5, 3));        // 8
        System.out.println(calc.add(5, 3, 2));     // 10
        System.out.println(calc.add(5.5, 3.2));    // 8.7
        System.out.println(calc.add("Hello", " World")); // Hello World
    }
}