package com.tomtresansky.hydrateme

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest2 {
    @Test
    fun testIntakeConversion() {
        val scenario = launchActivity<CreateEntryActivity>()

        onView(withId(R.id.intake_edit_text)).perform(typeText("1000"))
        onView(withId(R.id.add_entry_button)).perform(click())

        val resultData = scenario.result.resultData
        val intake = resultData.getIntExtra("intake", 0)

        Assert.assertEquals(1000, intake)
    }
}