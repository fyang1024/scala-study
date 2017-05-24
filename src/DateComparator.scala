/**
  * Created by yangf on 9/08/2016.
  */
object DateComparator {
  def main(args: Array[String]) {
    def date1 = new Date(1998, 12, 30)
    def date2 = new Date(1998, 12, 31)
    def date3 = new Date(2000, 1, 1)
    println("date1 > date2 ? " + (date1 > date2))
    println("date2 > date3 ? " + (date2 > date3))
    println("date3 > date1 ? " + (date3 > date1))
  }
}
