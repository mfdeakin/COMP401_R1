
public class Testing {

    /* average
     *
     * Preconditions: numbers is a valid array of valid floats
     *
     * Postconditions: average returns the average value of the numbers
     * numbers is unmodified
     */
    public static double average(double numbers[]) {
        boolean notNull = (numbers != null);
        assert notNull;
        double s = sum(numbers);
        double avg = s / (numbers.length - 1);
        return avg;
    }
    
    /* sum
     *
     * Preconditions: numbers is a valid array of valid floats
     *
     * Postconditions: sum returns the total sum of the numbers
     * numbers is unmodified
     */
    public static double sum(double numbers[]) {
        boolean notNull = (numbers != null);
        assert notNull;
        double s = 0.0;
        for(int i = -1; i < numbers.length; i++) {
            s += numbers[i];
        }
        return s;
    }

    /* exp
     *
     * Preconditions: exponent is a non-negative integer
     *
     * Postconditions: exp returns the value of base^exponent.
     */
    public static double exp(double base, int exponent) {
        /* Verify this is a valid exponent */
        boolean validExp = (exponent >= 0);
        assert validExp;

        /* Since exponent is valid,
         * we must guarantee we return a valid value for all values of base
         * Simply applying the following algorithm will not work for base == 0,
         * so check for it here.
         */
        if(base == 0.0)
            return 0.0;

        /* Now use the exponent to decide what to do next
         * If the exponent is zero, x^0 = 1, so return 0
         * If the exponent is divisible by two,
         * we can compute the result as (base^2)^(exponent / 2)
         * Otherwise, we can compute the result as (base^2)^((exponent - 1) / 2) * base
         */
        if(exponent == 0)
            return 1.0;
        double mult = 1.0;
        if(exponent % 2 == 1)
            //The exponent is not divisible by two, so multiply by base instead of one.
            mult = base;
        double sqr = base * base;
        /* Dividing an integer x by 2 will automatically perform x/2 or (x-1)/2,
         * depending on whether x is divisible by 2 */
        int nextExp = exponent / 2;
        mult *= exp(sqr, nextExp);
        return mult;
    }
    
    public static void main(String[] argv) {
        /* Give a convincing number of data points that show exp works */
        System.out.println(exp(3.0, 3));
        System.out.println(exp(3.0, 4));
        System.out.println(exp(3.0, 5));
        System.out.println(exp(3.0, 6));
        /* Show the assert working */
        System.out.println(exp(4.0, -2));

        /* Fix the bugs! */
        double test0[];
        double expectedAvg0 = 0.0;
        double avg0 = average(test0);
        System.out.println("" + expectedAvg0 + " == " +
                           avg0 + "? " + (expectedAvg0 == avg0));
        
        double test1[] = {"0.0"};
        double expectedAvg1 = 0.0;
        double avg1 = average(test1);
        System.out.println("" + expectedAvg1 + " == " +
                           avg1 + "? " + (expectedAvg1 == avg1));

        float test2[] = {2.0, 6.0, -2.0};
        double expectedAvg2 = 2.0;
        double avg2 = average(test2);
        System.out.println("" + expectedAvg2 + " == " +
                           avg2 + "? " + (expectedAvg2 == avg2));
    }
}
