public class Array {

    // Array should be of format
    // 1 2 3
    // 4 5 6
    // 7 8 9
    public int[][] getRowMajorSquare(int x) {
        int[][] a = new int[x][x];
        int count = 1;
        for (int row = 0; row < x; row++) {
            for (int col = 0; col < x; col++) {
                a[row][col] = count;
                count++;
            }
        }
        return a;
    }

    // Array should be of format
    // 1 4 7
    // 2 5 8
    // 3 6 9
    public int[][] getColumnMajorSquare(int x) {
        int[][] a = new int[x][x];
        int count = 1;
        for (int col = 0; col < x; col++) {
            for (int row = 0; row < x; row++) {
                a[row][col] = count;
                count++;
            }
        }
        return a;
    }

    // Array should be of format
    // 1 2 3 4
    // 5 6 7 8
    // 9 10 11 12
    public int[][] getRowMajorRectangle(int row, int column) {
        int[][] a = new int[row][column];
        int count = 1;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                a[r][c] = count;
                count++;
            }
        }
        return a;
    }

    // Array should be of format
    // 1 4 7 10
    // 2 5 8 11
    // 3 6 9 12
    public int[][] getColumnMajorRectangle(int row, int column) {
        int[][] a = new int[row][column];
        int count = 1;
        for (int c = 0; c < column; c++) {
            for (int r = 0; r < row; r++) {
                a[r][c] = count;
                count++;
            }
        }
        return a;
    }

    // Please note that each digit occupies two spaces and there is a space between them.
    // You are not required to deal with three-digit numbers.
    public void printDouble(int[][] a) {
        for (int[] row : a) {
            for (int num : row) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Array array = new Array();
        
        // Testing row-major square
        System.out.println("Row Major Square:");
        array.printDouble(array.getRowMajorSquare(3));
        
        // Testing column-major square
        System.out.println("\nColumn Major Square:");
        array.printDouble(array.getColumnMajorSquare(3));
        
        // Testing row-major rectangle
        System.out.println("\nRow Major Rectangle:");
        array.printDouble(array.getRowMajorRectangle(3, 4));
        
        // Testing column-major rectangle
        System.out.println("\nColumn Major Rectangle:");
        array.printDouble(array.getColumnMajorRectangle(3, 4));
    }
}
