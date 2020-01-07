package models

import fields.{Originator, OriginatorLoanId, RequiredStringField}
import org.scalatest.funspec.AnyFunSpec

class GenericBaseModelSpec extends AnyFunSpec {

  describe("A generic base model") {
    it("should be created") {
      val m =
        GenericBaseModel(
          originator = RequiredStringField[Originator]("LC"),
          originatorLoanId = RequiredStringField[OriginatorLoanId]("1234"),
          // originatorNoteId = OptionalStringField[OriginatorNoteId](Some(""))
        )

      // TODO use implicit conversion here?
      assert(m.originator == RequiredStringField[Originator]("LC"))
      assert(m.originatorLoanId == RequiredStringField[OriginatorLoanId]("1234"))
    }

  }

}
