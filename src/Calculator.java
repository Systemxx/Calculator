public class Calculator {

    int a;
    int b;

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return b - a;
    }

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        int result = myCalculator.addAToB(15, 16);
        System.out.println(result);
    }
}
