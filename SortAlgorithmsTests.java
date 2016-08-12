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
        int[] test = {};
        assertTrue(sortAlgorithms.selectionSort(test) == test);
    }

    @Test
    public void selectionSortDoesNotSortArrayWithOnlyOneValue() {
        int[] test = {1};
        assertTrue(sortAlgorithms.selectionSort(test) == test);
    }

    @Test
    public void selectionSortSortsTheArrayFromLowestToHighest() {
        int[] test = {3, 2, 4, 1};
        assertThat(sortAlgorithms.selectionSort(test)[0], is(1));
        assertThat(sortAlgorithms.selectionSort(test)[1], is(2));
        assertThat(sortAlgorithms.selectionSort(test)[2], is(3));
        assertThat(sortAlgorithms.selectionSort(test)[3], is(4));
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
        int[] test = {3, 2, 4, 1};
        assertThat(sortAlgorithms.inserstionSort(test)[0], is(1));
        assertThat(sortAlgorithms.inserstionSort(test)[1], is(2));
        assertThat(sortAlgorithms.inserstionSort(test)[2], is(3));
        assertThat(sortAlgorithms.inserstionSort(test)[3], is(4));
    }
}
