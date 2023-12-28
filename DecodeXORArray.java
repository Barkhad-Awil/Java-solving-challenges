import java.util.ArrayList;
import java.util.List;

/*
 * Question 4.6:
 * There is a hidden integer array arr that consists of n non-negative integers.
 * It was encoded into another integer array encoded of length n - 1, 
 * such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].
 * You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].
 */
public class DecodeXORArray{

    public static List<Integer> decode(int[] encoded, int first){
        List<Integer> ans = new ArrayList<>();
        ans.add(first);
        for(int i = 0; i < encoded.length; i++){
            ans.add(i+1, encoded[i] ^ ans.get(i));
        }
        return ans;

    }
    public static void main(String...args){
        int[] encoded = {1,2,3};
        int first = 1;
        decode(encoded, first);      
    }
}