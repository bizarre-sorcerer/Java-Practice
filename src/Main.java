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

        MyArrayList elements = new MyArrayList();

        for (int i=1; i<6; i++) {
            elements.add(i);
        }

        elements.add(5);
        elements.removeDuplicates();

        for (int i=0; i<elements.collection.length; i++){
            if (elements.collection[i] != null){
                System.out.println(elements.collection[i]);
            }
        }
    }

    // Числа
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isOrdinary(int num){
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        else {
            return false;
        }

        return true;
    }

    public static int getFactorial(int num){
        int result = 1;

        for (int i=2; i<=num; i++){
            result *= i;
        }

        return result;
    }

    // Строки
    public static void vowelsCossonantsCount(String string){
        String glasnye = "а и е ё о у ы э ю я";
        String soglasnye = "б в г д ж з й к л м н п р с т ф х ц ч ш щ";
        int glasnyeCount = 0;
        int soglasnyeCount = 0;

        for (String c: string.toLowerCase().split("")){
            if (glasnye.contains(c)){
                glasnyeCount++;
            }
            else if (soglasnye.contains(c)){
                soglasnyeCount++;
            }
        }
        System.out.println("Гласные: " + glasnyeCount);
        System.out.println("Согласные: " + soglasnyeCount);

    }

    // Со списками/Массивами
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

    public static void reverseMassiv(int[] nums){
        List<Integer> reversedList = new ArrayList<>();

        for (int i = nums.length-1; i >= 0; i--){
            reversedList.add(numbers[i]);
        }
        System.out.println(reversedList);
    }

    public static int[] filterEven(int[] nums){
        List<Integer> evenNumbers = new ArrayList<>();

        for (int num: nums){
            if (isEven(num)){
                evenNumbers.add(num);
            }
        }

        return evenNumbers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int linearSearch(int[] nums ,int targetNum){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == targetNum){
                return i;
            }
        }
        return -1;  // Нету значит
    }

    // Матрицы
    public static void showMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
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

    public static void zeroSums(int[][] matrix){
        int count = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] == 0){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }

    public static void interchangeRows(int[][] matrix, int targetIndex, int targetIndex2){
        int[] tempMassiv = matrix[targetIndex];
        matrix[targetIndex] = matrix[targetIndex2];
        matrix[targetIndex2] = tempMassiv;

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void maxRowMinCol(int[][] matrix){
        List<Integer> maxInRows = new ArrayList<>();
        List<Integer> minInCols = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++){
            int maxRow = matrix[0][0];
            int minCol = matrix[0][0];

            if (matrix[i][0] < minCol){
                minCol = matrix[i][0];
            }
            minInCols.add(minCol);

            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] > maxRow){
                    maxRow = matrix[i][j];
                }
            }
            maxInRows.add(maxRow);
        }

        System.out.println(minInCols);
        System.out.println(maxInRows);
    }

//       [
//          [1 2 3]
//          [1 2 3]
//          [1 2 3]
//       ]
}

