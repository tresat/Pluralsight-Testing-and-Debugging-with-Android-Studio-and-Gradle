package com.tomtresansky.hydrateme

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ExambleRobolectricTest {
    val context = ApplicationProvider.getApplicationContext<Context>()

    @Test
    fun verify_doneString() {
        val entrySaved = context.getString(R.string.entry_saved)
        assert(entrySaved == "Entry saved. Great going!")
    }
}
