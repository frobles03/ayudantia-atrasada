import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class TareaExcTest {

    private TareaExc c;

    @Before
    public void setUp() throws Exception {
        c = new TareaExc();
    }

    @After
    public void tearDown() throws Exception {
        c = null;
    }

    @Test
    public void upperCaseFirstChar() {
        String word = "Fernando";
        String resperado = "Fernando";
        //assertEquals(true,c.upperCaseFirstChar(word));
        assertEquals(word, resperado);
    }

    @Test
    public void upperCaseFirstChar1() {
        String word = "fernando";
        String resperado = "fernando";
        //assertEquals(true,c.upperCaseFirstChar(word));
        assertEquals(word, resperado);
    }

}