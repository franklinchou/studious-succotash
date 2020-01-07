package models

import fields._

case class GenericBaseModel(originator: RequiredStringField[Originator],
                            originatorLoanId: RequiredStringField[OriginatorLoanId],
                            // originatorNoteId: OptionalStringField[OriginatorNoteId]
                           )
