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
}
