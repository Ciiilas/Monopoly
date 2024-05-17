package de.htwg.se.monopoly
package model

import de.htwg.se.monopoly.model.Figure
import model.Player


case class Board(players: Set[Player]=Set(), cards: Vector[Card]=Vector()) {
  
  def this(figure: Figure) = {
    this(Set(new Player(figure)))
  }
  def fillCards()={
    copy(players, Street_Names.values.dropRight(Street_Names.values.length-36).map(street=>Card(name=street)).toVector)
  }
  

  private val startPos: Int = 0
//================================================
//            Player
  def addPlayer(figure: Figure): Board = {
    val player = Player(figure, startPos)
    this.copy(players + player)
  }

  def walkPlayer(Dice): Unit = {
    this.players.head.
  }


  def getPlayers(): Set[Player] = this.players

  def getPlayer(): Player = this.players.head


  def moveTopPlayerBottom(): Unit = {

  }
  
  def getCards(): Vector[Card] = {
    this.cards
  }

//================================================
//          Card
  val size: Int = cards.size

  def getNumberOfCards(): Int = {
    this.cards.size;
  }
  
}




