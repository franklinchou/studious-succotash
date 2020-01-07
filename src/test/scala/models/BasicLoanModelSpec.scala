package models

import fields.{Originator, OriginatorLoanId, RequiredStringField}
import org.scalatest.funspec.AnyFunSpec

class BasicLoanModelSpec extends AnyFunSpec {

  describe("A generic loan borrower model") {
    val m =
      BasicLoanModel(
        originator = RequiredStringField[Originator]("LC"),
        originatorLoanId = RequiredStringField[OriginatorLoanId]("1234"),
        // originatorNoteId = OptionalStringField[OriginatorNoteId](Some(""))
      )

    it("should be created") {
      // TODO use implicit conversion here?
      assert(m.originator == RequiredStringField[Originator]("LC"))
      assert(m.originatorLoanId == RequiredStringField[OriginatorLoanId]("1234"))
    }

    it("should have an id") {
      assert(m.id == "LC1234")
    }

  }

}
