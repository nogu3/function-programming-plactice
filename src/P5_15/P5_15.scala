@main def runScript(): Unit = {
  val result = for {
    x <- xs
    y <- ys
  } yield Point(x, y)

  println(result)

  val result3d = for {
    x <- xs3
    y <- ys3
    z <- zs3
  } yield Point3d(x, y, z)

  println(result3d)

  val result3dforflatMap = xs3.flatMap(x => ys3.flatMap(y => zs3.map(z => Point3d(x, y, z))))

  println(result3dforflatMap)
}

case class Point(x: Int, y: Int)

val xs = List(1)
val ys = List(-2, 7)

case class Point3d(x: Int, y: Int, z: Int)

val xs3 = List(1)
val ys3 = List(-2, 7)
val zs3 = List(3, 4)
