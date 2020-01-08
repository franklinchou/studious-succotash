package fields

case class StringField[A](f: String) extends AnyVal {

  override def toString: String = f

}

sealed trait OriginatorLoanId
sealed trait Originator
sealed trait OriginatorNoteId