package tictactoe

import zio._

object ZMain extends App {

  def run(args: List[String]) = SayHiAgain.program("").exitCode

}