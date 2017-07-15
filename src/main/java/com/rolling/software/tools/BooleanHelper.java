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

  public boolean is() {
    return condition;
  }

  public boolean not() {
    return !condition;
  }

  public static BooleanHelper when(boolean parameter) {
    return new BooleanHelper(parameter);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (condition ? 1231 : 1237);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BooleanHelper other = (BooleanHelper) obj;
    return condition != other.condition;
  }

  @Override
  public String toString() {
    return "BooleanHelper [condition=" + condition + "]";
  }

}
