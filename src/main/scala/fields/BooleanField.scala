package fields

case class BooleanField[A](f: Boolean) extends AnyVal {

  override def toString: String = f.toString

}

sealed trait IsChargedOff
sealed trait IsPrepaid