/**
 * Code Craft Software, 2012
 */
package ch.codecraft.hellowicket

import org.junit.Test

class TestHomePage extends WicketTesterTrait {

    @Test
    def homepageRendersSuccessfully(): Unit = {
        // start and render the test page
        tester.startPage(classOf[HomePage])

        // assert rendered page class
        tester.assertRenderedPage(classOf[HomePage])
    }

    @Test
    def secondPageIsLinked(): Unit = {
        tester.startPage(classOf[HomePage])
        tester.clickLink("secondPage")
        tester.assertRenderedPage(classOf[SecondPage])
    }

}
