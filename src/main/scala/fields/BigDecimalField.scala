package fields

case class BigDecimalField[A](f: BigDecimal) extends AnyVal {

  override def toString: String = f.toString

}
