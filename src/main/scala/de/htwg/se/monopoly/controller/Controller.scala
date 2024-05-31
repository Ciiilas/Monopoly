package de.htwg.se.monopoly
package controller

import model.{Board, Card, Figure, Player,Dice}
import util.Observable

import scala.collection.immutable.ListSet

class Controller(var board: Board) extends Observable{
  
  def createBoard(size: Int): Unit = {
    //board = new Board(size);
    notifyObservers
  }
  
  def addPlayer(figure: Figure): Unit = {
    board = board.addPlayer(figure)
  }

  def walkPlayer(): Unit = {
    val dice: Dice = new Dice
    board = board.walkPlayer(dice)
  }
  
  def getNumberOfCards: Int = {
    board.getNumberOfCards
  }
  
  def getPlayers: ListSet[Player] = {
    board.getPlayers
  }
  
  def moveTopPlayerBottom(): Unit = {
    board.moveTopPlayerBottom
  }
  
  def getCards: Vector[Card] = {
    board.getCards
  }

  override def toString: String = Board.toString

}