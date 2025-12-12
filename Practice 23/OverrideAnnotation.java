class Parent {
    void showMessage() {
        System.out.println("Сообщение из родителя");
    }
    
    void displayInfo(String text) {
        System.out.println("Информация: " + text);
    }
}

class Child extends Parent {
    // Без @Override - это новый метод, а не переопределение
    void showmessage() {  // Ошибка в имени метода (m прописная вместо строчной)
        System.out.println("Сообщение из ребенка");
    }
    
    // С @Override - компилятор проверит, что метод действительно переопределяется
    @Override
    void displayInfo(String text) {  // OK - метод существует в родителе
        System.out.println("Детская информация: " + text);
    }
    
    // @Override поможет найти ошибку:
    @Override
    void displayInfo(int number) {  // ОШИБКА КОМПИЛЯЦИИ!
        // Метод с такими параметрами не существует в родителе
    }
}

public class OverrideAnnotation {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        
        parent.showMessage();  // Сообщение из родителя
        child.showMessage();   // Сообщение из родителя (не переопределен!)
        child.showmessage();   // Сообщение из ребенка (это новый метод)
        
        System.out.println("\nБез @Override легко допустить ошибку в имени метода.");
        System.out.println("С @Override компилятор сразу укажет на проблему.");
    }
}