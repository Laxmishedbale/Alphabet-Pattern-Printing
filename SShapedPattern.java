public class SShapedPattern {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 7;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 && j > 0)
                        || (i == 3 && j > 0 && j < cols - 1)
                        || (i == 6 && j < cols - 1)
                        || (j == 0 && i > 0 && i < 3)
                        || (j == cols - 1 && i > 3 && i < 6)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}