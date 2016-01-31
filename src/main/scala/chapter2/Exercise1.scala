package chapter2

import scala.annotation.tailrec

/**
  * The fibTailRec code comes from this url: http://alvinalexander.com/scala/scala-recursion-examples-recursive-programming
  */
object Exercise1 {

  def fib(n: Int) : BigInt = {

    @tailrec
    def fibTailRec(n: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = {
      n match {
        case 0 => prev
        case 1 => next
        case _ => fibTailRec((n - 1), next, prev + next)
      }
    }

    fibTailRec(n)
  }
}
