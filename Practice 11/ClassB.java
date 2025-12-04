package packageB;

import packageA.ClassA;

public class ClassB {
    public void testAccess() {
        ClassA obj = new ClassA();
        System.out.println("Внутри ClassB (другой пакет, не наследник):");
        
        // public - доступен
        System.out.println("  public: " + obj.publicField);
        
        // protected - НЕ доступен (не наследник)
        // System.out.println(obj.protectedField); // ОШИБКА!
        
        // default - НЕ доступен (другой пакет)
        // System.out.println(obj.defaultField); // ОШИБКА!
        
        // private - НЕ доступен
        // System.out.println(obj.privateField); // ОШИБКА!
        
        System.out.println("  private через метод: " + obj.getPrivateField());
    }
}