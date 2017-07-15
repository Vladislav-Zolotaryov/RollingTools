package com.rolling.software.tools.arrays

import static com.rolling.software.tools.arrays.ArrayUtils.last
import static org.junit.Assert.*

import com.rolling.software.tools.TestUtils

import spock.lang.Specification

class ArrayUtilsTest extends Specification {
  def "Private constructor coverage hack"() {
    expect:
    TestUtils.testPrivateConstructor(ArrayUtils.class)
  }

  def "Last should return the last element of array"() {
    setup:
    def first = "First one"
    def middle = "Middle one"
    def expectedLast = "Last to be"
    String[] array = [first, middle, expectedLast]

    expect:
    last(array) == expectedLast
  }

  def "Last should throw empty array exception if array is empty"() {
    when:
    String[] array = []
    last(array)

    then:
    thrown EmptyArrayException
  }

  def "Last should throw empty array exception if array is null"() {
    when:
    last(null)

    then:
    thrown EmptyArrayException
  }
}
