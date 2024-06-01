case class Dice(throw1:Int = 2, throw2:Int = 2) {
  def this() = this(throw1 = scala.util.Random.between(1, 7), throw2 = scala.util.Random.between(1, 7))


  def throwsAdded(): Int = this.throw1 + this.throw2



}



  val dice = new Dice()

  dice.throwsAdded()

