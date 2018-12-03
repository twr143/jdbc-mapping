package slick
import slick.TrackType.TrackType

/**
  * Created by Ilya Volynin on 03.12.2018 at 9:35.
  */
case class CityId(id: Int) extends AnyVal
case class City(id: CityId, name: String, population: Int, area: Float, link: Option[String])

case class MetroSystemId(id: Int) extends AnyVal
case class MetroSystem(id: MetroSystemId, cityId: CityId, name: String, dailyRidership: Int)

case class MetroLineId(id: Int) extends AnyVal
case class MetroLine(id: MetroLineId, systemId: MetroSystemId, name: String, stationCount: Int, trackType: TrackType)

object TrackType extends Enumeration {
  type TrackType = Value
  val Rail = Value(1)
  val Monorail = Value(2)
  val Rubber = Value(3)

  def byId(id: Int): Option[TrackType] = TrackType.values.find(_.id == id)
  def byIdOrThrow(id: Int): TrackType = byId(id).getOrElse(throw new IllegalArgumentException(s"Unknown track type: $id"))
}