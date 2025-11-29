/**
 * Класс для выполнения математических операций.
 * 
 * @author Егор Коваль
 * @version 1.0
 * @since 2025
 */
public class Calculator {
    
    /**
     * Константа PI с значением 3.14159
     */
    public static final double PI = 3.14159;
    
    /**
     * Складывает два целых числа.
     * 
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     * @see #subtract(int, int)
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Вычитает второе число из первого.
     * 
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Вычисляет площадь круга по радиусу.
     * 
     * @param radius радиус круга
     * @return площадь круга
     * @throws IllegalArgumentException если радиус отрицательный
     */
    public double calculateCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        return PI * radius * radius;
    }
    
    /**
     * Устаревший метод для вычисления квадрата числа.
     * Используйте {@link #power(double, double)} вместо этого.
     * 
     * @param number число для возведения в квадрат
     * @return квадрат числа
     * @deprecated используйте {@link #power(double, double)}
     */
    @Deprecated
    public double square(double number) {
        return number * number;
    }
    
    /**
     * Возводит число в указанную степень.
     * 
     * @param base основание
     * @param exponent показатель степени
     * @return base в степени exponent
     * @since 1.1
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}