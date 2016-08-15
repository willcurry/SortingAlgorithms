public class SortAlgorithms {
    public int[] selectionSort(int[] arrayToSort) {
        if (arrayToSort.length < 1) return arrayToSort;
        for (int i = 0; i < arrayToSort.length; i++) {
            int min = i;
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < arrayToSort[min]) {
                    min = j;
                }
            }
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[min];
            arrayToSort[min] = temp;
        }
        return arrayToSort;
    }

    public int[] inserstionSort(int[] array) {
        if (array.length < 1) return array;
        for (int i=1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j=i-1; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public int[] bubbleSort(int[] array) {
        if (array.length < 1) return array;
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
