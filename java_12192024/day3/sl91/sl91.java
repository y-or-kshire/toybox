package day3.sl91;

import java.math.BigInteger;

public class sl91 {
    /**
     * The main method calculates a large number using BigInteger operations.
     * It computes the value of 1990 raised to the power of (1991 raised to the power of 1992),
     * and adds it to the value of 1992 raised to the power of (1991 raised to the power of 1990).
     * The result is then printed to the console.
     *
     * Note: The calculations involve very large numbers, which may cause performance issues or
     * memory overflow depending on the system's capabilities.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        BigInteger n1 = new BigInteger("1990");
        BigInteger n2 = new BigInteger("1991");
        BigInteger n3 = new BigInteger("1992");
        BIginteger n4 = n1.multiply(n1);
        // BigInteger n = new BigInteger("1990").pow(new BigInteger("1991").pow(1992).intValue())
        // .add(new BigInteger("1992").pow(new BigInteger("1991").pow(1990).intValue()));
        System.out.println(n);
    }
}
