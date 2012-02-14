/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.protocol.http.WebApplication

class WicketApplication extends WebApplication {

    override def getHomePage = classOf[HomePage]

}
