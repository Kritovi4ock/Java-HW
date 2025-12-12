// FINAL класс - от него нельзя наследовать
final class FinalClass {
    void showMessage() {
        System.out.println("Я final класс!");
    }
}

// ЭТО ВЫЗОВЕТ ОШИБКУ КОМПИЛЯЦИИ:
/*
class TryingToExtend extends FinalClass {  // ОШИБКА!
    void newMethod() {
        System.out.println("Пытаюсь наследовать final класс");
    }
}
*/

// Для сравнения - обычный класс
class NormalClass {
    void showMessage() {
        System.out.println("Я обычный класс");
    }
}

// От обычного класса можно наследовать
class ExtendedClass extends NormalClass {
    @Override
    void showMessage() {
        System.out.println("Я наследник обычного класса");
    }
}

public class FinalClassSimple {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        obj1.showMessage();
        
        ExtendedClass obj2 = new ExtendedClass();
        obj2.showMessage();
        
        System.out.println("\nОт final-класса нельзя создать наследников!");
    }
}