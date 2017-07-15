package com.rolling.software.tools

import static com.rolling.software.tools.BooleanHelper.*
import static org.junit.Assert.*

import spock.lang.Specification

class BooleanHelperTest extends Specification {
  def "When static method should create BooleanHelper"() {
    expect:
    when(true) instanceof BooleanHelper
  }

  def "Boolean helper not method should invert logical parameter"() {
    expect:
    when(param).not() == expected

    where:
    param | expected
    true  | false
    false | true
  }

  def "Boolean helper and method should require both boolean values to be true"() {
    expect:
    when(param).and(other).is() == expected

    where:
    param | other | expected
    true  | true  | true
    true  | false | false
    false | true  | false
    false | false | false
  }

  def "Boolean helper or method should require at least one boolean value to be true"() {
    expect:
    when(param).or(other).is() == expected

    where:
    param | other | expected
    true  | true  | true
    true  | false | true
    false | true  | true
    false | false | false
  }

  def "Boolean helper methods should be able to chain expression"() {
    expect:
    when(param).and(other).and(last).is() == expected

    where:
    param | other | last  | expected
    true  | true  | true  | true
    true  | false | false | false
    false | true  | true  | false
    false | false | false | false
  }
}
