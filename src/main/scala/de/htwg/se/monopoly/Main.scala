package de.htwg.se.monopoly

import de.htwg.se.monopoly.model.TUI
@main def monopoly(): Unit = {
  val tui = new TUI
  println(tui.playingfield(2,2,2))
}
