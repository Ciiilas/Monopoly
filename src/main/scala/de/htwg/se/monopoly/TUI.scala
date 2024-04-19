package de.htwg.se.monopoly

case class TUI()

def playingfield(board_size: Int,card_size_x: Int, card_size_y: Int ): Unit = {


  println("┌" + ("─" * card_size_x + "┬") * (board_size - 1) + "─" * card_size_x + "┐")

  for (a <- 1 to card_size_y)
    println("│" + (" " * card_size_x + "│") * (board_size - 1) + " " * card_size_x + "│")
  println("└" + ("─" * card_size_x + "┴") * (board_size - 1) + "─" * card_size_x + "┘")

}


