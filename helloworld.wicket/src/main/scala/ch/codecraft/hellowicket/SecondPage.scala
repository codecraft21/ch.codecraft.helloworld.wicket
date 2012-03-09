/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.markup.html.GenericWebPage
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.model.Model

import model._

class SecondPage extends GenericWebPage[Pilot] {

    setModel(new Model[Pilot](Pilot("John Doe", "Viper")))
    add(new Label("title", "Roster"))
    //TODO there's got to be a nicer way
    add(new Label("pilot.name", getModel().getObject().name))
    add(new Label("pilot.nick", getModel().getObject().nick))

}
