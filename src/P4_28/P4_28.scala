@main def runScript(): Unit = {
  println(List("scala", "rust", "ada").map(w => w.length()) == List(5, 4, 3))
  println(List("rust", "ada").map(w => w.count(_ == 's')) == List(1, 0))
  println(List(5, 1, 2, 4, 0).map(n => -n) == List(-5, -1, -2, -4, 0))
  println(List(5, 1, 2, 4, 0).map(n => n * 2) == List(10, 2, 4, 8, 0))
}
