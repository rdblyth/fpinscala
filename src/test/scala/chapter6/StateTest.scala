package chapter6

import chapter6.RNG._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.prop.Checkers

@RunWith(classOf[JUnitRunner])
class StateTest extends FunSuite with Checkers {

  test("nonNegativeInt returns a random positive Int") {
    val rng = Simple(Int.MaxValue + 1)
    val (num, rng2) = nonNegativeInt(rng)
    assert(num > 0)
    assert(num == nonNegativeInt(rng)._1)
  }

  test("double returns a number between 0 and 1") {
    val rng = Simple(Int.MaxValue + 1)
    val (num, rng2) = double(rng)
    assert(num >= 0 && num < 1)
    assert(num == double(rng)._1)
  }

  test("intDouble returns a (Int, Double) tuple") {
    val rng = Simple(Int.MaxValue + 1)
    val ((i, d), rng2) = intDouble(rng)
    assert(i > 0)
    assert(d >= 0 && d < 1)
    assert((i, d) == intDouble(rng)._1)
  }

  test("doubleInt returns a (Double, Int) tuple") {
    val rng = Simple(Int.MaxValue + 1)
    val ((d, i), rng2) = doubleInt(rng)
    assert(i > 0)
    assert(d >= 0 && d < 1)
    assert((d, i) == doubleInt(rng)._1)
  }

  test("double3 returns a tuple3 with 3 random doubles") {
    val rng = Simple(Int.MaxValue + 1)
    val ((d1, d2, d3), rng2) = double3(rng)
    assert(d1 >= 0 && d1 < 1)
    assert(d2 >= 0 && d2 < 1)
    assert(d3 >= 0 && d3 < 1)
    assert(d1 != d2 && d2 != d3 && d1 != d3)
    assert((d1, d2, d3) == double3(rng)._1)
  }
}
