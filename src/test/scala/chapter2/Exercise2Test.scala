package chapter2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.prop.Checkers
import chapter2.Exercise2.isSorted

@RunWith(classOf[JUnitRunner])
class Exercise2Test extends FunSuite with Checkers {

  test("isSorted returns true when array of Integers is sorted") {
    assert(isSorted(Array(1,8,9), compareInt) == true)
  }

  test("isSorted returns false when array of Integers is not sorted") {
    assert(isSorted(Array(8,9, 1), compareInt) == false)
  }

  test("isSorted returns true when array of Strings is sorted") {
    assert(isSorted(Array("all", "before", "hi"), compareString) == true)
  }

  test("isSorted returns false when array of Strings is not sorted") {
    assert(isSorted(Array("all", "hi", "before"), compareString) == false)
  }

  def compareInt(n1: Int, n2: Int) : Boolean = n1 <= n2

  def compareString(s1: String, s2:String) = s1 <= s2
}
