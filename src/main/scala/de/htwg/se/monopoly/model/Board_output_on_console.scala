package de.htwg.se.monopoly.model

case class Board_output_on_console() {

  def playingfield(board_size: Int,card_size_x: Int, card_size_y: Int): Unit = {
    println(barTop(board_size, card_size_x))
    for (a <- 1 to card_size_y)
      println(cell(board_size, card_size_x))
    println(barBottom(board_size,card_size_x))
  }
  
  def barTop(board_size: Int, card_size_x: Int): String = {
    "┌" + ("─" * card_size_x + "┬") * (board_size - 1) + "─" * card_size_x + "┐"
  }

  def cell(board_size: Int, card_size_x: Int): String = {
    "│" + (" " * card_size_x + "│") * (board_size - 1) + " " * card_size_x + "│"
  }

  def barBottom(board_size: Int, card_size_x: Int): String = {
    "└" + ("─" * card_size_x + "┴") * (board_size - 1) + "─" * card_size_x + "┘"
  }
}