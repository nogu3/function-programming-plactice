@main def runScript(): Unit = {
  val wordList = List(
    // (4 + 0) + -7 = -3
    "rust",
    // (2 + 0) + 0 = 2
    "java",
    // (5 + 5) + -7 = 3
    "csharp",
    // (3 + 5) + 0 = 8
    "c++"
  )

  def rankedWords(
      wordScore: String => Int,
      words: List[String]
  ): List[String] = {
    words.sortBy(wordScore).reverse
  }
  def score(word: String): Int = word.replaceAll("a", "").length()
  def bonus(word: String): Int = if (word.contains("c")) 5 else 0
  def penalty(word: String): Int = if(word.contains("s")) -7 else 0
  
  // 要件1
  println(rankedWords(score, wordList) == List("csharp", "rust", "c++", "java"))

  // 要件2
  println(
    rankedWords(w => (score(w) + bonus(w)), wordList) == List(
      "csharp",
      "c++",
      "rust",
      "java",
    )
  )

  // 要件3
  println(
    rankedWords(w => (score(w) + bonus(w) + penalty(w) ), wordList) == List(
      "c++",
      "csharp",
      "java",
      "rust",
    )
  )
}
