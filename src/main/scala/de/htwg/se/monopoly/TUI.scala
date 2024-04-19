package de.htwg.se.monopoly

import scala.math.Equiv

case class TUI()

def playingfield(board_size: Int,card_size_x: Int, card_size_y: Int): Unit = {
  barTop(board_size, card_size_x)
  cells(board_size,card_size_x, card_size_y)
  barBottom(board_size,card_size_x)
}

def barTop(board_size: Int, card_size_x: Int): String = {
  return("┌" + ("─" * card_size_x + "┬") * (board_size - 1) + "─" * card_size_x + "┐")
}

def cells(board_size: Int, card_size_x: Int, card_size_y: Int): Unit = {
  for (a <- 1 to card_size_y)
    println(cell(board_size, card_size_x))
}
def cell(board_size: Int, card_size_x: Int): String = {
  return("│" + (" " * card_size_x + "│") * (board_size - 1) + " " * card_size_x + "│")
}

def barBottom(board_size: Int, card_size_x: Int): String = {
  return("└" + ("─" * card_size_x + "┴") * (board_size - 1) + "─" * card_size_x + "┘")
}
