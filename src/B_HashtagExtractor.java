/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    private String choppedHashtag = "";
    private String choppedHashtag1 = "";
    private String choppedHashtag2 = "";

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
            int index1 = (post.indexOf("#"));
            int index2 = (post.indexOf(" ",index1));
            choppedHashtag = post.substring(index1,index2);
            System.out.println("Hastag: " + choppedHashtag);
            int index3 = post.indexOf("#",index2);
            int index4 = post.indexOf("!",index3);
            choppedHashtag = post.substring(index3,index4);
            System.out.println("Hastag: " + choppedHashtag);



//        choppedHashtag = post.substring(index);
//        int index1 = (choppedHashtag.indexOf(" "));
//        System.out.println(choppedHashtag);
//        System.out.println(index1);
//        choppedHashtag1 = choppedHashtag.substring(0,index1);
//        System.out.println(choppedHashtag);
//        int index2 = (choppedHashtag.indexOf("#"));
//        choppedHashtag2 = choppedHashtag.substring(index2);
//        System.out.println("chopped 2" + choppedHashtag2);
//        System.out.println("Hashtag: " + choppedHashtag1);




    }

}
