/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {



    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }

    public C1_HiddenWordFinder() {
        String sentence = "This is a test startHelloend string.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {
        int startIndex = (sentence.indexOf("start")) + 5;
        //System.out.println(startIndex);
        int endIndex = sentence.indexOf("end");
        //System.out.println(endIndex);

        String hiddenWord = sentence.substring(startIndex,endIndex);
        System.out.println("Hidden word: " + hiddenWord);

    }

}
