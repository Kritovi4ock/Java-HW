public class Main {
    public static void main(String[] args) {
        
        // 1. Через имя класса
        System.out.println("1. Через имя класса:");
        A.printVars();
        
        // 2. Через экземпляр класса
        System.out.println("\n2. Через экземпляр класса:");
        A obj1 = new A();
        obj1.printVars();
        
        // 3. Из другого класса
        System.out.println("\n3. Из другого класса:");
        TestClass.testCall();
        
        // 4. Через наследника
        System.out.println("\n4. Через класс-наследник:");
        B bObj = new B();
        bObj.callParentStaticMethod();
        
        // 5. Демонстрация изменения статического поля
        System.out.println("\n5. Изменение статического поля:");
        System.out.println("До изменения: A.b = " + A.b);
        A.b = 42;
        System.out.println("После изменения: A.b = " + A.b);
        
        A obj2 = new A();
        obj2.printVars();  // Увидим изменение
    }
}

class TestClass {
    public static void testCall() {
        A.printVars();
    }
}
class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}
class B extends A {
    public void callParentStaticMethod() {
        // Все три способа работают
        A.printVars();
        printVars();
        B.printVars();
    }
}