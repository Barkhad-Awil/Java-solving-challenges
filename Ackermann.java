/*
    Exercise 2.4: write a metod called ack that calculates the Ackersmann function. 
    The method takes an integet and return int value.
 */


public class Ackermann {
    public static int ack(int m, int n){
        if(m == 0){
            return n + 1;
        }else if (m > 0 && n == 0){
            return ack(m-1,1);    
        } else if(m > 0 && n > 0) {
            return  ack(m -1, ack(m, n - 1));
        }
        return n;
    }

    public static void main(String[] args){
       System.out.println(ack(2, 3));
    }
}
