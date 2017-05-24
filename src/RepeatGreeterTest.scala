/**
  * Created by yangf on 19/09/2016.
  */
object RepeatGreeterTest {
  def main(args: Array[String]) {
    val g1 = new RepeatGreeter("Hello, world", 3)
    g1.greet()
    val g2 = new RepeatGreeter("Hi there")
    g2.greet()
  }
}
