/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.markup.html.GenericWebPage
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.model.CompoundPropertyModel

import model._

class SecondPage extends GenericWebPage[Pilot] {

    setModel(new CompoundPropertyModel[Pilot](Pilot("John Doe", "Viper")))
    add(new Label("title", "Roster"))
    add(new Label("name"))
    add(new Label("nick"))

}
