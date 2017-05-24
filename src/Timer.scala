/**
  * Created by yangf on 8/08/2016.
  */
object Timer {
  def oncePerSecond(callback: () => Unit) {
    while(true) {callback(); Thread sleep 1000}
  }
  def timeFlies() {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}
