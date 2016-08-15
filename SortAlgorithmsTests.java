import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortAlgorithmsTests {
    private SortAlgorithms sortAlgorithms;
    @Before
    public void setUp() throws Exception {
        sortAlgorithms = new SortAlgorithms();
    }

    @Test
    public void selectionSortReturnsAnEmptyArrayWhenCalledWithNoArray() {
        int[] expected = {};
        assertTrue(sortAlgorithms.selectionSort(expected) == expected);
    }

    @Test
    public void selectionSortDoesNotSortArrayWithOnlyOneValue() {
        int[] expected = {1};
        assertTrue(sortAlgorithms.selectionSort(expected) == expected);
    }

    @Test
    public void selectionSortSortsTheArrayFromLowestToHighest() {
        int[] array = {3, 2, 4, 1};
        assertThat(sortAlgorithms.selectionSort(array)[0], is(1));
        assertThat(sortAlgorithms.selectionSort(array)[1], is(2));
        assertThat(sortAlgorithms.selectionSort(array)[2], is(3));
        assertThat(sortAlgorithms.selectionSort(array)[3], is(4));
    }

    @Test
    public void insertionSortReturnsAnEmptyArrayWhenCalledWithNoArray() {
        int[] expected = {};
        assertTrue(sortAlgorithms.inserstionSort(expected) == expected);
    }

    @Test
    public void insertionSortDoesNotSortArrayWithOnlyOneValue() {
        int[] expected = {1};
        assertTrue(sortAlgorithms.inserstionSort(expected) == expected);
    }

    @Test
    public void insertionSortSortsTheArrayFromLowestToHighest() {
        int[] array = {3, 2, 4, 1};
        assertThat(sortAlgorithms.inserstionSort(array)[0], is(1));
        assertThat(sortAlgorithms.inserstionSort(array)[1], is(2));
        assertThat(sortAlgorithms.inserstionSort(array)[2], is(3));
        assertThat(sortAlgorithms.inserstionSort(array)[3], is(4));
    }

    @Test
    public void bubbleSortReturnsAnEmptyArrayWhenCalledWithNoArray() {
        int[] expected = {};
        assertTrue(sortAlgorithms.bubbleSort(expected) == expected);
    }

    @Test
    public void bubbleSortDoesNotSortArrayWithOnlyOneValue() {
        int[] expected = {1};
        assertTrue(sortAlgorithms.bubbleSort(expected) == expected);
    }

    @Test
    public void bubbleSortSortsTheArrayFromLowestToHighest() {
        int[] array = {3, 2, 4, 1};
        assertThat(sortAlgorithms.bubbleSort(array)[0], is(1));
        assertThat(sortAlgorithms.bubbleSort(array)[1], is(2));
        assertThat(sortAlgorithms.bubbleSort(array)[2], is(3));
        assertThat(sortAlgorithms.bubbleSort(array)[3], is(4));
    }
}
