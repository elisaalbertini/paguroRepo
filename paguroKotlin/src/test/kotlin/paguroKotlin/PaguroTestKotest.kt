package paguroKotlin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PaguroTestKotest : DescribeSpec({

    var paguro = Paguro()

    describe("paguroKotlin/features") {
        it("ciaooo") {
            paguro.salutaIlPaguro() shouldBe "Ciao Paguro!"
        }
    }
})
