package fields

case class OptionalStringField[Option[String]](f: Option[String]) extends AnyVal

sealed trait OriginatorNoteId[Option[String]]
