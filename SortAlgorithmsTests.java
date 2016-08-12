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
        assertEquals(test, sortAlgorithms.selectionSort(test));
    }

    @Test
    public void selectionSortSortsTheArrayFromLowestToHighest() {
        int[] test = {3, 2, 4, 1};
        assertThat(sortAlgorithms.selectionSort(test)[0], is(1));
        assertThat(sortAlgorithms.selectionSort(test)[1], is(2));
        assertThat(sortAlgorithms.selectionSort(test)[2], is(3));
        assertThat(sortAlgorithms.selectionSort(test)[3], is(4));
    }
}
