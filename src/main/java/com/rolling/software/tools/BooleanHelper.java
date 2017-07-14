package com.rolling.software.tools;

public class BooleanHelper {

  private boolean condition;

  public BooleanHelper(boolean condition) {
    this.condition = condition;
  }

  public BooleanHelper and(boolean chain) {
    return new BooleanHelper(condition && chain);
  }

  public BooleanHelper or(boolean chain) {
    return new BooleanHelper(condition || chain);
  }

  public boolean val() {
    return condition;
  }

}
