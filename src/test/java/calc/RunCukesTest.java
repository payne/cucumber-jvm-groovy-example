package calc;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "src/test/resources/calc")
public class RunCukesTest {
}
