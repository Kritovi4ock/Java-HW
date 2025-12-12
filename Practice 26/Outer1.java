public class Outer1 {
    private String privateField = "private поле";
    protected String protectedField = "protected поле";
    String defaultField = "default поле";
    public String publicField = "public поле";
    
    private void privateMethod() {
        System.out.println("private метод");
    }
    
    protected void protectedMethod() {
        System.out.println("protected метод");
    }
    
    void defaultMethod() {
        System.out.println("default метод");
    }
    
    public void publicMethod() {
        System.out.println("public метод");
    }
    
    // Внутренний класс
    class Inner {
        void accessOuter() {
            // Внутренний класс имеет доступ ко ВСЕМ полям и методам внешнего класса
            // независимо от спецификаторов доступа
            
            System.out.println(privateField);    // OK
            System.out.println(protectedField);  // OK  
            System.out.println(defaultField);    // OK
            System.out.println(publicField);     // OK
            
            privateMethod();     // OK
            protectedMethod();   // OK
            defaultMethod();     // OK
            publicMethod();      // OK
            
            // Также можно получить ссылку на внешний класс
            Outer1.this.publicMethod(); // Явное обращение через Outer.this
        }
    }
}