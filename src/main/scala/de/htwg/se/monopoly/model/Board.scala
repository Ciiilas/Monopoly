package de.htwg.se.monopoly.model
import de.htwg.se.monopoly.model.Player

case class Board(players: Map[String, Player], cards: Map[Int, Card] ) {

  def walk(player: String, number_of_fields: Int): Board = {
    this.copy(players = players.get(player).set_po);


  }



}