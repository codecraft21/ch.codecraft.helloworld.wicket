/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.protocol.http.WebApplication

/**
 * Code Craft Software, 2012
 *
 * @author chris
 *
 */
class WicketApplication extends WebApplication {

  override def getHomePage = classOf[HomePage]

}
