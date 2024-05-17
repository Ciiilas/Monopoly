package de.htwg.se.monopoly
package model

import de.htwg.se.monopoly.model.Figure
import model.Player


case class Board(players: List[Player], cards: Vector[Card]) {
  def this(figure: Figure) = {
    this(List(new Player(figure)), Vector())
  }
  def fillCards()={copy(players, Street_Names.values.dropRight(Street_Names.values.length-36).map(street=>Card(name=street)).toVector)}




  private val startPos: Int = 0
//================================================
//            Player
  def addPlayer(figure: Figure): Board = {
    val player = Player(figure, startPos)
    this.copy(players :+ player)
  }

  def walkPlayer(x:Int): Board = {
    val newBoard: Board = this
    newBoard.players.head.set_position(x)
    newBoard
  }


  def getPlayers(): List[Player] = {
    this.players
  }

//================================================
//          Card
  val size: Int = cards.size

  def getNumberOfCards(): Int = {
    this.cards.size;
  }





}




