package com.rolling.software.tools.collections

import static com.rolling.software.tools.collections.CollectionUtils.*
import static org.junit.Assert.*

import com.rolling.software.tools.TestUtils

import spock.lang.Specification

class CollectionUtilsTest extends Specification {
  def "Private constructor coverage hack"() {
    expect:
    TestUtils.testPrivateConstructor(CollectionUtils.class)
  }

  def "First should return first element"() {
    setup:
    def expectedFirst = "First one"
    def middle = "Middle one"
    def last = "Last to be"
    def collection = [expectedFirst, middle, last]

    expect:
    first(collection).get() == expectedFirst
  }

  def "First should return empty optional for empty collection"() {
    setup:
    def collection = []

    expect:
    first(collection) == Optional.empty()
  }

  def "First or throw should return first element"() {
    setup:
    def expectedFirst = "First one"
    def middle = "Middle one"
    def last = "Last to be"
    def collection = [expectedFirst, middle, last]

    expect:
    firstOrThrow(collection) == expectedFirst
  }

  def "First or throw should throw empty collection exception for empty collection"() {
    when:
    firstOrThrow([])

    then:
    thrown EmptyCollectionException
  }

  def "Last should return last element"() {
    setup:
    def first = "First one"
    def middle = "Middle one"
    def expectedLast = "Last to be"
    def collection = [first, middle, expectedLast]

    expect:
    last(collection).get() == expectedLast
  }

  def "Last should return empty optional for empty collection"() {
    setup:
    def collection = []

    expect:
    last(collection) == Optional.empty()
  }

  def "Last or throw should return last element"() {
    setup:
    def first = "First one"
    def middle = "Middle one"
    def expectedLast = "Last to be"
    def collection = [first, middle, expectedLast]

    expect:
    lastOrThrow(collection) == expectedLast
  }

  def "Last or throw should throw empty collection exception for empty collection"() {
    when:
    lastOrThrow([])

    then:
    thrown EmptyCollectionException
  }
}
