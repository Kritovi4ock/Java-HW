class A {
    int a1;                    // default (package-private) - виден в том же пакете
    public int a2;             // public - виден везде
    protected int a3;          // protected - виден в пакете и подклассах
    private int a4;            // private - виден только в классе A

    void method1() {           // default - виден в том же пакете
        a4 = 10; // private доступен внутри класса A
    }

    public void method2() {    // public - виден везде
        System.out.println("public метод A");
    }

    protected void method3() { // protected - виден в пакете и подклассах
        System.out.println("protected метод A");
    }
  
    private void method4() {   // private - виден только в классе A
        System.out.println("private метод A");
    }
    
    // Метод для демонстрации доступа к private членам
    public void demonstratePrivateAccess() {
        a4 = 20; // OK - внутри класса A
        method4(); // OK - внутри класса A
    }
}

// Класс B наследует A (предполагаем, что в том же пакете)
class B extends A {
    void demonstrateAccess() {
        // Доступ к полям класса A из подкласса B:
        a1 = 1;    // OK - default, в том же пакете
        a2 = 2;    // OK - public, всегда доступен
        a3 = 3;    // OK - protected, доступен подклассу
        // a4 = 4; // ОШИБКА! private не доступен в подклассе
        
        // Доступ к методам класса A из подкласса B:
        method1(); // OK - default, в том же пакете
        method2(); // OK - public, всегда доступен
        method3(); // OK - protected, доступен подклассу
        // method4(); // ОШИБКА! private не доступен в подклассе
    }
}

// Класс C наследует B (и косвенно A)
class C extends B {
    void demonstrateAccessInGrandchild() {
        // Внутренний класс наследует все доступные члены родителей
        a1 = 10;    // OK - default, если в том же пакете
        a2 = 20;    // OK - public
        a3 = 30;    // OK - protected
        
        method1();  // OK - default, если в том же пакете
        method2();  // OK - public
        method3();  // OK - protected
    }
}

public class Practice2 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        
        // Проверка доступа из другого класса в том же пакете
        objA.a1 = 100;    // OK - default, в том же пакете
        objA.a2 = 200;    // OK - public
        objA.a3 = 300;    // OK - protected, в том же пакете
        // objA.a4 = 400; // ОШИБКА! private
        
        objA.method1();   // OK - default, в том же пакете
        objA.method2();   // OK - public
        objA.method3();   // OK - protected, в том же пакете
        // objA.method4(); // ОШИБКА! private
        
        System.out.println("Демонстрация завершена успешно!");
    }
}