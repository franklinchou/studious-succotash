package fields

case class IntField[A](f: Int) extends AnyVal {

  override def toString: String = f.toString

}

sealed trait DaysPastDue