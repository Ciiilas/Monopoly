package de.htwg.se.monopoly
package controller

import model.{Board, Card, Figure, Player,Dice}
import util.Observable

import scala.collection.immutable.ListSet

class Controller(var board: Board) extends Observable{

  
  def addPlayer(figure: Figure): Unit = {
    board = board.addPlayer(figure)
    notifyObservers
  }


  def walkPlayer(): Unit = {
    val dice: Dice = new Dice
    val newBoard: Board = board.walkPlayer(dice)
    notifyObservers
  }
  
  def getNumberOfCards: Int = {
    board.getNumberOfCards
  }
  
  def getPlayers: ListSet[Player] = {
    board.getPlayers
  }
  
  def moveTopPlayerBottom(): Unit = {
    board.moveTopPlayerBottom
    notifyObservers
  }
  
  def getCards: Vector[Card] = {
    board.getCards
  }

  override def toString: String = Board.toString

}