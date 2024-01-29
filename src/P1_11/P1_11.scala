@main def runScript(): Unit = {
  println(increment(0));
  println(getFirstCharacter("abc"));
  println(wordScore("abc"));
}

def increment(x: Int): Int = {
  x+1
}

def getFirstCharacter(s: String): Char = {
  s.charAt(0)
}

def wordScore(word: String): Int = {
  word.length()
}