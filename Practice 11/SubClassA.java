package packageA;

public class SubClassA extends ClassA {
    public void testAccess() {
        System.out.println("Внутри SubClassA (тот же пакет):");
        
        // public - доступен
        System.out.println("  public: " + publicField);
        
        // protected - доступен (подкласс в том же пакете)
        System.out.println("  protected: " + protectedField);
        
        // default - доступен (тот же пакет)
        System.out.println("  default: " + defaultField);
        
        // private - НЕ доступен
        // System.out.println(privateField); // ОШИБКА КОМПИЛЯЦИИ!
        System.out.println("  private: " + getPrivateField()); // Доступ через метод
    }
}