
/*
 * Question 4.3"
 * Given the an array of strings calculate the array element which contain the biggest the number of words
 */
public class BiggestSentence {
    public static int findBiggestStringElement(String[] sentences){
        int maxNumberWords = 0;
        for(int i = 0; i < sentences.length; i++){
            int numWords = sentences[i].split(" ").length;

            if(numWords > maxNumberWords){
                maxNumberWords = numWords;
            }
        }
        return maxNumberWords;
    }

    public static void main(String...args){
        String[] sentences = {"Leet Code", "The best way of learnig java is practicing", "the best way to predict the future is to create it", "life is easy"};
        findBiggestStringElement(sentences);
    }
}
