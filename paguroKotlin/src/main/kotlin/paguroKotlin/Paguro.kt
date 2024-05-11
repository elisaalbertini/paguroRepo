package paguroKotlin

/**
 * Classe bella
 */
class Paguro {
    /**
     * Saluta il paguro
     * @return saluto
     */
    fun salutaIlPaguro(): String {
        return "Ciao Paguro!"
    }

    fun isKappaHungry(isHungry: Boolean): String {
        return if (isHungry) {
            "Yess"
        } else {
            "Nope"
        }
    }
}
