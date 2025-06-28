public class VShapedPattern {

    public static void main(String[] args) {
        int rows = 7;
        int cols = 13;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == i && i < rows - 1
                        || j == cols - 1 - i && i < rows - 1
                        || (i == rows - 1 && j == cols / 2)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}