package com.qa.day5;
import com.qa.day5.MorseCode;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class MorseCodeTest {
    @Test
    public void method1Test() {
        MorseCode morseCode = new MorseCode();
        assertEquals(morseCode.method1("hello"), "......-...-..---");
    }
    @Test
    public void method2Test() {
        MorseCode morseCode = new MorseCode();
        assertEquals(morseCode.method2("...././.-../.-../---"), "hello");
    }
}


