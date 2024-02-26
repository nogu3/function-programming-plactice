@main def runScript(): Unit = {
  println(List("scala", "rust", "ada").filter(w => w.length() < 5) == List("rust", "ada"))
  println(List("rust", "ada").filter(w => 3 <= w.count(_ == 's')) == List())
  println(List(5, 1, 2, 4, 0).filter(n => n % 2 == 1) == List(5, 1))
  println(List(5, 1, 2, 4, 0).filter(n => 4 < n) == List(5))
}
