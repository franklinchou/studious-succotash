package fields

case class RequiredBooleanField[A](f: Boolean) extends AnyVal {

  override def toString: String = f.toString

}
