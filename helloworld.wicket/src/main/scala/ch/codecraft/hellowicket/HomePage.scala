/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.request.component.IRequestablePage
import org.apache.wicket.behavior.Behavior
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.markup.html.basic.Label

/**
 * Code Craft Software, 2012
 *
 * @author chris
 *
 */
class HomePage(val parameters: PageParameters) extends WebPage {

  add(new Label("version", getApplication().getFrameworkSettings().getVersion()))
  add(new Label("hwtitle", "Hi there, Wicket!"))

}
