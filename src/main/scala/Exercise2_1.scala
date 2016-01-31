object Exercise2_1 {

  def fibonacci(n: Int) : BigInt = {

    @annotation.tailrec
    def fibonacci(n: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = {
      n match {
        case 0 => prev
        case 1 => next
        case _ => fibonacci((n - 1), next, prev + next)
      }
    }

    fibonacci(n)
  }
}
