public class TypeConversion {
    public static void main(String[] args) {
        int a = 120;
        
        byte b = a + 10;        // ОШИБКА КОМПИЛЯЦИИ!
        // Нужно явное приведение, т.к. a + 10 = int (130), 
        // а byte может хранить только до 127
        
        byte c = (byte)(a + 10);   // 130 в byte = -126
        
        byte d = a + 1;         // ОШИБКА КОМПИЛЯЦИИ!
        // Аналогично - результат int, нужен casting
        
        System.out.println("c = " + c);  // c = -126
    }
}