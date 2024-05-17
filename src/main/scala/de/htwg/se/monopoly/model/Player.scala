package de.htwg.se.monopoly.model

import de.htwg.se.monopoly.model.Figure.Empty

case class Player(figure: Figure, position: Int) {
  def this() = this(figure = Empty, position = 0)
 
  
  def set_position(fields: Int): Player = {
    this.copy(position = this.position + fields)
  }
  

  
}
