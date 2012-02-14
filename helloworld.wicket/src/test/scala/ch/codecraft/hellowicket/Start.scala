/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.apache.wicket.util.time.Duration
import org.eclipse.jetty.http.ssl.SslContextFactory
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.bio.SocketConnector
import org.eclipse.jetty.server.ssl.SslSocketConnector
import org.eclipse.jetty.util.resource.Resource
import org.eclipse.jetty.webapp.WebAppContext

/**
 * Code Craft Software, 2012
 *
 * @author chris
 *
 */
object Start {

    def main(args: Array[String]): Unit = {
        val timeout = Duration.ONE_HOUR.getMilliseconds
    
        val server = new Server()
        val connector = new SocketConnector()

        // Set some timeout options to make debugging easier.
        connector.setMaxIdleTime(timeout.toInt)
        connector.setSoLingerTime(-1)
        connector.setPort(8080)
        server.addConnector(connector)

        // check if a keystore for a SSL certificate is available, and
        // if so, start a SSL connector on port 8443. By default, the
        // quickstart comes with a Apache Wicket Quickstart Certificate
        // that expires about half way september 2021. Do not use this
        // certificate anywhere important as the passwords are available
        // in the source.

        val keystore = Resource.newClassPathResource("/keystore")
        if (keystore != null && keystore.exists()) {
            connector.setConfidentialPort(8443)

            val factory = new SslContextFactory()
            factory.setKeyStoreResource(keystore)
            factory.setKeyStorePassword("wicket")
            factory.setTrustStore(keystore)
            factory.setKeyManagerPassword("wicket")
            val sslConnector = new SslSocketConnector(factory)
            sslConnector.setMaxIdleTime(timeout.toInt)
            sslConnector.setPort(8443)
            sslConnector.setAcceptors(4)
            server.addConnector(sslConnector)

            println("SSL access to the quickstart has been enabled on port 8443")
            println("You can access the application using SSL on https://localhost:8443")
            println
        }

        val bb = new WebAppContext()
        bb.setServer(server)
        bb.setContextPath("/")
        bb.setWar("src/main/webapp")

        // START JMX SERVER
        // MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        // MBeanContainer mBeanContainer = new MBeanContainer(mBeanServer);
        // server.getContainer().addEventListener(mBeanContainer);
        // mBeanContainer.start();

        server.setHandler(bb)

        try {
            println(">>> STARTING EMBEDDED JETTY SERVER, PRESS ANY KEY TO STOP")
            server.start()
            System.in.read()
            System.out.println(">>> STOPPING EMBEDDED JETTY SERVER")
            server.stop()
            server.join()
        } catch {
          case e: Exception =>
            e.printStackTrace()
            System.exit(1)
        }
    }

}
