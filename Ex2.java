public class Ex2 {

    public static void main(String[] args) {
        int nums[][] = new int[4][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.println("m " + m);
            }
            System.out.println();
        }
    }

}
