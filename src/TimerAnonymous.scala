/**
  * Created by yangf on 8/08/2016.
  */
object TimerAnonymous {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {callback(); Thread sleep 1000}
  }
  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("timer flies like an arrow..."))
  }
}
