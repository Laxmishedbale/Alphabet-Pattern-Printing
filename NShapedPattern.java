public class NShapedPattern {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == 0
                        || j == rows - 1
                        || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}