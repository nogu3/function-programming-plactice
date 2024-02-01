object P2_19 {
  def getTipPercentage(names: List[String]): Int = {
    if (names.size > 5) {
      20
    } else if (names.size > 0) {
      10
    } else {
      0
    }
  }
}

@main def runScript(): Unit = {
  println(P2_19.getTipPercentage(List("a", "b", "c", "d", "e", "f")) == 20);
  println(P2_19.getTipPercentage(List("a", "b", "c", "d", "e")) == 10);
  println(P2_19.getTipPercentage(List()) == 0);
}
