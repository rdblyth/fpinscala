import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import org.scalatest.prop.Checkers

@RunWith(classOf[JUnitRunner])
class Exercise2_1Test extends FunSuite with Checkers {

  test("Fibonacci Number for 0") {
    assert(Exercise2_1.fib(0) == 0)
  }

  test("Fibonacci Number for 1") {
    assert(Exercise2_1.fib(1) == 1)
  }

  test("Fibonacci Number for 2") {
    assert(Exercise2_1.fib(2) == 1)
  }

  test("Fibonacci Number for 9") {
    assert(Exercise2_1.fib(9) == 34)
  }
}
