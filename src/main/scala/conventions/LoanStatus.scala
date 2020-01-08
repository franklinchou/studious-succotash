package conventions

import fields._

object LoanStatus {

  final val LOAN_STATUS_DESCRIPTION_MAPPING: Map[Int, String] =
    Map(
      0 -> "Current",
      1 -> "1 Missed Payment",
      2 -> "2 Missed Payments",
      3 -> "3 Missed Payments",
      4 -> "4+ Missed Payments",
      5 -> "Forbearance",
      6 -> "Reserved for future use",
      7 -> "Charged off",
      8 -> "Fully Paid",
      9 -> "Fully Prepaid"
    )

  def loanStatus(daysPastDue: IntField[DaysPastDue],
                 outstandingPrincipalEOP: BigDecimalField[OutstandingPrincipalEOP],
                 isChargedOff: Option[BooleanField[IsChargedOff]],
                 isPrepaid: Option[BooleanField[IsPrepaid]]): Int = {

    if (isChargedOff.isDefined && isChargedOff.get.f) 7
    else if (outstandingPrincipalEOP.f == 0) 8
    else if (isPrepaid.isDefined && isPrepaid.get.f) 9
    else if (daysPastDue.f <= 120) daysPastDue.f / 30
    else {
      throw new RuntimeException() // TODO How do we handle errors?
    }
  }

}
