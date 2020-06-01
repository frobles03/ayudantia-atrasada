import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TareaExc3Test {
    private TareaExc3 c;
    @Before
    public void setUp() throws Exception {
        c=new TareaExc3();
    }

    @After
    public void tearDown() throws Exception {
        c=null;
    }

    @Test
    public void validarEmail() {
        String mail="f.robles03@ufromail.cl";
        assertEquals(true,c.validarEmail(mail));
    }

    @Test
    public void validarEmail1() {
        String mail="f.robles03@ufromail..cama";
        assertEquals(false,c.validarEmail(mail));
    }
    @Test
    public void validarEmail2() {
        String mail="q@q@ufromail.@";
        assertEquals(false,c.validarEmail(mail));
    }


}