/* 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
пройти по нему циклом, и числа меньшие 6 умножить на 2; */

public class Task2 {
    public static void main(String[] args)
    {
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
                for(int i = 0; i < maxMas; i++) {
                    if (mas[i] < 6) mas[i] = mas[i] * 2;
                }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print (i + "-" + mas[i]+" ");
        }
    }
}