public class ConversionDemo {
    public static void main(String[] args) {
        // String → StringBuilder / StringBuffer
        String str = "Original";
        StringBuilder sbFromString = new StringBuilder(str);
        StringBuffer bufFromString = new StringBuffer(str);
        
        System.out.println("String → StringBuilder: " + sbFromString);
        System.out.println("String → StringBuffer: " + bufFromString);
        
        // StringBuilder / StringBuffer → String
        StringBuilder sb = new StringBuilder("Builder");
        StringBuffer buffer = new StringBuffer("Buffer");
        
        String strFromSB = sb.toString();
        String strFromBuffer = buffer.toString();
        
        System.out.println("StringBuilder → String: " + strFromSB);
        System.out.println("StringBuffer → String: " + strFromBuffer);
        
        // StringBuilder ↔ StringBuffer (через String)
        StringBuilder sb2 = new StringBuilder(buffer.toString());
        StringBuffer buffer2 = new StringBuffer(sb.toString());
        
        System.out.println("StringBuffer → StringBuilder: " + sb2);
        System.out.println("StringBuilder → StringBuffer: " + buffer2);
        
        // Метод append() тоже принимает String
        StringBuilder combined = new StringBuilder();
        combined.append("String: ").append(str)
                .append(" | Buffer: ").append(buffer)
                .append(" | Builder: ").append(sb);
        System.out.println(combined);
        
        // Конструкторы с копированием содержимого
        StringBuffer bufCopy = new StringBuffer(sb);
        System.out.println("StringBuffer from StringBuilder: " + bufCopy);
    }
}