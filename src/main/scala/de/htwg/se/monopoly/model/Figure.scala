package de.htwg.se.monopoly.model

enum Figure(stringRepresentation: String):
  override def toString: String = stringRepresentation
  case Boot extends Figure("Boot")
  case Schuh extends Figure("Schuh")
  case Hut extends Figure("Hut")
  case Katze extends Figure("Katze")
  case Hund extends Figure("Hund")
  case Auto extends Figure("Auto")
  case Bügeleisen extends Figure("Bügeleisen")
  case Schubkarre extends Figure("Schubkarre")
  case Geldsack extends Figure("Geldsack")
  case Fingerhut extends Figure("Fingerhut")
  case Empty extends Figure(" ")
