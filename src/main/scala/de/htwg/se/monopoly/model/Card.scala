package de.htwg.se.monopoly.model

import de.htwg.se.monopoly.model.Street_Names.Empty

case class Card(name: Street_Names, houses: Int, owner: Figure) {
 def this() = this(Empty, 0, Figure.Empty)
 
}
