@main def runScript(): Unit = {

  def largerThan(n: Int)(i: Int): Boolean = i > n
  // 4よりも大きい数値が全て含まれた新しいListを返す
  println(List(5, 1, 2, 4, 0).filter(largerThan(4)) == List(5))
  // 1よりも大きい数値が全て含まれた新しいListを返す
  println(List(5, 1, 2, 4, 0).filter(largerThan(1)) == List(5, 2, 4))

  def divide(n: Int)(i: Int): Boolean = i % n == 0
  // 5で割り切れる数値だけが含まれた新しいListを返す。
  println(List(5, 1, 2, 4, 15).filter(divide(5)) == List(5, 15))
  // 2で割り切れる数値だけが含まれた新しいListを返す。
  println(List(5, 1, 2, 4, 15).filter(divide(2)) == List(2, 4))

  def lessThan(threshold: Int)(w: String): Boolean = w.length() < threshold
  // 4文字未満の単語を返す
  println(List("scala", "ada").filter(lessThan(4)) == List("ada"))
  // 7文字未満の単語を返す
  println(List("scala", "ada").filter(lessThan(7)) == List("scala", "ada"))
  
  def containChar(targetChar: Char, threshold: Int)(w: String): Boolean = threshold <= w.count(_ == targetChar)
  // 's'を3つ以上含んでいる単語を返す
  println(List("rust", "ada").filter(containChar('s', 3)) == List())
  // 文字's'を1つ以上含んでいる単語を返す
  println(List("rust", "ada").filter(containChar('s', 1)) == List("rust"))
}

