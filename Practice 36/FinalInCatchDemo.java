try {
    throw new IOException("File error");
} catch (final Exception e) {
    // Нельзя переприсвоить ссылку:
    // e = new RuntimeException("Another"); // Ошибка компиляции!
    // Переменная е становится неизменяемой ссылкой
    // Можно читать и вызывать методы:
    System.out.println(e.getMessage());
    e.printStackTrace();
}