public class InsertionSortMethod {
    public static void main(String[] args) {
        double[] numbers = {3,8,2.3,6.9,3.2,9.1,1.5};
        insertionSort(numbers);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
    public static void insertionSort(double[] array){
        double insertValue ;
        int positionOfValue ;
        for (int i = 1; i < array.length ; i++) {
            insertValue = array[i];
            positionOfValue = i;
            while (positionOfValue > 0 && array[positionOfValue -1] > insertValue){
                array[positionOfValue] = array[positionOfValue -1];
                positionOfValue--;
            }
            if( positionOfValue != i)
                array[positionOfValue] = insertValue;
        }
    }
}
