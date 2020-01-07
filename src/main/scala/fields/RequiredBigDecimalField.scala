package fields

case class RequiredBigDecimalField[A](f: BigDecimal) extends AnyVal {

  override def toString: String = f.toString()

}
