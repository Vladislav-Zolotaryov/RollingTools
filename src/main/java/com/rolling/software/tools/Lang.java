package com.rolling.software.tools;

public final class Lang {

  private Lang() {}

  public static boolean not(boolean condition) {
    return !condition;
  }

  public static BooleanHelper when(boolean parameter) {
    return new BooleanHelper(parameter);
  }

}
