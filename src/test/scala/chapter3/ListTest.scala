package chapter3

import chapter3.List._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.prop.Checkers

@RunWith(classOf[JUnitRunner])
class ListTest extends FunSuite with Checkers {

  test("tail removes the first element in a List") {
    assert(tail(List(1,2,3)) == List(2,3))
  }

  test("tail on an empty List throws an Exception") {
    intercept[RuntimeException]{
      tail(List())
    }
  }

  test("setHead replaces the first element of a List") {
    assert(setHead(List(4,2,3), 1) == List(1,2,3))
  }

  test("setHead on an empty List throws an Exception") {
    intercept[RuntimeException]{
      setHead(List(), 1)
    }
  }

  test("drop with a value of 0 returns the passed in List") {
    assert(drop(List(1,2,3), 0) == List(1,2,3))
  }

  test("drop with a negative value returns the passed in List") {
    assert(drop(List(1,2,3), -1) == List(1,2,3))
  }

  test("drop removes first n elements from a List") {
    assert(drop(List(1,2,3), 2) == List(3))
  }

  test("dropWhile removes elements from a List prefix as long as they match a predicate") {
    assert(dropWhile(List(1,2,3), (x: Int) => x < 3) == List(3))
  }

  test("dropWhile on List where no elements match predicate returns the full List") {
    assert(dropWhile(List(1,2,3), (x: Int) => x > 3) == List(1,2,3))
  }

  test("dropWhile on List where all elements match predicate returns an empty List") {
    assert(dropWhile(List(1,2,3), (x: Int) => x < 4) == List())
  }

  test("init removes the last element from a List") {
    assert(init(List(1,2,3)) == List(1,2))
  }

  test("init on a List with one element returns an empty List") {
    assert(init(List(1)) == List())
  }

  test("init on an empty List throws an Exception") {
    intercept[RuntimeException]{
      init(List())
    }
  }

  test("length returns the number of elements in a List") {
    assert(length(List(1,2,3)) == 3)
  }

  test("foldleft") {
    assert(foldLeft(List(1,2,3),0)((x,y) => x-y) == -6)
  }

  test("sum3 adds the elements together in a List") {
    assert(sum3(List(1,2,3)) == 6)
  }

  test("product3 multiplies the elements together in a List") {
    assert(product3(List(2,3,4)) == 24)
  }

  test("length2 returns the number of elements in a List") {
    assert(length(List(1,2,3)) == 3)
  }

  test("reverse reverses the elements in a List") {
    assert(reverse(List(1,2,3)) == List(3,2,1))
  }
}
