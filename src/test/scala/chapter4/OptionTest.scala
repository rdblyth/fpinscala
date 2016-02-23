package chapter4

import scala.{Option => _, Some => _, Either => _, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.prop.Checkers

@RunWith(classOf[JUnitRunner])
class OptionTest extends FunSuite with Checkers {

  test("map applies function if Option is not None") {
    val option : Option[String] = Some("foo")
    assert(option.map(_.toUpperCase()) == Some("FOO"))
  }

  test("map returns None if Option is None") {
    val option : Option[String] = None
    assert(option.map(_.toUpperCase) == None)
  }

  test("getOrElse returns value when Option is Some") {
    val option : Option[String] = Some("foo")
    assert(option.getOrElse("bar") == "foo")
  }

  test("getOrElse returns default value when Option is None") {
    val option : Option[String] = None
    assert(option.getOrElse("bar") == "bar")
  }
}
