object P2_18 {
    def getDiscountPercentage(items: List[String]): Int = {
        if(items.contains("Book")){
            5
        }else {
            0
        }
    }
}

@main def runScript(): Unit = {
  println(P2_18.getDiscountPercentage(List("Apple")) == 0);
  println(P2_18.getDiscountPercentage(List("Book")) == 5);
}