package de.htwg.se.monopoly.model

case class Board(players: Map[String, Player], cards: Map[Int, Card], dice: Dice ) {

  def walk(Boardold: Board, player: String, number_of_fields: Int): Board = {
    val Board = Board();
    return Board;

  }

 

}