package models

import fields._

case class ConcreteLoanBorrowerModel(originator: RequiredStringField[Originator],
                                     originatorLoanId: RequiredStringField[OriginatorLoanId],
                                     // originatorNoteId: OptionalStringField[OriginatorNoteId]
                                    ) extends LoanBorrowerModel {

  // TODO add note id
  val id = s"$originator$originatorLoanId"

}
