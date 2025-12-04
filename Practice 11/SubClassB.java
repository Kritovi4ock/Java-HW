package packageB;

import packageA.ClassA;

public class SubClassB extends ClassA {
    public void testAccess() {
        System.out.println("Внутри SubClassB (другой пакет, но наследник):");
        
        // public - доступен
        System.out.println("  public: " + publicField);
        
        // protected - доступен (наследник)
        System.out.println("  protected: " + protectedField);
        
        // default - НЕ доступен (другой пакет)
        // System.out.println(defaultField); // ОШИБКА!
        
        // private - НЕ доступен
        // System.out.println(privateField); // ОШИБКА!
        System.out.println("  private через метод: " + getPrivateField());
    }
}