@main def runScript(): Unit = {
  val friends = List("Alice", "Bob", "Charlie")
  // 友人が推薦するすべての本のリストを求める
  // TODO flat_mapや_を使う
  val recommendations = friends
    .map(friend => recommendedBooks(friend))
    .flatten

  println(recommendations)

  // TODO
  // 彼らが進める著者のリストを求める。
  val authors = recommendations
    .flatMap(_.authors)

  println(authors)
}

case class Book(title: String, authors: List[String])

def recommendedBooks(friend: String): List[Book] = {
  val scala = List(
    Book("FP in Scala", List("Chiusano", "Bjarnason")),
    Book("Get Programming with Scala", List("Sfregola"))
  )

  val fiction = List(
    Book("Harry Potter", List("Rowling")),
    Book("The Lord of the Rings", List("Tolkien"))
  )

  if (friend == "Alice")
    return scala
  else if (friend == "Bob")
    return fiction
  else
    return List.empty
}
