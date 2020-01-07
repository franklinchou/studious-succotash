package fields

case class RequiredIntField[A](f: Int) extends AnyVal {

  override def toString: String = f.toString

}
