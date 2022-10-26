public class Matrix {
    int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
    public void printMatrix() {
        for (int i = 0;i<matrix.length;i++) {
            for (int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void printLowerTraingularMatrix() {
        for (int i = 0;i<matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i>=j) {
                    System.out.print(matrix[i][j]+ " ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.printMatrix();
        System.out.println("Lower Traingular Matrix");
        matrix.printLowerTraingularMatrix();
    }
}
