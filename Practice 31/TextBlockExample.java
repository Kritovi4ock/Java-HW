public class TextBlockExample {
    public static void main(String[] args) {
        String json = """
            {
                "name": "Egor",
                "age": 20,
                "city": "SPb"
            }
            """;
        System.out.println(json);
        
        // Без текстовых блоков пришлось бы писать:
        String oldWay = "{\n" +
                        "    \"name\": \"Egor\",\n" +
                        "    \"age\": 20,\n" +
                        "    \"city\": \"SPb\"\n" +
                        "}";
    }
}