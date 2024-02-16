public class Wrapper {
    public static final void main(String[] args) {
        String textBlock = """
            "Java Study Guide"
                by Scott & Jeanne""";
        String pyramid = """
          *
         * *
        * * *
        """;
        System.out.println(textBlock);
        System.out.print(pyramid);
    }
}