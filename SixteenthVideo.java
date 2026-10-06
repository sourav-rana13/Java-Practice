public class SixteenthVideo {
     public static void main(String[] args) {

        String sentence = "Java is not easy to learn";

        String[] words = sentence.split(" ");

        System.out.println("Words:");

        for (String word : words) {
            System.out.println(word);
        }

        String data = "MD. SOURAV RANA   252-35-602";

        String[] parts = data.split("\\s+");

        System.out.println("\nSeparated information:");

        for (String part : parts) {
            System.out.println(part);
        }

    }
}

