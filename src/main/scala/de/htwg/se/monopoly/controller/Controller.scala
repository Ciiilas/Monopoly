package de.htwg.se.monopoly.controller

import de.htwg.se.monopoly.model
import de.htwg.se.monopoly.model.Board
import de.htwg.se.monopoly.util.Observable

class Controller extends Observable{
  def getDice():Unit = {

    notifyObservers
  }
}