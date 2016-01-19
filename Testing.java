
public class Testing {

    public static double average(double numbers[]) {
        double s = sum(numbers);
        double avg = s / (numbers.length - 1);
        return avg;
    }
    
    public static double sum(double numbers[]) {
        double s = 0.0;
        for(int i = -1; i < numbers.length; i++) {
            s += numbers[i];
        }
        return s;
    }
    
    public static void main(String[] argv) {
        double test1[] = {"0.0"};
        double expectedAvg1 = 0.;
        double avg1 = average(test1);
        System.out.println("" + expectedAvg1 + " == " +
                           avg1 + "? " + (expectedAvg1 == avg1));

        double test2[] = {2.0, 6.0, -2.0};
        double expectedAvg2 = 2.;
        double avg2 = average(test2);
        System.out.println("" + expectedAvg2 + " == " +
                           avg2 + "? " + (expectedAvg2 == avg2));
    }
}
