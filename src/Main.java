import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[] numbers2 = {1, 223, 33, 4, 5, 26, 57, 8, 239, 10};

    public static List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    public static List<Integer> numbersList2 = new ArrayList<>(Arrays.asList(1, 223, 33, 4, 5, 26, 57, 8, 239, 10));

    public static int[][] numbersMatrix = new int[6][6];

    public static LinkedList<Integer> linkedList = new LinkedList<>();

    public static HashMap<String, Integer> namesAges = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < numbersMatrix.length; i++){
            for (int j = 0; j < numbersMatrix[i].length; j++){
                numbersMatrix[i][j] = j;
            }
        }

    }

    // linked list
    public static void reverseLinkedList(LinkedList<Integer> linkedList){
        if (linkedList.isEmpty() || linkedList.size() == 1) {
            return;
        }

//        ...
//        ...
//        ...

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

    // С массивами
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

    //  Списки
    public static List<Integer> getIntersections(List<Integer> listA, List<Integer> listB){
        List<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++){
            if (listA.contains(listB.get(i))){
                intersection.add(listB.get(i));
            }
        }

        return intersection;
    }

    public static int[] listToMassiv(List<Integer> list){
        int[] result = new int[list.size()];

        for (int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public static boolean isSubset(List<Integer> list1, List<Integer> list2){
        if (list1.containsAll(list2)) {
            return true;
        } else {
            return false;
        }

    }

    public static void minMax(List<Integer> list){
        int min = list.get(0);
        int max = list.get(0);

        for (int i=0; i<list.size(); i++){
            if (list.get(i)<min){
                min = list.get(i);
            }
            else if (list.get(i)>max){
                max = list.get(i);
            }
        }

        System.out.println("min: " + Integer.toString(min));
        System.out.println("max: " + Integer.toString(max));
    }

    public static void deleteEven(List<Integer> list){
        for (int i=0; i<list.size(); i++){
            if (list.get(i)%2==0){
                list.remove(i);
            }
        }
    }

    public static int getSum(List<Integer> nums){
        int sum = 0;

        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }

        return sum;
    }

    public static void arithmeticAverage(List<Integer> nums){
        int sum = getSum(nums);

        System.out.println("Ариф. среднее: " + Integer.toString(sum/nums.size()));
    }

    public static void copy(List<Integer> list1, List<Integer> list2){
        for (int i=0; i<list2.size(); i++){
            list1.add(list2.get(i));
        }

//        list1.forEach(list ->{
//            list.
//        });
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

