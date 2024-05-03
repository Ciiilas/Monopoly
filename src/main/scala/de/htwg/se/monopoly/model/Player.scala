package de.htwg.se.monopoly.model

case class Player(coins: Int, figure: Figure, position: Int) {
 
  def set_position(fields: Int): Player = {
    this.copy(position = this.position + fields)
  }
  
}
