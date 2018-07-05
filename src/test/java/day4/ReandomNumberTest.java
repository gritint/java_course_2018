package day4;

import static org.junit.Assert.*;

import org.junit.Test;

import day4.Demo;

public class ReandomNumberTest {

    @Test
    public void random_5() {
        Demo demo = new Demo();
        assertEquals(5, demo.generateNumber(new Random5()));
    }

}
class Random5 implements MyRandom {
    @Override
    public int nextInt() {
        return 5;
    }
}
