package com.rolling.software.tools

import static com.rolling.software.tools.StringHelper.str
import static org.junit.Assert.*

import spock.lang.Specification

class StringHelperTest extends Specification {
  def "Should be able to format a simple string with arguments"() {
    expect:
    str(testString).args(parameter).format() == expected

    where:
    testString | parameter | expected
    "Hello %s" | "World"   | "Hello World"
  }

  def "Equal string helpers should be equal"() {
    expect:
    str("Test %s").args("One") == str("Test %s").args("One")
  }

  def "Different string helpers should not be equal"() {
    expect:
    str("Test %s").args("Two") != str("Test %s").args("One")
  }
}
