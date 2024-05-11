package paguroKotlin.features.step_definition
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals
import paguroKotlin.Paguro

class MyStepdefs {
    private var paguro: Paguro = Paguro()
    private var actualAnswer: String = "Nope"
    private var isPaguroHungry: Boolean = false

    @Given("Paguro is not hungry")
    fun paguroIsNotHungry() {
        this.isPaguroHungry = false
    }

    @Given("Paguro is hungry")
    fun paguroIsHungry() {
        this.isPaguroHungry = true
    }

    @When("I ask if the Paguro is hungry")
    fun iAskIfThePaguroIsHungry() {
        this.actualAnswer = this.paguro.isKappaHungry(this.isPaguroHungry)
    }

    @Then("I should be told {string}")
    fun iShouldBeTold(expectedAnswer: String?) {
        assertEquals(this.actualAnswer, expectedAnswer)
    }
}

