package de.htwg.se.monopoly.model


case class Player(figure: Figure = Figure.Empty, position: Int = 0) {
 
  
  def set_position(fields: Int): Player = {
    this.copy(position = this.position + fields)
  }

  override def toString(): String = {
    "Figure: " + figure+ "\n" + "Position: " + position + "\n" + "---"
  }


  
}
