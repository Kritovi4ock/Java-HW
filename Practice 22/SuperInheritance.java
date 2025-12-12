class A {
    int a = 10;
    
    void method() {
        System.out.println("Метод из класса A");
    }
}

class B extends A {
    // НЕ переопределяем метод и не определяем переменную a
}

class C extends B {
    void method() {
        // super.a и super.method() обратятся к классу A
        int a = super.a;          // Получит a = 10 из класса A
        super.method();           // Вызовет method() из класса A
        
        System.out.println("a = " + a);
    }
}

public class SuperInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.method();
        
        // Ответ: super найдет метод и переменную в ближайшем родителе,
        // который их имеет (в данном случае - класс A)
    }
}