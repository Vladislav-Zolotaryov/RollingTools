package com.rolling.software.tools

import static com.rolling.software.tools.Lang.*
import static org.junit.Assert.*

import spock.lang.Specification

class LangTest extends Specification {
  def "Not should invert logical parameter"() {
    expect:
    not(param) == expected

    where:
    param | expected
    true  | false
    false | true
  }

  def "Boolean helper and method should require both boolean values to be true"() {
    expect:
    of(param).and(other).val() == expected

    where:
    param | other | expected
    true  | true  | true
    true  | false | false
    false | true  | false
    false | false | false
  }

  def "Boolean helper or method should require at least one boolean value to be true"() {
    expect:
    of(param).or(other).val() == expected

    where:
    param | other | expected
    true  | true  | true
    true  | false | true
    false | true  | true
    false | false | false
  }

  def "Boolean helper methods should be able to chain expression"() {
    expect:
    of(param).and(other).and(last).val() == expected

    where:
    param | other | last  | expected
    true  | true  | true  | true
    true  | false | false | false
    false | true  | true  | false
    false | false | false | false
  }
}
