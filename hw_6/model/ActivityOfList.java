package tasks.hw_6.model;

import java.util.Arrays;
import java.util.Random;

public class ActivityOfList {

    public ActivityOfList() {
    }

    public int[] createList() {
        Random random = new Random();
        int[] array = random.ints(0, 20).distinct().limit(10).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }

    public double averageList(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        double result = sum / array.length;
        System.out.println("\nСреднее значение списка = " + result + ".\n");
        return result;
    }

    public void compareList(double resultAverageOne, double resultAverageTwo) {
        if(resultAverageOne == resultAverageTwo) {
            System.out.println("Средние значения массивa = ");
        } else if (resultAverageOne > resultAverageTwo) {
            System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }

}
