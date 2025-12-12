public class Outer2 {
    // Внешний класс создает объект внутреннего класса
    Inner inner = new Inner();
    
    void accessInner() {
        // Внешний класс имеет доступ к внутреннему классу
        // согласно обычным правилам доступа Java
        
        System.out.println(inner.publicField);     // OK
        System.out.println(inner.protectedField);  // OK (в том же классе)
        System.out.println(inner.defaultField);    // OK (в том же классе)
        System.out.println(inner.privateField);    // OK (в том же классе)
        
        inner.publicMethod();     // OK
        inner.protectedMethod();  // OK (в том же классе)
        inner.defaultMethod();    // OK (в том же классе)
        inner.privateMethod();    // OK (в том же классе)
    }
    
    // Внутренний класс
    class Inner {
        private String privateField = "private";
        String defaultField = "default";
        protected String protectedField = "protected";
        public String publicField = "public";
        
        private void privateMethod() {
            System.out.println("private метод inner");
        }
        
        void defaultMethod() {
            System.out.println("default метод inner");
        }
        
        protected void protectedMethod() {
            System.out.println("protected метод inner");
        }
        
        public void publicMethod() {
            System.out.println("public метод inner");
        }
    }
}

// В другом классе доступ ограничен
class AnotherClass {
    void test() {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        
        System.out.println(inner.publicField);     // OK
        // System.out.println(inner.protectedField); // ОШИБКА: разный класс
        // System.out.println(inner.defaultField);   // ОШИБКА: разный класс
        // System.out.println(inner.privateField);   // ОШИБКА: private
        
        inner.publicMethod();     // OK
        // inner.protectedMethod(); // ОШИБКА: разный класс
        // inner.defaultMethod();   // ОШИБКА: разный класс  
        // inner.privateMethod();   // ОШИБКА: private
    }
}