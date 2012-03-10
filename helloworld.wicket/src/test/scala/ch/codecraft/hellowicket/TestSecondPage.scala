package ch.codecraft.hellowicket

import org.junit.Test

class TestSecondPage extends WicketTesterTrait {

    @Test
    def secondPageIsRenderedSuccessfully(): Unit = {
        tester.startPage(classOf[SecondPage])
        tester.assertLabel("title", "Roster")
        tester.assertLabel("name", "John Doe")
        tester.assertLabel("nick", "Viper")
    }

}
