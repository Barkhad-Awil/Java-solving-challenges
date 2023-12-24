import java.util.ArrayList;
import java.util.List;

public class FindWordConChar{
    public static List<Integer> findWordsContainCharacter(List<String> words, char x){
        List<Integer> ans = new ArrayList<>();
        int len = words.size();
        for(int i = 0; i < len; i++){
            for(char j: words.get(i).toCharArray()){
                if(j == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans; 
    }

    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        words.add("Leet");
        words.add("code");
        char x = 'e';
        List<Integer> ans = findWordsContainCharacter(words, x);
    }
}