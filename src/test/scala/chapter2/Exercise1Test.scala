package chapter2

import chapter2.Exercise1.fib
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.prop.Checkers

@RunWith(classOf[JUnitRunner])
class Exercise1Test extends FunSuite with Checkers {

  test("Fibonacci Number for 0") {
    assert(fib(0) == 0)
  }

  test("Fibonacci Number for 1") {
    assert(fib(1) == 1)
  }

  test("Fibonacci Number for 2") {
    assert(fib(2) == 1)
  }

  test("Fibonacci Number for 9") {
    assert(fib(9) == 34)
  }
}
