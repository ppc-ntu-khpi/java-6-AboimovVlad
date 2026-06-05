import java.util.Arrays;

/**
 * Клас для тестування функціональності сортування матриці.
 */
public class Main {

    public static void main(String[] args) {
        // Тестовий випадок 1: матриця 3x3
        int[][] testMatrix1 = {
            {9, 2, 5},
            {4, 7, 1},
            {8, 3, 6}
        };
        
        System.out.println("Тест 1 - Матриця 3x3:");
        System.out.println("Вихідна матриця:");
        printMatrix(testMatrix1);
        
        int[][] sorted1 = MatrixSorter.sortMatrix(testMatrix1);
        System.out.println("Відсортована матриця:");
        printMatrix(sorted1);
        System.out.println();
        
        // Тестовий випадок 2: матриця 4x4
        int[][] testMatrix2 = {
            {16, 15, 14, 13},
            {12, 11, 10, 9},
            {8, 7, 6, 5},
            {4, 3, 2, 1}
        };
        
        System.out.println("Тест 2 - Матриця 4x4:");
        System.out.println("Вихідна матриця:");
        printMatrix(testMatrix2);
        
        int[][] sorted2 = MatrixSorter.sortMatrix(testMatrix2);
        System.out.println("Відсортована матриця:");
        printMatrix(sorted2);
        System.out.println();
        
        // Тестовий випадок 3: матриця 2x2
        int[][] testMatrix3 = {
            {4, 2},
            {3, 1}
        };
        
        System.out.println("Тест 3 - Матриця 2x2:");
        System.out.println("Вихідна матриця:");
        printMatrix(testMatrix3);
        
        int[][] sorted3 = MatrixSorter.sortMatrix(testMatrix3);
        System.out.println("Відсортована матриця:");
        printMatrix(sorted3);
    }
    
    /**
     * Допоміжний метод для виведення матриці на консоль.
     * 
     * @param matrix матриця для виведення
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
