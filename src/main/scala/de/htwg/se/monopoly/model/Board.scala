package de.htwg.se.monopoly.model
import de.htwg.se.monopoly.model.Player

case class Board(players: Map[Figure, Player], cards: Map[Int, Card], dice: Dice ) {

  def walk(player: Figure, number_of_fields: Int): Board = {
    this.copy(players.get(player).get.set_position(number_of_fields))
  }

 

}