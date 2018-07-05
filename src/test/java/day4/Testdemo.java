package day4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import day4.Demo1;

public class Testdemo {

    @Test
    public void check_data_after_split_data() {
        Demo1 d = new Demo1();
        String[] result = d.split("United State of America");
        assertEquals(4, result.length);
        assertArrayEquals(new String[] { "United", "State", "of", "America" }, result);

    }

    @Test
    public void filter_out_of_stop_word_from_data() {
        List<String> expected = new ArrayList<>();
        expected.add("United");
        expected.add("States");
        expected.add("America");
        Demo1 d = new Demo1();
        List<String> result = d.filter("United States of America");
        assertEquals(3, result.size());
        assertEquals(expected, result);
    }

    @Test
    public void should_return_USA() {
        Demo1 d = new Demo1();
        String result = d.up("United States of America");
        assertEquals("USA", result);
    }

    @Test
    public void should_return_USA_with_lower_case() {
        Demo1 d = new Demo1();
        String result = d.low("united states of america");
        assertEquals("usa", result);
    }
    
    @Test
    public void using_stream() {
        Demo1 d = new Demo1();
        assertEquals("USA", d.ofStream("United States of America"));
        assertEquals("USA", d.ofStream("united states of america"));
    }

}
