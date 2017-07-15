package com.rolling.software.tools

class TestUtils {
  static def testPrivateConstructor(Class<?> classy) {
    def constructor = classy.getDeclaredConstructor()
    constructor.setAccessible(true)
    def instance = constructor.newInstance()
    return classy.isInstance(instance)
  }
}
