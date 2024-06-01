package de.htwg.se.monopoly
package model

import de.htwg.se.monopoly.model.Figure
import model.Player

import scala.collection.immutable.ListSet


case class Board(players: ListSet[Player]=ListSet.empty, cards: Vector[Card]=Vector()) {
  def this(figure: Figure) = {
    this(ListSet(Player(figure)))
  }
  def fillCards: Board ={
    copy(players, Street_Names.values.dropRight(Street_Names.values.length-36).map(street=>Card(streetName = street)).toVector)
  }



//================================================
  //            Player
  private val startPos: Int = 0

  def addPlayer(figure: Figure): Board = {
    val player: Player = Player(figure, startPos)
    this.copy(players + player)
  }

  def walkPlayer(x:Dice): Board = {
    val player:Player  = players.head.set_position(x)
    this.copy(players)
  }


  def getPlayers: ListSet[Player] = this.players

  def getPlayer: Player = this.players.head


  def moveTopPlayerBottom: Board = {
    val newBoard: Board = this
    val listSet1: ListSet[Player] = newBoard.players
    val listSet2: ListSet[Player] = listSet1.drop(1) + listSet1.head
    this.copy(listSet2)
  }
  


//================================================
//          Card

  val size: Int = cards.size

  def getCards: Vector[Card] = this.cards

  def getNumberOfCards: Int = this.cards.size

}




