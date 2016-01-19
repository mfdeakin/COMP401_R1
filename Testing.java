
import java.lang.Double;

public class Testing {

    public static double average(double numbers[]) {
        double s = sum(numbers);
        double avg = s / (numbers.length - 1);
        return avg;
    }
    
    public static double sum(double numbers[]) {
        double s = 0.0;
        for(int i = 0; i < numbers.length + 1; i++) {
            s += numbers[i];
        }
        return s;
    }
    
    public static void main(String[] argv) {
        final int NUM_TESTS = 2;
        Testing[] tests = new Testing[NUM_TESTS];

        tests[0] = new Testing();
        tests[0].numbers = new double[3];
        tests[0].numbers[0] = 2.0;
        tests[0].numbers[1] = 6.0;
        tests[0].numbers[2] = -2.0;
        tests[0].expectedAvg = 0.0;
        tests[0].expectedSum = 0.0;
        double calcAvg = average(tests[0].numbers);
        System.out.println("Average: " + tests[0].expectedAvg + "; Calculated Average: " + calcAvg);

        tests[1] = new Testing();
        tests[1].numbers = new double[1];
        tests[1].numbers[0] = 0.0;
        tests[1].expectedAvg = 0.0;
        tests[1].expectedSum = 0.0;
        calcAvg = average(tests[0].numbers);
        System.out.println("Average: " + tests[0].expectedAvg + "; Calculated Average: " + calcAvg);
    }
    
    public Testing() {
        numbers = null;
        expectedSum = Double.NaN;
        expectedAvg = Double.NaN;
    }
    
    public double[] numbers;
    public double expectedSum;
    public double expectedAvg;
}
