package com.example.myunittestingapplication

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistration("", "12345678", "12345678")
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistration("rahul", "", "12345678")
        assertThat(result).isFalse()
    }

    @Test
    fun `empty confirm password returns false`() {
        val result = RegistrationUtil.validateRegistration("rahul", "12345678", "")
        assertThat(result).isFalse()
    }

    @Test
    fun `password mismatched with confirm returns false`() {
        val result = RegistrationUtil.validateRegistration("rahul", "12345678", "123")
        assertThat(result).isFalse()
    }

    @Test
    fun `password length is less than 8 returns false`() {
        val result = RegistrationUtil.validateRegistration("rahul", "1233", "123")
        assertThat(result).isFalse()
    }

    @Test
    fun `username already exist`() {
        val result = RegistrationUtil.validateRegistration("praveen", "12345678", "12345678")
        assertThat(result).isFalse()
    }

    @Test
    fun `all inputs are valid returns true`() {
        val result = RegistrationUtil.validateRegistration("rahul", "12345678", "123")
        assertThat(result).isTrue()
    }
}