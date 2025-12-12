class Parent {
    protected String name = "Родитель";
    
    void display() {
        System.out.println("Метод родителя: " + name);
    }
}

class Child extends Parent {
    private String name = "Ребенок"; // Скрывает поле родителя
    
    void display() {
        // Используем super для обращения к методу родителя
        super.display();
        
        // Используем super для обращения к полю родителя
        System.out.println("Поле родителя через super: " + super.name);
        
        // Используем this для обращения к полю текущего класса
        System.out.println("Поле ребенка через this: " + this.name);
        
        // Можно и без this, но тогда будет использоваться поле текущего класса
        System.out.println("Поле ребенка без this: " + name);
    }
    
    void show() {
        // Вызываем display() из текущего класса (переопределенный метод)
        this.display();
        
        // Вызываем display() из родительского класса
        super.display();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        System.out.println("\n--- Вызов show() ---");
        child.show();
    }
}