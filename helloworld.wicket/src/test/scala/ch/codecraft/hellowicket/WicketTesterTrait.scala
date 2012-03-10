package ch.codecraft.hellowicket

import org.apache.wicket.util.tester.WicketTester
import org.junit.Before

trait WicketTesterTrait {

    var tester: WicketTester = _

    @Before
    def setUp(): Unit = {
        tester = new WicketTester(new WicketApplication())
    }

}
