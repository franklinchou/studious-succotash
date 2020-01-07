package models

import fields._

case class GenericLoanModel(originator: RequiredStringField[Originator],
                            originatorLoanId: RequiredStringField[OriginatorLoanId],
                            originatorNoteId: OptionalStringField[OriginatorNoteId[Option[String]]]
                           ) extends AssetModel {

  // TODO add note id
  val id = s"$originator$originatorLoanId"

}
