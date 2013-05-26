package ch.codecraft.hellowicket

import collection.JavaConversions._
import collection.mutable.ArrayBuffer

import org.junit.Test

import model._

class TestRosterPage extends WicketTesterTrait {

    val pilot1 = Pilot("John Doe", "Viper 1")
    val pilot2 = Pilot("John Echo", "Viper 2")
    val pilot3 = Pilot("John Fox", "Viper 3")
    val pilots: java.util.List[Pilot] = ArrayBuffer(pilot1, pilot2, pilot3)

    @Test
    def rosterPageIsRenderedSuccessfully(): Unit = {
        tester.startPage(classOf[RosterPage])
        tester.assertLabel("title", "Roster")
        tester.assertListView("pilots", pilots)
    }

}
