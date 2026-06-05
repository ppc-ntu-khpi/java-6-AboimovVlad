import java.util.Arrays;

/**
 * Клас для сортування квадратної матриці в порядку зростання.
 * 
 * Сортує елементи матриці як єдиного масиву від верхнього лівого кута
 * до нижнього правого: зліва направо, зверху вниз.
 * 
 * @author Практичне завдання
 * @version 1.0
 */
public class MatrixSorter {
    
    /**
     * Сортує квадратну матрицю порядку N в порядку зростання елементів.
     * 
     * Метод конвертує двовимірний масив в одновимірний, сортує його,
     * а потім заповнює відсортованими елементами матрицю (зліва направо, зверху вниз).
     * 
     * @param matrix квадратна матриця розміром N x N з цілими числами
     * @return відсортована матриця розміром N x N
     * @throws IllegalArgumentException якщо матриця порожня
     */
    public static int[][] sortMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Матриця не може бути порожною");
        }
        
        int n = matrix.length;
        
        // Перевіримо, що матриця квадратна
        for (int[] row : matrix) {
            if (row.length != n) {
                throw new IllegalArgumentException("Матриця має бути квадратною");
            }
        }
        
        // Конвертуємо матрицю в одновимірний масив
        int[] flattened = new int[n * n];
        int index = 0;
        for (int[] row : matrix) {
            for (int elem : row) {
                flattened[index++] = elem;
            }
        }
        
        // Сортуємо елементи
        Arrays.sort(flattened);
        
        // Заповнюємо матрицю відсортованими елементами
        int[][] result = new int[n][n];
        index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = flattened[index++];
            }
        }
        
        return result;
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
