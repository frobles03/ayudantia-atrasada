import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TareaExc2Test {
  private  TareaExc2 c;
    @Before
    public void setUp() throws Exception {
        c= new TareaExc2();
    }

    @After
    public void tearDown() throws Exception {
        c= null;
    }

    @Test
    public void validarRut() {
        String rut=("19640973k");
        //boolean validacion = true;
        assertEquals(false, c.validarRut(rut));
    }

    @Test
    public void validarRut1() {
        String rut=("196409734");
        //boolean validacion = true;
        assertEquals(true, c.validarRut(rut));
    }


    @Test
    public void validarRut2() {
        String rut=("10-8");
        //boolean validacion = true;
        assertEquals(true, c.validarRut(rut));
    }


    @Test
    public void validarRut3() {
        String rut=("12592817-k");
        //boolean validacion = true;
        assertEquals(true, c.validarRut(rut));
    }
}