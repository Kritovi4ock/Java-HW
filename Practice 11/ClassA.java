package packageA;

public class ClassA {
    // 1. public - доступен везде
    public String publicField = "public Field";
    
    // 2. protected - доступен в пакете и подклассах
    protected String protectedField = "protected Field";
    
    // 3. default (package-private) - доступен только в пакете
    String defaultField = "default Field";
    
    // 4. private - доступен только в этом классе
    private String privateField = "private Field";
    
    // Методы для демонстрации доступа к приватному полю
    public String getPrivateField() {
        return privateField; // Доступ из того же класса - РАЗРЕШЕНО
    }
    
    public void showAllFields() {
        System.out.println("Внутри ClassA:");
        System.out.println("  " + publicField);
        System.out.println("  " + protectedField);
        System.out.println("  " + defaultField);
        System.out.println("  " + privateField);
    }
}