public class Numeric_Vars
{
    public static void main(String[] args)
    {
        double burgerPrice = 3.50; // three fiddy
        int burgerOrder = 4;
        double orderPrice;

        orderPrice = burgerPrice * burgerOrder;

        System.out.println("The price of an order of " + burgerOrder + " burgers is " +  orderPrice );

        // Loss of precisions
        double sum = 0;
        double valA = 2.50;
        int valB = 6;

        sum = valA + valB;

        System.out.println("The sum of " + valA + " and " +  valB + " is " + sum );

        sum = valB;  // ok to put an int into a double

        System.out.println("Sum is " + sum);

        int intSum = 0;

        // intSum = valA;
        intSum = (int) valA;

        // integer division
        int iiiSum = 5 / 2; // 2.5  but throws the .5 away to store as int 2
        System.out.println(iiiSum);

        double diiSum = 5 / 2;  // store 2 not 2.5
        System.out.println(diiSum);

        diiSum = 5.0 / 2;  // 5 / 2.0  or use a cast (double) 5 / 2
        System.out.println(diiSum);

        double castSum = (double) 5 / 2;
        System.out.println(castSum);

        final double TAX_RATE = .17;

        // Math functions

        // x to the power of n
        double x = 2.0;
        double n = 3.0;
        double xCubed = Math.pow(x, n);
        System.out.println("xCubed is " + xCubed);

        x = 9.0;

        n = Math.sqrt(x);
        System.out.println("The square root of " + x + " is " + n);




    }
}