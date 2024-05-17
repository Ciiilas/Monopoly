package de.htwg.se.monopoly
package model

import model.Player
import scala.collection.immutable.Queue


case class Board(players: Queue[Player], cards: Map[Int, Card]) {
  def this(playerCount: Int = 0,)
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





}




