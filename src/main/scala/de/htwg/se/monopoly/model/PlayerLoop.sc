import scala.collection.immutable.ListSet
val listSet1 = ListSet(6, 2, 3)


val listSet2 = listSet1.drop(1) + listSet1.head
listSet2

