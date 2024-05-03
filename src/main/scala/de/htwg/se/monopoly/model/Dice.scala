package de.htwg.se.monopoly.model

case class Dice() {
  val random = new scala.util.Random
  def thow(): Unit = {
    val thow1 = random.between(1, 7)
    val thow2 = random.between(1, 7)
  }
  def doublets(thow1:Int, thow2:Int): Boolean = thow1 == thow2
    
}
