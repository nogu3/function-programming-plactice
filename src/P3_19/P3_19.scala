object P3_19 {
  def firstTwo(list: List[String]): List[String] = {
    list.slice(0, 2)
  }

  def lastTwo(list: List[String]): List[String] = {
    val lastIndex = list.size - 1
    list.slice(lastIndex - 1, list.size)
  }

  def movedFirstTwoToTheEnd(list: List[String]): List[String] = {
    val firstTwoList = firstTwo(list)
    val last = list.last
    List(last) ::: firstTwoList
  }

  def insertedBeforeLast(list: List[String], element: String): List[String] = {
    val firstHalf = list.slice(0, list.size -1)
    val last = list.last
    firstHalf ::: List(element, last)
  }
}

@main def runScript(): Unit = {
  println(P3_19.firstTwo(List("a", "b", "c")) == List("a", "b"));
  println(P3_19.lastTwo(List("a", "b", "c")) == List("b", "c"));
  println(
    P3_19.movedFirstTwoToTheEnd(List("a", "b", "c")) == List("c", "a", "b")
  );
  println(P3_19.insertedBeforeLast(List("a", "b"), "c") == List("a", "c", "b"));
}
