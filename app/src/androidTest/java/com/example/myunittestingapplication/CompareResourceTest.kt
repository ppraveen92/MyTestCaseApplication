package com.example.myunittestingapplication

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class CompareResourceTest {

    lateinit var compareResource: CompareResource

    @Before
    fun setup() {
        compareResource = CompareResource()
    }

    fun tearDown() {
        //close after the usage
    }

    @Test
    fun resourceAndStringIsSameReturnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = compareResource.isEqual(context, R.string.test_resource, "Just Testing you")
        assertThat(result).isTrue()
    }

    @Test
    fun resourceAndStringIsDifferentReturnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = compareResource.isEqual(context, R.string.test_resource, "Just Tested you")
        assertThat(result).isFalse()
    }
}