package models

import fields.{OptionalStringField, Originator, OriginatorLoanId, OriginatorNoteId, RequiredStringField}
import org.scalatest.funspec.AnyFunSpec

class GenericLoanModelSpec extends AnyFunSpec {

  describe("A generic loan borrower model") {
    val m =
      GenericLoanModel(
        originator = RequiredStringField[Originator]("LC"),
        originatorLoanId = RequiredStringField[OriginatorLoanId]("1234"),
        originatorNoteId = OptionalStringField[OriginatorNoteId[Option[String]]](Some("A"))
      )

    it("should be created") {
      // TODO Can I use implicit conversions here?
      assert(m.originator == RequiredStringField[Originator]("LC"))
      assert(m.originatorLoanId == RequiredStringField[OriginatorLoanId]("1234"))
      assert(m.originatorNoteId == OptionalStringField[OriginatorNoteId[Option[String]]](Some("A")))
    }

    it("should have an id") {
      assert(m.id == "LC1234")
    }

  }

}
