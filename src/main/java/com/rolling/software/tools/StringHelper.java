package com.rolling.software.tools;

import java.util.Arrays;

public class StringHelper {

  private final String template;

  private Object[] args = new Object[] {};

  public StringHelper(String template) {
    this.template = template;
  }

  public String getTemplate() {
    return template;
  }

  public StringHelper args(Object... args) {
    this.args = args;
    return this;
  }

  public String format() {
    return String.format(template, args);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(args);
    result = prime * result + ((template == null) ? 0 : template.hashCode());
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
    StringHelper other = (StringHelper) obj;
    if (!Arrays.equals(args, other.args))
      return false;
    if (template == null) {
      if (other.template != null)
        return false;
    } else if (!template.equals(other.template))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return format();
  }

  public static StringHelper str(String tempalate) {
    return new StringHelper(tempalate);
  }

}
