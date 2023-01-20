public class Main {
    public static String shortTitle(String title, int len) {
        StringBuilder sb = new StringBuilder();
        String[] words = title.split(" ");
        if (title.length() <= len) {
            return title;
        } else {
            int i;
            for (i = 0; i < words.length; i++) {
                if (sb.length() + words[i].length() + 1 > len) {
                    break;
                }
                sb.append(words[i] + " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("...");
        }
        return sb.toString();
    }

    public static void testShortTitle() {
        String title1 = "Volvo released a new car";
        String title2 = "This title is already short";
        String title3 = "This title is longer than the maximum length";

        assert shortTitle(title1, 25).equacls("Volvo released a new...");
        assert shortTitle(title2, 50).equals("This title is already short");
        assert shortTitle(title3, 10).equals("This...");
    }
    public static void main(String[] args) {
        String title = "Volvo released a new car with the following spec: V6 236HP. It will cost $22647 and going to be sold in New York only";
        System.out.println(shortTitle(title, 25));
        testShortTitle();
    }
}