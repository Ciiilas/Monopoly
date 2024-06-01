package de.htwg.se.monopoly.model


case class Player(figure: Figure = Figure.Empty, position: Int = 0) {
 
  
  def set_position(fields: Dice): Player = {
    val player:Player = this.copy(position = this.position + fields.throwsAdded())
    player
  }



  override def toString: String = {
    "Figure: " + figure+ "\n" + "Position: " + position + "\n" + "---"
  }



}
