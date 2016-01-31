object Exercise2_1 {

  def fib(n: Int) : BigInt = {

    @annotation.tailrec
    def fib(n: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = {
      n match {
        case 0 => prev
        case 1 => next
        case _ => fib((n - 1), next, prev + next)
      }
    }

    fib(n)
  }
}
