package de.htwg.se.monopoly

case class Board(player1_position: Int, player2_position: Int, player3_position: Int, player4_position: Int,
                player1_coins: Int, player2_coins: Int, player3_coins: Int, player4_coins: Int) {

/*  def player_moves(Board: Board, player: Int, number_of_fields: Int): Board = {
    newBoard: Board = copy(Board);
    player match {
      case 1 => newBoard.player1_position = newBoard.player1_position + number_of_fields;
      case 2 => newBoard.player2_position = newBoard.player2_position + number_of_fields;
      case 3 => newBoard.player3_position = newBoard.player3_position + number_of_fields;
      case 4 => newBoard.player4_position = newBoard.player4_position + number_of_fields;
    }
    return newBoard;

  }*/

}