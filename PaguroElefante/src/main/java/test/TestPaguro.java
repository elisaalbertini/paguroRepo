package test;

import org.junit.*;
import PaguroBello.Paguro;

import static org.junit.Assert.assertEquals;

public class TestPaguro {
    Paguro paguro = new Paguro();

    @Test
    public void TestSalutaIlPaguro(){
        assertEquals("Ciao Paguro", paguro.salutaIlPaguro());
    }
}
