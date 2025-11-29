public class StringConcatenation {
    public static void main(String[] args) {
        String name = "Егор";
        int age = 20;
        double height = 1.80;
        boolean isStudent = true;

        String info = "Имя: " + name + 
                     ", Возраст: " + age + 
                     ", Рост: " + height + 
                     ", Студент: " + isStudent;
        
        System.out.println(info);
    }
}