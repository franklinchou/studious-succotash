package fields

case class RequiredStringField[A](f: String) extends AnyVal {

  override def toString: String = f

}

sealed trait OriginatorLoanId
sealed trait Originator
