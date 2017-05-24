/**
  * Created by yangf on 8/08/2016.
  */
class Complex (real: Double, imaginary: Double) {
  def re: Double = real
  def im: Double = imaginary
  override def toString: String = "" + re + (if (im < 0) "" else "+") + im + "i"
}
