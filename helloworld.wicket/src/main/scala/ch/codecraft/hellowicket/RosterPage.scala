package ch.codecraft.hellowicket

import collection.JavaConversions._
import collection.mutable.ArrayBuffer

import org.apache.wicket.markup.html.GenericWebPage
import org.apache.wicket.markup.html.basic._
import org.apache.wicket.markup.html.list._

import model._

class RosterPage extends GenericWebPage[List[Pilot]] {

    add(new Label("title", "Roster"))

    val pilot1 = Pilot("John Doe", "Viper 1")
    val pilot2 = Pilot("John Echo", "Viper 2")
    val pilot3 = Pilot("John Fox", "Viper 3")
    val pilots: java.util.List[Pilot] = ArrayBuffer(pilot1, pilot2, pilot3)

    val listview: ListView[Pilot] = new ListView("pilots", pilots) {
        override def populateItem(item: ListItem[Pilot]): Unit = {
            val pilot: Pilot = item.getModelObject()
            item.add(new Label("name", pilot.name));
            item.add(new Label("nick", pilot.nick));
        }
    }
    add(listview)

}
