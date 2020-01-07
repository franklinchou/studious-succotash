package models

import fields._

case class GenericLoanModel(originator: RequiredStringField[Originator],
                            originatorLoanId: RequiredStringField[OriginatorLoanId],
                            originatorNoteId: OptionalStringField[OriginatorNoteId[Option[String]]]
                           ) extends AssetModel {

  val id = s"$originator$originatorLoanId${originatorNoteId.f.getOrElse("")}"

}
