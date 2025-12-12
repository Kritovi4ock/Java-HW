public class Outer {
    // Внутренний класс с public доступом
    public class PublicInner {
        void show() {
            System.out.println("Public внутренний класс");
        }
    }
    
    // Внутренний класс с protected доступом
    protected class ProtectedInner {
        void show() {
            System.out.println("Protected внутренний класс");
        }
    }
    
    // Внутренний класс с default (package-private) доступом
    class DefaultInner {
        void show() {
            System.out.println("Default внутренний класс");
        }
    }
    
    // Внутренний класс с private доступом
    private class PrivateInner {
        void show() {
            System.out.println("Private внутренний класс");
        }
    }
    
    void testAccess() {
        // Все внутренние классы доступны из внешнего класса
        PublicInner pub = new PublicInner();
        ProtectedInner prot = new ProtectedInner();
        DefaultInner def = new DefaultInner();
        PrivateInner priv = new PrivateInner();
    }
}

// Другой класс в том же пакете
class AnotherClass {
    void test() {
        Outer outer = new Outer();
        Outer.PublicInner pub = outer.new PublicInner();     // OK
        Outer.ProtectedInner prot = outer.new ProtectedInner(); // OK (в том же пакете)
        Outer.DefaultInner def = outer.new DefaultInner();   // OK (в том же пакете)
        Outer.PrivateInner priv = outer.new PrivateInner(); // ОШИБКА: private
    }
}

// Поведение спецификаторов:
// public - доступен везде
// protected - доступен в пакете и подклассах
// default - доступен только в пакете
// private - доступен только во внешнем классе