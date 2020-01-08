package models

import java.time.LocalDate

import fields._
import org.scalatest.funspec.AnyFunSpec

class GenericLoanModelSpec extends AnyFunSpec {

  describe("Note id") {
    val m =
      GenericLoanModel(
        originator = StringField[Originator]("LC"),
        originatorLoanId = StringField[OriginatorLoanId]("1234"),
        periodEndDate = DateField[PeriodEndDate](LocalDate.of(2020, 1, 8))
      )

    it("should be none") {
      assert(m.originatorNoteId.isEmpty)
    }

    it("should have an id") {
      assert(m.id == "LC1234")
    }

  }

  describe("A generic loan borrower model") {
    val m =
      GenericLoanModel(
        originator = StringField[Originator]("LC"),
        originatorLoanId = StringField[OriginatorLoanId]("1234"),
        periodEndDate = DateField[PeriodEndDate](LocalDate.of(2020, 1, 8)),
        originatorNoteId = Some(StringField[OriginatorNoteId]("A"))
      )

    it("should be created") {
      // TODO Can I use implicit conversions here?
      assert(m.originator == StringField[Originator]("LC"))
      assert(m.originatorLoanId == StringField[OriginatorLoanId]("1234"))
      assert(m.originatorNoteId.contains(StringField[OriginatorNoteId]("A")))
      assert(m.periodEndDate == DateField[PeriodEndDate](LocalDate.of(2020, 1, 8)))
    }

    it("should have an id") {
      assert(m.id == "LC1234A")
    }

  }

}
