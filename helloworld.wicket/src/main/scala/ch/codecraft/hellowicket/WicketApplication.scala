/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.protocol.http.WebApplication
import org.apache.wicket.session.ISessionStore
import org.apache.wicket.session.HttpSessionStore

class WicketApplication extends WebApplication {

    override def getHomePage = classOf[HomePage]

}
