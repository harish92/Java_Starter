class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int r = c.add(5, 1);
        int r1 = c.add(5, 1, 5);
        double r2 = c.add(1.5, 5, 8);

        int nums[] = new int[5];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        // nums[5] = 5;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
    }
}
