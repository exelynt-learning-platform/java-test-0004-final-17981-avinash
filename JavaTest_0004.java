public class JavaTest_0004 {
    public static void main(String[] args) {

        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                int value = n - min;

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}