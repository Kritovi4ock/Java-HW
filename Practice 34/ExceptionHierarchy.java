/**
 * Иерархия исключений
 * 
 * 1. Throwable - базовый класс для всех исключений и ошибок
 *    Содержит методы getMessage(), printStackTrace()
 * 
 * 2. Error - серьёзные системные ошибки, которые обычно НЕ следует обрабатывать
 *    Примеры: OutOfMemoryError, StackOverflowError, VirtualMachineError
 *    Представляют проблемы JVM, а не ошибки в логике программы
 * 
 * 3. Exception - базовый класс для всех проверяемых исключений
 *    Должны быть либо обработаны (try-catch), либо объявлены в throws
 *    Примеры: IOException, SQLException, ClassNotFoundException
 * 
 * 4. RuntimeException - непроверяемые исключения (unchecked exceptions)
 *    Не требуют обязательной обработки или объявления в throws
 *    Часто возникают из-за ошибок программиста
 *    Примеры: NullPointerException, ArrayIndexOutOfBoundsException
 * 
 * Проверяемые (checked) и Непроверяемые (unchecked):
 * - Checked: Exception и его подклассы (кроме RuntimeException)
 * - Unchecked: RuntimeException и его подклассы + Error
 */