package conventions

import java.time.LocalDate

import fields._
import models.GenericLoanModel
import org.scalatest.funspec.AnyFunSpec

class LoanStatusSpec extends AnyFunSpec {

  private def loan(dpd: Int): GenericLoanModel =
    GenericLoanModel(
      originator = StringField[Originator]("LC"),
      originatorLoanId = StringField[OriginatorLoanId]("1234"),
      periodEndDate = DateField[PeriodEndDate](LocalDate.of(2020, 1, 8)),
      daysPastDue = IntField[DaysPastDue](dpd),
      outstandingPrincipalEOP = BigDecimalField[OutstandingPrincipalEOP](BigDecimal(100))
    )

  describe("Loan status") {
    it ("should compute missed payment status") {
      val ms =
        Map(
          loan(1) -> 0,
          loan(30) -> 1,
          loan(31) -> 1,
          loan(61) -> 2,
          loan(91) -> 3,
          loan(120) -> 4
        )
      ms.foreach(m => assert(m._1.loanStatus == m._2))
    }
  }

}
