package Util;

public class dollarShare {

    public static final double IOF = 0.06;

        public  static double dollarAtReal(double amount, double dollarPrice){
            return amount * dollarPrice * (1.0 + IOF);
        }
}
