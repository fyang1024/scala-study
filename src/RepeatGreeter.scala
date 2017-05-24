/**
  * Created by yangf on 19/09/2016.
  */
class RepeatGreeter (greeting: String, count: Int) {
  def this(greeting: String) = this(greeting, 1)
  def greet(): Unit = {
    for (i <- 1 to count)
      println(greeting)
  }
}
