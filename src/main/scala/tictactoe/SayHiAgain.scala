package tictactoe

import zio._
import console._
import java.io.IOException

object SayHiAgain {

  def program(prefix: String): ZIO[Console, IOException, Unit] = for {
    _ <- putStrLn(s"""should I say "Hi"$prefix?\npress y for yes, any other key to exit""")
    a <- getStrLn
    _ <- if (a == "y") putStrLn("Hi") *> program(" again") else putStrLn("Ok. Bye.")
  } yield ()

}