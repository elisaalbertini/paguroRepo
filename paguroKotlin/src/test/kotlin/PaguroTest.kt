import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import paguroKotlin.Paguro

class PaguroTest {

    var paguro = Paguro()
    @Test
    fun salutaIlPaguroTest() {
        assertEquals(paguro.salutaIlPaguro(), "Ciao Paguro!")
    }
}