package de.htwg.se.monopoly
package model

import de.htwg.se.monopoly.model.Figure
import model.Player


case class Board(players: List[Player], cards: Map[Int, Card]) {
  def this() = {
    this(List.tabulate(1) { _ => new Player(Figure.Boot)}, cards)
  }
  def this() = {

  }
  def this() = {

  }
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
  
  def getNumberOfCards(): Int = {
    this.cards.size;
  }





}




