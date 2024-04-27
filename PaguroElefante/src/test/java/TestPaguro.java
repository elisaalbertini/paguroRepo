
import PaguroBello.Paguro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPaguro {
    Paguro paguro = new Paguro();
    @Test
    public void TestSalutaIlPaguro(){
        assertEquals("Ciao Paguro", paguro.salutaIlPaguro());
    }
    @Test
    public void TestSalutaIlPaguro2(){
        assertEquals("Ciao Paguro!", paguro.salutaIlPaguro());
    }
}
