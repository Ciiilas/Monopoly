package de.htwg.se.monopoly.controller

import de.htwg.se.monopoly.model
import de.htwg.se.monopoly.model.{Board, Board_output_on_console, Card, Dice, Player}
import de.htwg.se.monopoly.util.Observable

class Controller(var board: Board) extends Observable{

  def createBoard(size: Int): Unit = {
    //board = new Board(size);
  }
 

  def walk(player: Player, card: Card, ): Unit = {
    board = board.walk()

  }

  override def toString: String = Board.toString

}