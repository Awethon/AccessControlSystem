package server.tables

import java.util.concurrent.TimeUnit

import slick.jdbc.H2Profile.api._
import slick.lifted.Tag

import scala.concurrent.Await
import scala.concurrent.duration.Duration

final case class Card(
                     id : Option[Int],
                     hasAccess : Boolean,
                     priorityAccess : Boolean,
                     groupId : Int
                     )

final class CardTable(tag: Tag) extends Table[Card](tag, "CARD") {
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def hasAccess = column[Boolean]("HASACCESS")

  def priorityAccess = column[Boolean]("PRIORITYACCESS")

  def groupId = column[Int]("GROUPID")

  def * = (id, hasAccess, priorityAccess, groupId).mapTo[Card]
}