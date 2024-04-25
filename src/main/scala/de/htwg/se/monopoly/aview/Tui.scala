package de.htwg.se.monopoly.aview
import de.htwg.se.monopoly.model.dice

class Tui {
  val dice = new dice
/*
todo Eingabemöglichkeiten:
Würfeln = w
Landen auf Feld:
Feld kaufen / nicht kaufen = k
Miete auf Feld bezahlen -> Geld erhalten (Häuser verkaufen, Hypoteke, Karte verkaufen) y/n
Falls Straße vorhanden Häuser kaufen/verkaufen k/v
Hypoteke auf ein Karte erstellen h
Karte Verkaufen v
Handeln mit anderen Spielern h
Zug beenden
 */
  def processInputLine(input: String, processState: String): Unit = {
    processState match {
      case "dice" => input match {
        case "w" => println(dice.thow())
        }
      case "landOnCard" => input match
        case "y" => println("Karte gekauft")
        case "n" => println("Karte nicht gekauft")
      case "board" => input match
        case "t" => println("Wechsle zum Handel")
        case "s" => println("Wähle eine Karte aus")
        case "q" => println("Zug beendet")
      case "hypoteke" => input match
        case "y" => println("Hypoteke wird auf Karte angelegt")
        case "n" => println("Hypoteke wird nicht angelegt")
      case "sell" => input match
        case "y" => println("Karte wird verkauft")
        case "n" => println("Karte wird nicht verkauft")
      case "house" => input match
        case "y" => println("Haus wird auf Karte gekauft")
        case "n" => println("Haus wird nicht gekauft")
    }
  }

}
