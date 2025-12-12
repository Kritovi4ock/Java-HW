class A {
    int a;
    int b;
    int c;
    int z;
    
    public A() {
        this(0, 0, 0);  // Вызов конструктора с 3 параметрами
    }
    
    public A(int a) {
        this(a, 0, 0);  // Вызов конструктора с 3 параметрами
    }
    
    public A(int a, int b) {
        this(a, b, 0);  // Вызов конструктора с 3 параметрами
    }
    
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;  // Общая часть для всех конструкторов
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(10);
        A obj3 = new A(10, 20);
        A obj4 = new A(10, 20, 30);
        
        System.out.println("Все конструкторы используют this() для вызова основного");
    }
}