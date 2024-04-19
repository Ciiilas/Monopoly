package de.htwg.se.monopoly

case class TUI()

def playingfield(): Unit = {
  barTop()
  cells()
  barBottom()
}
def playingfield(board_size: Int,card_size_x: Int, card_size_y: Int): Unit = {
  barTop(board_size, card_size_x)
  cells(board_size,card_size_x, card_size_y)
  barBottom(board_size,card_size_x)
}
def barTop(): Unit = {
  println("┌" + ("─" * 10 + "┬") * (36 - 1) + "─" * 10 + "┐")
}
def barTop(board_size: Int, card_size_x: Int): Unit = {
  println("┌" + ("─" * card_size_x + "┬") * (board_size - 1) + "─" * card_size_x + "┐")
}

def cells(): Unit = {
  for (a <- 1 to 9)
    println("│" + (" " * 10 + "│") * (36 - 1) + " " * 10 + "│")
}

def cells(board_size: Int, card_size_x: Int, card_size_y: Int): Unit = {
  for (a <- 1 to card_size_y)
    println("│" + (" " * card_size_x + "│") * (board_size - 1) + " " * card_size_x + "│")
}

def barBottom(): Unit = {
  println("└" + ("─" * 10 + "┴") * (36 - 1) + "─" * 10 + "┘")
}

def barBottom(board_size: Int, card_size_x: Int): Unit = {
  println("└" + ("─" * card_size_x + "┴") * (board_size - 1) + "─" * card_size_x + "┘")
}
