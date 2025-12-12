try {
  // Код, который может вызвать исключение
} finally {
  // Первый блок finally
} finally {
  // Второй блок finally
  // Такая конструкция недопустима
  // try может иметь только один блок finally
  // Ошибка компиляции: Multiple finally blocks are not allowed
}