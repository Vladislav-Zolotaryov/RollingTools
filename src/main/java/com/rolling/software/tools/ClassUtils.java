package com.rolling.software.tools;

import static com.rolling.software.tools.StringHelper.str;

public final class ClassUtils {

  private ClassUtils() {}

  public static <T> T cast(Object object, Class<T> classy) throws ClassCastException {
    if (classy.isInstance(object)) {
      return classy.cast(object);
    } else {
      throw new ClassCastException(
          str("Cannot cast object %s to class %s").args(object, classy).format());
    }
  }

}
