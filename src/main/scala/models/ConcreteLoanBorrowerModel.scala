package models

import fields._

case class ConcreteLoanBorrowerModel(originator: RequiredStringField[Originator],
                                     originatorLoanId: RequiredStringField[OriginatorLoanId],
                                     // originatorNoteId: OptionalStringField[OriginatorNoteId]
                                    ) extends LoanBorrowerModel
