import java.math.BigInteger;

public class CalBigNums {
    public static void main(String[] arg){
        BigInteger two = new BigInteger("2");
        BigInteger result = two.pow(10000000);
        System.out.println(result);
    }
}