public class MShapedPattern{
    public static void main(String[] args) {
        int rows = 7;
        int cols = 7;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == 0
                        || j == cols - 1
                        || (i == j && j <= cols / 2)
                        || (j == cols - 1 - i && j >= cols / 2)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}