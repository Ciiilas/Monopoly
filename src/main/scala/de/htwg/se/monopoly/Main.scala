package de.htwg.se.monopoly
@main def monopoly(): Unit =
  val board_size = 5
  val card_size_x = 7
  val card_size_y = 8

  println("┌" + ("─"* card_size_x + "┬")*(board_size-1) + "─"* card_size_x + "┐")

  for(a <- 1 to card_size_y)
    println("│" + (" "* card_size_x + "│" )*(board_size-1) + " "*card_size_x + "│")
  println("└" + ("─"* card_size_x + "┴")*(board_size-1) + "─"* card_size_x + "┘")