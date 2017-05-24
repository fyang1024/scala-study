/**
  * Created by yangf on 9/08/2016.
  */
class Reference[T] {
  private var content: T = _

  def set(value: T) {content = value}
  def get: T = content
}
