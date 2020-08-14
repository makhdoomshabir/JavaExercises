package com.qa.day5;

import com.qa.day5.CipherPeerProgramme;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CipherPeerProgrammeTest {


    @BeforeClass
    public static void Initialise(){
        CipherPeerProgramme.main(null);
    }
    @Test
    public void methodTest(){
        CipherPeerProgramme cipher = new CipherPeerProgramme();
        assertEquals("draziw",cipher.method1("wizard"));

    }
}
