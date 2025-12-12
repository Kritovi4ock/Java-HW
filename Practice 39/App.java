public class App {
  final static int START_COUNTER; // final static переменная должна быть инициализирована
  
  static {
    // Статический блок инициализации выполняется при загрузке класса
    START_COUNTER = Integer.parseInt("Y-"); // Будет выброшено исключение NumberFormatException
    // Парсинг строки "Y-" в целое число невозможен
  }
  
  public static void main(String[] args) {
    System.out.println("Hello"); // Этот код никогда не выполнится
  }
}
// При выполнении произойдёт:
// При попытке загрузки класса App выполнится статический блок инициализации
// Integer.parseInt("Y-") выбросит NumberFormatException
// Так как исключение происходит в статическом блоке, оно оборачивается в ExceptionInInitializerError
// Программа завершится с ошибкой, не выполнив метод main()
// Консольный вывод будет содержать ExceptionInInitializerError, а не "Hello"