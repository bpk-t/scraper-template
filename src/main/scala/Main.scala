
import scalikejdbc._
import scalikejdbc.config._
import scalaj.http._

case class Test1(id: Int)
object Test1 extends SQLSyntaxSupport[Test1] {
  override def tableName: String = "test1"
  def apply(rs: WrappedResultSet) = new Test1(rs.int("id"))
}

object Main extends App {
  DBs.setup()

  val response = Http("URL")
    .postForm(Seq()).asString

  if (response.isSuccess) {

    println(response.body)
  } else {
    println("error")
  }

  /*
  DB.localTx { implicit session =>
    1 to 1000 foreach { id =>
      sql"insert into test1(id) values(${id})".update.apply()
    }
  }

  DB readOnly { implicit session =>
    val list = sql"select * from test1".map(Test1(_)).list().apply()
    val sum = list.map(_.id).sum
    println(s"sum = $sum")
  }
  */
  println("hello world")
}
