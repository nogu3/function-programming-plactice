@main def runScript(): Unit = {
  // 1
  def lengthSort(word: String): Int = word.length
  println(
    List("scala", "rust", "ada")
      .sortBy(lengthSort) == List("ada", "rust", "scala")
  );

  // 2
  def countS(word: String): Int = word.count(_ == 's')
  println(
    List("rust", "ada").sortBy(countS) == List("ada", "rust")
  )

  // 3
  def descendingOrder(word: Int): Int = -word
  println(
    List(5, 1, 2, 4, 3).sortBy(descendingOrder) == List(5, 4, 3, 2, 1)
  )

  // 4
  def countSForDesc(word: String): Int = -countS(word)
  println(
    List("ada", "rust").sortBy(countSForDesc)== List("rust", "ada")
  )
}
