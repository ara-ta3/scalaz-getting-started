package com.ru.waka

import scalaz._
import scalaz.Scalaz._

/**
  * with https://gist.github.com/rirakkumya/2724922
  */
object Main {
  def main(args: Array[String]): Unit = {
    val res0 = List(
      "H".right,
      "e".right,
      "l".right,
      "l".right,
      "o".right
    ): List[Exception \/ String]
    println(res0.sequence[({ type X[A] = Exception \/ A })#X, String])

    val res1 = List(
      "H".right,
      "e".right,
      "l".right,
      "l".right,
      "o".right,
      new Exception("World").left
    )
    println(res1)
    println(res1.sequence[({ type X[A] = Exception \/ A })#X, String])

    val res2 = List(
      "H".some,
      "e".some,
      "l".some,
      "l".some,
      "o".some
    )
    println(res2)
    println(res2.sequence)
  }
}
