/*
 * Grant Hartley
 * 2024/02/05
 * Description: This is the calculation class that is extended by My_Calculation.
 */
public class Calculation {
    int result;

    public void add(int a, int b) {
        result = a + b;
        System.out.println("Addition Result: " + result);

    }

    public void sub(int a, int b) {
        result = a - b;
        System.out.println("Subtraction Result: " + result);
    }

}
