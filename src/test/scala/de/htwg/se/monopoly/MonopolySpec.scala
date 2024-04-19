package de.htwg.se.monopoly
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._
//import de.htwg.se.monopoly._
class MonopolySpec extends AnyWordSpec {
  "Monopoly" should {
    "have a scalable barTop" in {
      barTop(1,1) should be("┌─┐")
      barTop(1,2) should be("┌──┐")
      barTop(2,1) should be("┌─┬─┐")
    }
    "have scalable cells" in {
      cell(1, 1) should be("│ │")
      cell(1, 2) should be("│  │")
      cell(2, 1) should be("│ │ │")

    }
    "have a scalable barBottom" in {
      barBottom(1, 1) should be("└─┘")
      barBottom(1, 2) should be("└──┘")
      barBottom(2, 1) should be("└─┴─┘")
    }
  }
}
