@main def runScript(): Unit = {

  // 1
  println(List(5, 1, 2, 4, 100).foldLeft(0)((total, n) => total + n) == 112)

  // 2
  println(List("scala", "rust", "ada").foldLeft(0)((total, word) => total + word.length()) == 12)

  // 3
  println(List("scala", "haskell", "rust", "ada").foldLeft(0)((total, word) => total + word.count(_ == 's')) == 3)

  // 4
  println(List(5, 1, 2, 4, 15).foldLeft(0)((max, n) => if(max < n) n else max) == 15)
}
