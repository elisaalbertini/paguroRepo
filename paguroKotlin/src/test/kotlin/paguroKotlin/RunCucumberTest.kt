package paguroKotlin

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/kotlin/paguroKotlin/features"],
)
class RunCucumberTest
