import java.util.*;

public class Task2 {
    public static void wordCounter() throws Exception
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the sentence to count words: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        if(sentence == ""){
            System.out.println("Error Input Try Again" );
            Thread.sleep(3000);
            wordCounter();
        }
        else {
            int wordCount = words.length;
            if(wordCount==1){
                System.out.println("There is " + wordCount + " word in the sentence.");
            }
            else{
                System.out.println("There are " + wordCount + " words in the sentence.");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        wordCounter();
    }
}
