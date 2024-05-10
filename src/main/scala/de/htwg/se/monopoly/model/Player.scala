package de.htwg.se.monopoly.model

case class Player(figure: Figure, position: Int) {
 
  
  def set_position(fields: Int): Player = {
    this.copy(position = this.position + fields)
  }
  
}
