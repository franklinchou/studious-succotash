package models

import conventions.LoanStatus
import fields._

case class GenericLoanModel(originator: StringField[Originator],
                            originatorLoanId: StringField[OriginatorLoanId],
                            periodEndDate: DateField[PeriodEndDate],
                            outstandingPrincipalBOP: BigDecimalField[OutstandingPrincipalBOP] = BigDecimalField[OutstandingPrincipalBOP](BigDecimal(0)),
                            outstandingPrincipalEOP: BigDecimalField[OutstandingPrincipalEOP] = BigDecimalField[OutstandingPrincipalEOP](BigDecimal(0)),
                            daysPastDue: IntField[DaysPastDue] = IntField[DaysPastDue](0),
                            isChargedOff: Option[BooleanField[IsChargedOff]] = None,
                            isPrepaid: Option[BooleanField[IsPrepaid]] = None,
                            originatorNoteId: Option[StringField[OriginatorNoteId]] = None
                           ) extends AssetModel {

  val id = s"$originator$originatorLoanId${originatorNoteId.map(_.f).getOrElse("")}"

  val loanStatus: Int = LoanStatus.loanStatus(daysPastDue, outstandingPrincipalEOP, isChargedOff, isPrepaid)

}
