import scala.compiletime.ops.int
@main def runScript(): Unit = {
  val points = List(Point(5, 2), Point(1, 1))
  val riskyRadiuses = List(-10, 0, 2)

  def isInside(point: Point, radius: Int): Boolean = {
    radius * radius >= point.x * point.x + point.y * point.y
  }

  val result = for {
    r <- riskyRadiuses
    point <- points.filter(p => isInside(p, r))
  } yield s"$point is within a radius of $r"

  println(result)

  // 1
  val result1 = for {
    r <- riskyRadiuses.filter(r => 0 < r)
    point <- points.filter(p => isInside(p, r))
  } yield s"$point is within a radius of $r"

  println(result1)

  // 2
  val result2 = for {
    r <- riskyRadiuses
    if 0 < r
    point <- points.filter(p => isInside(p, r))
  } yield s"$point is within a radius of $r"

  println(result2)


  def insideFilter(point: Point, r: Int): List[Point] = {
    if (r <= 0) {
      return List.empty
    }

    if (isInside(point, r)) List(point) else List.empty 
  }

  // 3
  val result3 = for {
    r <- riskyRadiuses
    point <- points
    inPoint <- insideFilter(point, r)
  } yield s"$point is within a radius of $r"

  println(result3)
}

case class Point(x: Int, y: Int)
