import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[][] numbersMatrix = new int[6][6];

    public static void main(String[] args) {
        for (int i = 0; i < numbersMatrix.length; i++){
            for (int j = 0; j < numbersMatrix[i].length; j++){
                numbersMatrix[i][j] = j;
            }
        }

//        System.out.println("Сумма чисел массива: " + Integer.toString(getSum(numbers)));  // 55
//        System.out.println();
//
//        minAndMax(numbers);
//        System.out.println();
//
//        arithmeticAverage(numbers);
//        System.out.println();
//
//        System.out.println(contains(numbers, 2));
//        System.out.println();
//
//        getIndex(numbers, 4);
//        System.out.println();

//        getSumMatrix(numbersMatrix);

//        getRowSum(numbersMatrix);

//        getColumnSum(numbersMatrix);

//        transponateMatrix(numbersMatrix);

//        minMaxMatrix(numbersMatrix);

        arithmeticAverage(numbersMatrix);
    }

    public static int getSum(int[] nums){
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        return sum;
    }

    public static void minAndMax(int[] nums){
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            } else if (nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("Минимальное значение: " + Integer.toString(min));
        System.out.println("Максимальное значение: " + Integer.toString(max));
    }

    public static void arithmeticAverage(int[] nums){
        int sum = getSum(nums);

        System.out.println("Ариф. среднее: " + Integer.toString(sum/nums.length));
    }

    public static boolean contains(int[] nums, int targetNum){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == targetNum){
                return true;
            }
        }
        return false;
    }

    public static void getIndex(int[] nums, int targetNum){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == targetNum){
                System.out.println("Первое появление числа в списке: " + Integer.toString(i));
            }
        }
        System.out.println("В списке нет заданного значения");
    }

    public static int getSumMatrix(int[][] matrix){
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

//        System.out.println("Сумма матрицы: " + Integer.toString(sum));

        return sum;
    }

    public static void getRowSum(int[][] matrix){
        int rowSum = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                rowSum += matrix[i][j];
            }
            System.out.println(rowSum);

            rowSum = 0;
        }
    }

    public static void getColumnSum(int[][] matrix){
        int columnSum = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                columnSum += matrix[j][i];
            }
            System.out.println(columnSum);
            columnSum = 0;
        }

    }

    public static void transponateMatrix(int[][] matrix){
        List<Integer> transponatedRow = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                transponatedRow.add(matrix[j][i]);
            }

            System.out.println(transponatedRow);
            transponatedRow.clear();
        }
    }

    public static void minMaxMatrix(int[][] matrix){
        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                } else if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

    }

    public static void arithmeticAverage(int[][] matrix){
        int sum = getSumMatrix(matrix);
        int elementsCount = matrix.length * matrix.length;

        System.out.println("Среднее арифметическое: " + sum/elementsCount);
    }

//    public static void zeroSums()
//    [
//    [1 2 3]
//    [1 2 3]
//    [1 2 3]
//    ]



}
