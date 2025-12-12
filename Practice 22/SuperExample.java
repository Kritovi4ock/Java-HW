class Parent {
    String name = "Родитель";
    
    Parent(String name) {
        this.name = name;
    }
    
    void show() {
        System.out.println("Метод родителя: " + name);
    }
}

class Child extends Parent {
    String name = "Ребенок";
    
    // 1. Обращение к конструктору суперкласса
    Child() {
        super("Родитель из конструктора");
    }
    
    void display() {
        // 2. Доступ к полю суперкласса
        System.out.println("Поле ребенка: " + this.name);
        System.out.println("Поле родителя: " + super.name);
        
        // 3. Доступ к методу суперкласса
        super.show();
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}