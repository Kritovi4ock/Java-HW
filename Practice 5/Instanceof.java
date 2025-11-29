class Animal {}
class Dog extends Animal {}

public class Instanceof {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal nullAnimal = null;
        
        // Проверки instanceof
        System.out.println(dog instanceof Animal);    // true
        System.out.println(animal instanceof Dog);   // false
        System.out.println(nullAnimal instanceof Animal); // false
        
        // Практическое использование
        if (dog instanceof Animal) {
            System.out.println("Собака - это животное");
        }
    }
}