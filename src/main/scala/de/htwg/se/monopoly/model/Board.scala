package de.htwg.se.monopoly.model
import de.htwg.se.monopoly.model.Player

import scala.collection.immutable.Queue

case class Board(players: Queue[Player], cards: Map[Int, Card], dice: Int) {

  val eol = sys.props("line.separator")

  def barTop(board_size: Int = 10, card_size_x: Int = 15): String = {
    "┌" + ("─" * card_size_x + "┬") * (board_size - 1) + "─" * card_size_x + "┐"
  }

  def cell(board_size: Int = 10, card_size_x: Int = 15): String = {
    "│" + (" " * card_size_x + "│") * (board_size - 1) + " " * card_size_x + "│"
  }

  def barBottom(board_size: Int, card_size_x: Int): String = {
    "└" + ("─" * card_size_x + "┴") * (board_size - 1) + "─" * card_size_x + "┘"
  }
  
  
  def walk(): Board = {
    
    //this.copy(players.head.set_position(dice))
  }

 

}




