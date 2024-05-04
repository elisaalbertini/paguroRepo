
import PaguroBello.Paguro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Classe test
 */
public class TestPaguro {
    Paguro paguro = new Paguro();

    /**
     * Test incredibile
     */
    @Test
    public void TestSalutaIlPaguro(){
        assertEquals("Ciao Paguro", paguro.salutaIlPaguro());
    }

    /**
     * Test
     */
    @Test
    public void TestComplimentaIlPaguro(){
        assertEquals("Che bel Paguro!", paguro.complimentaIlPaguro());
    }

    /**
     * Test
     */
    @Test
    public void TestInsultaIlPaguro(){
        assertEquals("Che brutto Paguro!", paguro.insultaIlPaguro());
    }

    /**
     * Test
     */
    @Test
    public void TestGiocaConIlPaguro(){
        assertEquals("Giochiamo Paguro!", paguro.giocaConIlPaguro());
    }
}
