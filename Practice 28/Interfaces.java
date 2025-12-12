interface Interface1 {
    // Область видимости: package-private (default)
    // Доступен только в том же пакете
    // Это наиболее распространенный вариант для внутреннего использования
}

public interface Interface2 {
    // Область видимости: public
    // Доступен из любого пакета
    // Используется для публичных API
}

protected interface Interface3 {
//     // ОШИБКА КОМПИЛЯЦИИ: модификатор protected недопустим для интерфейсов верхнего уровня
//     // Интерфейсы верхнего уровня могут быть только public или package-private
}

private interface Interface4 {
//     // ОШИБКА КОМПИЛЯЦИИ: модификатор private недопустим для интерфейсов верхнего уровня
//     // Интерфейсы верхнего уровня могут быть только public или package-private
}

// Однако protected и private интерфейсы могут быть внутри классов
class OuterClass {
    // Вложенный интерфейс с protected доступом
    protected interface ProtectedInnerInterface {
        void method();
    }
    
    // Вложенный интерфейс с private доступом  
    private interface PrivateInnerInterface {
        void method();
    }
}