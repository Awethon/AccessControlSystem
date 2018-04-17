package server.tables

import java.sql.Time
import java.util.concurrent.TimeUnit

import slick.jdbc.H2Profile.api._
import slick.lifted.Tag

import scala.concurrent.Await
import scala.concurrent.duration.Duration

final case class Log(
                      cardId : Int,
                      dateTime : Time,
                      eventType : Boolean,
                      success : Boolean
                     )

final class LogTable(tag: Tag) extends Table[Log](tag, "LOG") {
  def cardId = column[Int]("CARDID")

  def dateTime = column[Time]("DATETIME")

  def eventType = column[Boolean]("EVENTTYPE")

  def success = column[Boolean]("SUCCESS")

  def * = (cardId, dateTime, eventType, success).mapTo[Log]
}