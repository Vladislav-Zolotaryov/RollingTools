package com.rolling.software.tools

import static com.rolling.software.tools.Lang.*
import static org.junit.Assert.*

import spock.lang.Specification

class LangTest extends Specification {
  def "Private constructor coverage hack"() {
    expect:
    TestUtils.testPrivateConstructor(Lang.class)
  }

  def "Not static method should invert logical parameter"() {
    expect:
    not(param) == expected

    where:
    param | expected
    true  | false
    false | true
  }
}
