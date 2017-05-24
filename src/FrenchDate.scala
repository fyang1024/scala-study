import java.text.DateFormat._
import java.util.Locale

/**
  * Created by yangf on 8/08/2016.
  */

object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new java.util.Date()
    val df = getDateInstance(LONG, Locale.FRANCE)
    printf(df format now)
  }

}
