package de.htwg.se.monopoly
package model

import model.Player
import scala.collection.immutable.Queue


case class Board(players: Queue[Player], cards: Map[Int, Card], dice: Int) {
  val startPos: Int = 0

  def addPlayer(figure: Figure): Player = this.copy(players.appended(Player(Figure, startPos)))

  def walkPlayer(): Board = {
    var newboard: Board = this
    newboard.players.head.set_position(dice)
    return newboard
  }


  val size: Int = cards.size
  private val eol: String = sys.props("line.separator")

  def barTop(board_size: Int = 10, card_size_x: Int = 15): String = "┌" + ("─" * card_size_x + "┬") * (board_size - 1) + "─" * card_size_x + "┐" + eol

  def cell(board_size: Int = 10, card_size_x: Int = 15): String = "│" + (" " * card_size_x + "│") * (board_size - 1) + " " * card_size_x + "│" + eol

  def barBottom(board_size: Int, card_size_x: Int): String = "└" + ("─" * card_size_x + "┴") * (board_size - 1) + "─" * card_size_x + "┘" + eol


}




