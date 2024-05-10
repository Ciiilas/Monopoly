package de.htwg.se.monopoly
import de.htwg.se.monopoly.model.Board_output_on_console
import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec

class MonopolySpec extends AnyWordSpec {
  "Monopoly" should {
    "have a scalable barTop" in {
      Board_output_on_console().barTop(1,1) should be("┌─┐")
      Board_output_on_console().barTop(1,2) should be("┌──┐")
      Board_output_on_console().barTop(2,1) should be("┌─┬─┐")
    }
    "have scalable cells" in {
      Board_output_on_console().cell(1, 1) should be("│ │")
      Board_output_on_console().cell(1, 2) should be("│  │")
      Board_output_on_console().cell(2, 1) should be("│ │ │")

    }
    "have a scalable barBottom" in {
      Board_output_on_console().barBottom(1, 1) should be("└─┘")
      Board_output_on_console().barBottom(1, 2) should be("└──┘")
      Board_output_on_console().barBottom(2, 1) should be("└─┴─┘")
    }
  }
}

