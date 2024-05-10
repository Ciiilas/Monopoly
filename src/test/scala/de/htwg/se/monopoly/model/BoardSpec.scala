package de.htwg.se.monopoly.model
import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec
import de.htwg.se.monopoly.model.Board
import de.htwg.se.monopoly.model.Player
import de.htwg.se.monopoly.model.Figure

import scala.collection.immutable.Queue

class BoardSpec extends AnyWordSpec {
  "Board" should {
    "have a player walk" {
      Board(Queue[Player](Player(Figure.Boot,0)), Map[Int, Card]()).walkPlayer(5) should be (Board(Queue[Player](Player(Figure.Boot,5)), Map[Int, Card]()))
    }
    
    
  }

}
