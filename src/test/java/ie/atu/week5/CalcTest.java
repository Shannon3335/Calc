package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc new_calc;
    @BeforeEach
    void setUp() {
        new_calc = new Calc();
    }

    @Test
    void test_add()
    {
        assertEquals(0, new_calc.add(0,0));
    }

    @Test
    void test_subtract()
    {
        assertEquals(5,new_calc.subtract(8,3));
    }

    @Test
    void test_mult()
    {
        assertEquals(0,new_calc.mult(1000000,0));
    }


    @AfterEach
    void tearDown() {
    }
}