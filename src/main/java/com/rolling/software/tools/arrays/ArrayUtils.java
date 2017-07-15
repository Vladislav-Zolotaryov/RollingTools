package com.rolling.software.tools.arrays;

import static com.rolling.software.tools.StringHelper.str;

public final class ArrayUtils {

  private ArrayUtils() {}

  public static <T> T last(T[] array) throws EmptyArrayException {
    if (array == null) {
      throw new EmptyArrayException("Provided array was null");
    }

    if (array.length > 0) {
      return array[array.length - 1];
    } else {
      throw new EmptyArrayException(str("Array %s was empty").args(array));
    }
  }

}
