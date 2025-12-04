public class A {
    public void printNum(Integer i)
    {
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i)
    {
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f)
    {
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n)
    {
        System.out.println("Number=" + n);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        
        // Все элементы имеют компиляционный тип Number
        Number[] num = {new Integer(1), 11, 1.11f, 11.11 };
        
        System.out.println("(1) В цикле (все аргументы имеют тип Number):");
        // В цикле n имеет тип Number
        // Компилятор на этапе компиляции выбирает printNum(Number n)
        for (Number n : num) {
            a.printNum(n);  // Всегда вызовет printNum(Number n)
        }
        
        System.out.println("\n(2) Отдельные вызовы (фактические типы аргументов):");
        // Здесь компилятор видит фактические типы аргументов
        
        a.printNum(new Integer(1));  // Integer -> printNum(Integer i)
        a.printNum(11);              // int -> printNum(int i)  
        a.printNum(1.11f);           // float -> автоупаковка в Float -> printNum(Float f)
        a.printNum(11.11);           // double -> автоупаковка в Double -> printNum(Number n)
    }
}

/* Вывод
(1) В цикле:
Number=1
Number=11
Number=1.11
Number=11.11

(2) Отдельные вызовы:
Integer = 1
int = 11
Float = 1.1100
Number=11.11
*/