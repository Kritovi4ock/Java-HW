public class TypeInference {
    public static void main(String[] args) {
        // Компилятор сам определяет тип
        var name = "Егор";           // String
        var age = 20;                // int  
        var height = 1.80;           // double
        var isStudent = true;        // boolean
        var numbers = new int[]{1, 2, 3};  // int[]
        
        System.out.println("Тип name: " + name.getClass().getSimpleName());
        System.out.println("Имя: " + name + ", возраст: " + age);
        
        // var нельзя использовать без инициализации
        // var x;  // ОШИБКА!

        var list = new java.util.ArrayList<String>();
        list.add("Java");
        list.add("Programming");
        
        for (var item : list) {
            System.out.println(item);
        }
    }
}