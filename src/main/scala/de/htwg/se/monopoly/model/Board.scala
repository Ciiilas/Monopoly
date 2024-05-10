package de.htwg.se.monopoly
package model

import model.Player
import scala.collection.immutable.Queue


case class Board(players: Queue[Player], cards: Map[Int, Card]) {
  private val startPos: Int = 0

  def addPlayer(figure: Figure): Board = {
    val player = Player(figure, startPos)
    this.copy(players :+ player)
  }

  def walkPlayer(x:Int): Board = {
    val newBoard: Board = this
    newBoard.players.head.set_position(x)
    newBoard
  }

  def getPlayer(): Player = {
    ???
  }


  val size: Int = cards.size
  private val eol: String = sys.props("line.separator")

  def barTop(board_size: Int = 10, card_size_x: Int = 15): String = "┌" + ("─" * card_size_x + "┬") * (board_size - 1) + "─" * card_size_x + "┐" + eol

  def cell(board_size: Int = 10, card_size_x: Int = 15): String = "│" + (" " * card_size_x + "│") * (board_size - 1) + " " * card_size_x + "│" + eol

  def barBottom(board_size: Int, card_size_x: Int): String = "└" + ("─" * card_size_x + "┴") * (board_size - 1) + "─" * card_size_x + "┘" + eol


}




