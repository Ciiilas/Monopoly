package de.htwg.se.monopoly.model
import de.htwg.se.monopoly.model.Player
import scala.collection.immutable.Queue

case class Board(players: Queue[Player], cards: Map[Int, Card], turn: Int) {

  def walk(): Board = {
    this.copy(players.get(player).get.set_position(number_of_fields))

  }

 

}




