package de.htwg.se.monopoly

import de.htwg.se.monopoly.aview.Tui
import de.htwg.se.monopoly.controller.Controller
import de.htwg.se.monopoly.model.{Board, Card, Player,Figure}

import scala.io.StdIn.readLine

object Monopoly {
  
  //val controller = new Controller(new Board)
  //val Tui = new Tui(controller)
  //val Board = new Board_output_on_console
  def main(args: Array[String]): Unit = {
    println(Figure.Auto)
    var input: String = ""
    var processState: String = ""

    while input != "q"
    do {
      //Board.playingfield(2,2,2)
      processState = readLine()
      input = readLine()
      //Tui.processInputLine(input, processState)
    }
  }
}