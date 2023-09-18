/**
 * InnerTypes
 */
class Calculator {

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }

}

public class Types {
    public static void main(String[] args) {
        // byte b = 127;
        int a = 257;
        byte k = (byte) a;
        float f = 5.6f;
        int t = (int) f;

        int d = 5;
        int g = 10;

        boolean b = d < g;

        String s = "Monday";

        switch (s) {
            case "Sunday":
                System.out.println("6am");
            default:
                System.out.println("7am");
        }

        Calculator calc = new Calculator();

        int add = calc.add(d, g);

        System.out.println(add);
    }
}
