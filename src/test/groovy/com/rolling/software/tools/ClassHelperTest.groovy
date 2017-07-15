package com.rolling.software.tools

import static com.rolling.software.tools.ClassUtils.cast
import static org.junit.Assert.*

import spock.lang.Specification

class ClassHelperTest extends Specification {
  def "Private constructor coverage hack"() {
    expect:
    TestUtils.testPrivateConstructor(ClassUtils.class)
  }

  def "Should be able to cast object to provided, valid class"() {
    setup:
    Object object = new String("TEST")

    expect:
    String result = cast(object, String.class)
    String.class.isInstance(object) == true
  }

  def "Should be should throw class cast exception if invalid class provided"() {
    setup:
    Object object = new String("TEST_INVALID")

    when:
    cast(object, BigDecimal.class)

    then:
    thrown ClassCastException
  }
}
