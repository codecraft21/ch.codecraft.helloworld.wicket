/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.link.Link

class HomePage(val parameters: PageParameters) extends WebPage {

    add(new Label("version", getApplication().getFrameworkSettings().getVersion()))
    add(new Label("hwtitle", "Hi there, Wicket!"))

    add(new Link("secondPage") {
        def onClick(): Unit = {
            setResponsePage(classOf[SecondPage])
        }
    })
}
