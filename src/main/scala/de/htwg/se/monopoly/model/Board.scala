package de.htwg.se.monopoly.model

case class Board(players: Map[String, Player], cards: Map[Int, Card] ) {

  def walk(player: String, number_of_fields: Int): Board = {
    val Board = this.copy(players = players.get(player).set);
    return Board;

  }



}