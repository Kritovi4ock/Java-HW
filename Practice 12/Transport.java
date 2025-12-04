// Базовый класс
public class Transport {
    protected String model;
    protected int maxSpeed;
    
    public Transport(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    
    // Метод для переопределения
    public void move() {
        System.out.println(model + " движется");
    }
    
    public void displayInfo() {
        System.out.println("Модель: " + model + ", Макс. скорость: " + maxSpeed + " км/ч");
    }
    
    // Метод с реализацией по умолчанию
    public String getDescription() {
        return "Это транспортное средство";
    }
}

// Подкласс 1 - переопределяем метод move()
class Car extends Transport {
    private int doorsCount;
    
    public Car(String model, int maxSpeed, int doorsCount) {
        super(model, maxSpeed);
        this.doorsCount = doorsCount;
    }
    
    // Переопределение метода move()
    @Override
    public void move() {
        System.out.println(model + " едет по дороге на колесах");
    }
    
    // Добавляем новый метод
    public void honk() {
        System.out.println(model + " сигналит: Би-бип!");
    }
    
    // Переопределяем с дополнительной функциональностью
    @Override
    public String getDescription() {
        return super.getDescription() + " - автомобиль с " + doorsCount + " дверьми";
    }
}

// Подкласс 2 - переопределяем метод move() по-другому
class Airplane extends Transport {
    private int wingspan;
    
    public Airplane(String model, int maxSpeed, int wingspan) {
        super(model, maxSpeed);
        this.wingspan = wingspan;
    }
    
    // Переопределение метода move()
    @Override
    public void move() {
        System.out.println(model + " летит в небе на высоте 10000 метров");
    }
    
    // Переопределяем с расширением функциональности
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызываем родительский метод
        System.out.println("Размах крыльев: " + wingspan + " метров");
    }
}

// Подкласс 3 - НЕ переопределяем метод move()
class Bicycle extends Transport {
    
    public Bicycle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    
    // Не переопределяем move() - будет использоваться родительская реализация
}