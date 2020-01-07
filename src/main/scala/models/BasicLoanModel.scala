package models

import fields._

case class BasicLoanModel(originator: RequiredStringField[Originator],
                          originatorLoanId: RequiredStringField[OriginatorLoanId],
                          // originatorNoteId: OptionalStringField[OriginatorNoteId]
                                    ) extends AssetModel {

  // TODO add note id
  val id = s"$originator$originatorLoanId"

}
