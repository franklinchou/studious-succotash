package models

import fields._

case class GenericLoanModel(originator: StringField[Originator],
                            originatorLoanId: StringField[OriginatorLoanId],
                            originatorNoteId: Option[StringField[OriginatorNoteId]] = None
                           ) extends AssetModel {

  val id = s"$originator$originatorLoanId${originatorNoteId.map(_.f).getOrElse("")}"

}
