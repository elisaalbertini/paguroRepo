
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
    public void TestComplimentaIlPaguro(){
        assertEquals("Che bel Paguro!", paguro.complimentaIlPaguro());
    }
    @Test
    public void TestInsultaIlPaguro(){
        assertEquals("Che brutto Paguro!", paguro.insultaIlPaguro());
    }

    @Test
    public void TestGiocaConIlPaguro(){
        assertEquals("Giochiamo Paguro!", paguro.insultaIlPaguro());
    }
}
