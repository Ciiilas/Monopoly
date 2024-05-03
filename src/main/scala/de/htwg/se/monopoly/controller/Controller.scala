package de.htwg.se.monopoly.controller

import de.htwg.se.monopoly.model
import de.htwg.se.monopoly.model.{Board, Board_output_on_console, Dice}
import de.htwg.se.monopoly.util.Observable

class Controller extends Observable{
  def getDice():Unit = {
    val dice = new Dice
    notifyObservers
  }
}