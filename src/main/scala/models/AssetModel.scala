package models

import fields.{Originator, OriginatorLoanId, RequiredStringField}

trait AssetModel {

  val originator: RequiredStringField[Originator]

  val originatorLoanId: RequiredStringField[OriginatorLoanId]

}