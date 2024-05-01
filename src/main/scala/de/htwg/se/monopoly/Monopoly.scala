package de.htwg.se.monopoly

import de.htwg.se.monopoly.aview.Tui
import de.htwg.se.monopoly.model.Board
import scala.io.StdIn.readLine

object Monopoly {
  val Tui = new Tui
  val Board = new Board
  def main(args: Array[String]): Unit = {

    var input: String = ""
    var processState: String = ""

    while input != "q"
    do {Board.playingfield(2,2,2)
      processState = readLine()
      input = readLine()
      Tui.processInputLine(input, processState)
    }
  }
}