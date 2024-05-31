package de.htwg.se.monopoly
package model


case class Dice(throw1:Int = 2, throw2:Int = 2) {
  def this() = this (throw1 = scala.util.Random.between(1, 7), throw2 = scala.util.Random.between(1, 7))


  def doublets: Boolean = throw1 == throw2

  def throwsAdded: Int = throw1 + throw2
}

