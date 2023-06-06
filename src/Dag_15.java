//de for each loop wil nog niet.
public class Dag_15 {

    public Dag_15() {
    }

    public void min() {
        int temp, size;
        int[] array = {4, 51, -7, 13, -99, 15, -8, 45, 90};
        size = array.length;

        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
        for (int index = 0; index < array.length; index++) {
            if (array[index] < currentSmallest)
                currentSmallest = array[index];
        }
        System.out.println(currentSmallest);

        currentSmallest = Integer.MAX_VALUE;
        for (int index : array) {
            if (index < currentSmallest) {
                currentSmallest = index;
            }


        }
        System.out.println(currentSmallest);

        int total = 0;
        for (int index = 0; index < array.length; index++)
            total += array[index];
        double average = (double) total / array.length;
        System.out.println(average);

        total = 0;
        for (int index: array)
            total += index;
            average = (double) total / array.length;
            System.out.println(average);



    }

}
