package chapter3


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.prop.Checkers

@RunWith(classOf[JUnitRunner])
class ListTest extends FunSuite with Checkers {

  test("tail removes the first element in a List") {
    assert(List.tail(List(1,2,3)) == List(2,3))
  }

  test("tail on an empty List throws an Exception") {
    intercept[RuntimeException]{
      List.tail(List())
    }
  }

  test("setHead replaces the first element of a List") {
    assert(List.setHead(List(4,2,3), 1) == List(1,2,3))
  }

  test("setHead on an empty List throws an Exception") {
    intercept[RuntimeException]{
      List.setHead(List(), 1)
    }
  }

  test("drop with a value of 0 returns the passed in List") {
    assert(List.drop(List(1,2,3), 0) == List(1,2,3))
  }

  test("drop with a negative value returns the passed in List") {
    assert(List.drop(List(1,2,3), -1) == List(1,2,3))
  }

  test("drop removes first n elements from a List") {
    assert(List.drop(List(1,2,3), 2) == List(3))
  }

  test("dropWhile removes elements from a List prefix as long as they match a predicate") {
    assert(List.dropWhile(List(1,2,3), (x: Int) => x < 3) == List(3))
  }

  test("dropWhile on List where no elements match predicate returns the full List") {
    assert(List.dropWhile(List(1,2,3), (x: Int) => x > 3) == List(1,2,3))
  }

  test("dropWhile on List where all elements match predicate returns an empty List") {
    assert(List.dropWhile(List(1,2,3), (x: Int) => x < 4) == List())
  }

  test("init removes the last element from a List") {
    assert(List.init(List(1,2,3)) == List(1,2))
  }

  test("init on a List with one element returns an empty List") {
    assert(List.init(List(1)) == List())
  }

  test("init on an empty List throws an Exception") {
    intercept[RuntimeException]{
      List.init(List())
    }
  }
}
