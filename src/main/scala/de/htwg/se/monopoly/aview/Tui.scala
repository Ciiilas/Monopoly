package de.htwg.se.monopoly
package aview

import model.{Board, Card, Dice, Figure, Player}
import controller.Controller
import util.Observer

import scala.io.StdIn.readLine

class Tui(controller: Controller) extends Observer{

  controller.add(this);
  val size: Int = 36
  //val walk: Int = 4
  def run =
    println("Neues Spiel gestartet, wählen Sie ihre Spielfigur (Boot, Schuh, Hut, Katze, Hund, Auto, Bügeleisen, Schubkarre, Geldsack, Fingerhut) oder q um zu Beenden")
    askPlayerNamesAndGeneratePlayers()
    runGameLoop();



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
  def askPlayerNamesAndGeneratePlayers(): Unit = {
    val input = readLine
    input match
      case "q" =>
      case _ => {
        val figure: Figure = input match
          case "Boot" => Figure.Boot
          case "Schuh" => Figure.Schuh
          case "Hut" => Figure.Hut
          case "Katze" => Figure.Katze
          case "Hund" => Figure.Hund
          case "Auto" => Figure.Auto
          case "Bügeleisen" => Figure.Bügeleisen
          case "Schubkarre" => Figure.Schubkarre
          case "Geldsack" => Figure.Geldsack
          case "Fingerhut" => Figure.Fingerhut
          case _ => {
            throw new IllegalStateException("Ungültige Spielfigur")
          }
        controller.addPlayer(figure)
        //controller.walkPlayer()
        update
        askPlayerNamesAndGeneratePlayers()
      }


  }

  def runGameLoop(): Unit = {
    val input = readLine
        input match {
          case "n" => controller.createBoard(size);
          case "dice" => input match {
            case "w" => controller.walkPlayer();
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
    controller.moveTopPlayerBottom();
}
  val cards: Vector[Card] = controller.getCards()

  private val eol: String = sys.props("line.separator")

  def barTop(board_size: Int = 10, card_size_x: Int = 15): String = "┌" + ("─" * card_size_x + "┬") * (board_size - 1) + "─" * card_size_x + "┐" + eol

  def cell(board_size: Int = 10, card_size_x: Int = 15): String = "│" + (" " * card_size_x + "│") * (board_size - 1) + " " * card_size_x + "│" + eol

  def barBottom(board_size: Int, card_size_x: Int): String = "└" + ("─" * card_size_x + "┴") * (board_size - 1) + "─" * card_size_x + "┘" + eol

  def playingfield(board_size: Int): Unit = {
    println(barTop(board_size, 20))
    for (a <- 1 to 10)
      println(cell(board_size, 20))
    println(barBottom(board_size,20))
  }
  def playerInformation(players: Set[Player]): Unit = {
    for(i <- players) {
      println(i.toString);
    }
  }
  override def update: Unit = {
    playingfield(controller.getNumberOfCards());
    playerInformation(controller.getPlayers());
  }
}
