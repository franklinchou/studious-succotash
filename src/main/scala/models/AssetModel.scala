package models

import fields.{Originator, OriginatorLoanId, StringField}

trait AssetModel {

  val originator: StringField[Originator]

  val originatorLoanId: StringField[OriginatorLoanId]

}