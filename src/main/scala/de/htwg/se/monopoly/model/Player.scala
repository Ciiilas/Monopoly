package de.htwg.se.monopoly.model

case class Player(coins: Int, figure: Option[String], position: Int) {
  if (figure != None) {

  }
  def set_position(fields: Int): Player = {
    this.copy(position = this.position + fields);
  }


}
