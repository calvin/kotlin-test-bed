package testbed

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalculatorSpec : StringSpec({
    "this should be ok" {
        println("hello hello")
        "s" shouldBe "s"
    }

    "this should be also ok" {
        val c = Calculator(1, 2)
        c.sum() shouldBe 3
    }
})