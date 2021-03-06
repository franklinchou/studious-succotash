package fields

import java.time.LocalDate

case class DateField[A](f: LocalDate) extends AnyVal {

  override def toString: String = f.toString

}

sealed trait PeriodEndDate
