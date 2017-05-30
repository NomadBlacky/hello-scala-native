package org.nomadblacky.helloscalanative

import scala.annotation.tailrec

/**
 * Created by blacky on 17/05/30.
 */
object Fibonacci extends App {
  // I referrd http://qiita.com/takuya0301/items/39121e0988750878e0f7
  def fib(n: Long): Long = {
    @tailrec def loop(n: Long, a: Long, b: Long): Long = {
      if (n == 0) a
      else loop(n - 1, b, a + b)
    }
    loop(n, 0, 1)
  }
  println(fib(args(0).toLong))
}
