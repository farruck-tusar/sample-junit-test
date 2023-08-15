package com.tusar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicsTest {
    Basics basicTests = new Basics();

    @Test
    @DisplayName("First number is less than the second")
    public void compareLessThan(){
        int value = basicTests.compare(2, 3);
        Assertions.assertEquals(-1, value);
    }
    @Test
    @DisplayName("First number is equal to the second")
    public void compareEqual() {
        int value = basicTests.compare(2, 2);
        Assertions.assertEquals(0, value);
    }

    @Test
    @DisplayName("Sorted array")
    public void sortingAscending() {
        int[] array = {5, 8, 3, 9, 1, 6};
        basicTests.sortArrayAscending(array);
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 6, 8, 9}, array);
    }
}