package models

import fields.{Originator, OriginatorLoanId, RequiredStringField}

trait LoanBorrowerModel {

  val originator: RequiredStringField[Originator]

  val originatorLoanId: RequiredStringField[OriginatorLoanId]

}