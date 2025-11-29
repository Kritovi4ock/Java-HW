public class SwitchTypes {
    public static void main(String[] args) {
        // 1. Целочисленные типы
        byte byteValue = 1;
        switch(byteValue) {
            case 1: System.out.println("byte 1"); break;
            case 2: System.out.println("byte 2"); break;
        }
        
        short shortValue = 10;
        switch(shortValue) {
            case 10: System.out.println("short 10"); break;
            case 20: System.out.println("short 20"); break;
        }
        
        int intValue = 100;
        switch(intValue) {
            case 100: System.out.println("int 100"); break;
            case 200: System.out.println("int 200"); break;
        }
        
        // 2. char
        char charValue = 'A';
        switch(charValue) {
            case 'A': System.out.println("char A"); break;
            case 'B': System.out.println("char B"); break;
        }
        
        // 3. String
        String stringValue = "hello";
        switch(stringValue) {
            case "hello": System.out.println("string hello"); break;
            case "world": System.out.println("string world"); break;
        }
        
        // 4. Enum
        Color color = Color.RED;
        switch(color) {
            case RED: System.out.println("enum RED"); break;
            case GREEN: System.out.println("enum GREEN"); break;
        }
        
        // 5. Byte, Short, Integer, Character (автораспаковка)
        Integer integerValue = 5;
        switch(integerValue) {
            case 5: System.out.println("Integer 5"); break;
            case 10: System.out.println("Integer 10"); break;
        }
    }
    
    enum Color { RED, GREEN, BLUE }
}