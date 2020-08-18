package com.qa.day5;
import com.qa.day5.MorseCode;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MorseCodeTest {

    @Test
    public void method1Test(){
        assertEquals(".",MorseCode.method1("."));
        assertEquals("-",MorseCode.method1("-"));
        assertEquals(".-",MorseCode.method1(".-"));
        assertEquals(".-",MorseCode.method1("a"));
        assertEquals("-..-",MorseCode.method1("cat"));

    }

}
