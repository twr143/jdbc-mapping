package quill
import io.getquill._
import model.Model2.{City, CityId}

/**
  * Created by Ilya Volynin on 24.09.2019 at 12:18.
  */
object E1 {

  def main(args: Array[String]): Unit = {
    lazy val ctx = new PostgresJdbcContext(SnakeCase, "q-ctx")
    import ctx._
    val r = quote(query[City].filter(c => c.name.toLowerCase like "%wars%"))
    println(ctx.run(r))

    val str = quote(query[City].insert(_.name-> lift( "New York"), _.population -> lift(100000),_.area-> 1000))
    println(ctx.run(str))
  }
}
