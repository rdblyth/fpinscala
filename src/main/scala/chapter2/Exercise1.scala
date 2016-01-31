package chapter2

import scala.annotation.tailrec

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
