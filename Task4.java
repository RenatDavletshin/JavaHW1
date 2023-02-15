/* 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы */

public class Task4 {
    private static int getMax(int[] A)
    {
        int max = Integer.MIN_VALUE;
        for (int i: A) {
            max = Math.max(max, i);
        }
 
        return max;
    }
 
    private static int getMin(int[] A)
    {
        int min = Integer.MAX_VALUE;
        for (int i: A) {
            min = Math.min(min, i);
        }
 
        return min;
    }
 
    public static void main(String[] args)
    {
        int[] A = { 6, 8, 3, 5, 1, 9 };
 
        System.out.println("Min element is " + getMin(A));
        System.out.println("Max element is " + getMax(A));
    }
}