public class InfiniteLoops {
    public static void main(String[] args) {
        // Бесконечный while
        while (true) {
            System.out.println("Бесконечный while");
        }
        
        // Бесконечный do-while
        do {
            System.out.println("Бесконечный do-while");
        } while (true);
        
        // Бесконечный for
        for (;;) {
            System.out.println("Бесконечный for");
        }
    }
}