class Parent {
    // Обычный метод - можно переопределить
    void normalMethod() {
        System.out.println("Обычный метод родителя");
    }
    
    // FINAL метод - НЕЛЬЗЯ переопределить
    final void finalMethod() {
        System.out.println("Final метод родителя");
    }
}

class Child extends Parent {
    // Можно переопределить обычный метод
    @Override
    void normalMethod() {
        System.out.println("Переопределенный метод в ребенке");
    }
    
    // ЭТО ВЫЗОВЕТ ОШИБКУ КОМПИЛЯЦИИ:
    /*
    @Override
    void finalMethod() {  // ОШИБКА!
        System.out.println("Пытаюсь переопределить final-метод");
    }
    */
}

public class FinalMethodSimple {
    public static void main(String[] args) {
        Child child = new Child();
        
        child.normalMethod();    // Работает - метод переопределен
        child.finalMethod();     // Работает - использует метод родителя
        
        System.out.println("\nFinal-метод нельзя изменить в классе-наследнике!");
    }
}