package de.htwg.se.monopoly.controller

import de.htwg.se.monopoly.model
import de.htwg.se.monopoly.model.Board
import de.htwg.se.monopoly.util.Observable

class Controller extends Observable{
  def createEmptyGrid(size: Int):Unit = {
    grid = new Grid(size)
    notifyObservers
  }

  def createRandomGrid(size: Int, randomCells:Int):Unit = {
    grid = new GridCreator(size).createRandom(randomCells)
    notifyObservers
  }

  def gridToString: String = grid.toString

  def set(row: Int, col: Int, value: Int):Unit = {
    grid = grid.set(row, col, value)
    notifyObservers
  }


}