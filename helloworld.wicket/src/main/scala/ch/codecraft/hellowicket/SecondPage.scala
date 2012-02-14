/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.markup.html.GenericWebPage
import org.apache.wicket.markup.html.basic.Label
//import org.apache.wicket.model.Model

import model._

class SecondPage extends GenericWebPage[Pilot] {

    //FIXME: setModel(new Model(Pilot("Joe")))
    add(new Label("title", "Roster"))
    add(new Label("pilot.name", "Joe"))

}
