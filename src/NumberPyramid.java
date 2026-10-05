public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 4;  // number of rows you want

        for (int i = 1; i <= rows; i++) {
            // Step 1: Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Step 2: Print numbers from 1 up to (2*i - 1)
            for (int num = 1; num <= (2 * i - 1); num++) {
                System.out.print(num);
            }

            // Step 3: Move to next line
            System.out.println();
        }
    }
}
