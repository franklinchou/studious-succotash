package fields

case class OptionalStringField[A](f: Option[String]) extends AnyVal

sealed trait OriginatorNoteId[A]
