package com.rolling.software.tools;

public class Lang {

  public static boolean not(boolean condition) {
    return !condition;
  }

  public static BooleanHelper of(boolean parameter) {
    return new BooleanHelper(parameter);
  }

}
