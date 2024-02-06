object P3_15 {
  def abbreviate(fullName: String): String = {
    var names = fullName.split(" ")
    var firstName = names(0).charAt(0)
    var lastName = names(1)

    s"$firstName. $lastName"
  }
}

@main def runScript(): Unit = {
  println(P3_15.abbreviate("Alonzo Church") == "A. Church");
  println(P3_15.abbreviate("A. Church") == "A. Church");
  println(P3_15.abbreviate("A Church") == "A. Church");
}
