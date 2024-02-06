/*
 * Grant Hartley
 * 2024/02/05
 * Description: This is a simple example of inheritance in Java that extends the Calculation class.
 */

public class My_Calculation extends Calculation {
    public void mul(int a, int b) {
        result = a * b;
        System.out.println("Multiplication Result: " + result);
    }

    public void mod(int a, int b) {
        result = a % b;
        System.out.println("Modulos Result: " + result);
    }

    public void div(int a, int b) {
        result = a / b;
        System.out.println("Division Result: " + result);
    }

    public static void main(String[] args) {
        int val1 = 10, val2 = 20;
        My_Calculation calc = new My_Calculation();
        calc.add(val1, val2);
        calc.sub(val1, val2);
        calc.mul(val1, val2);
        calc.mod(val1, val2);
        calc.div(val1, val2);
    }
}
