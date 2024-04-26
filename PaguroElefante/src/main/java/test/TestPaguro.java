package test;

import org.junit.*;
import PaguroBello.Paguro;

public class TestPaguro {
    Paguro paguro = new Paguro();

    @Test
    public void TestSalutaIlPaguro(){
        assertEquals("Ciao Paguro", paguro.salutaIlPaguro());
    }
}
