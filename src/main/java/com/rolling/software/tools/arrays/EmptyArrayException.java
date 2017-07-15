package com.rolling.software.tools.arrays;

import com.rolling.software.tools.LazyRuntimeException;
import com.rolling.software.tools.StringHelper;

public class EmptyArrayException extends LazyRuntimeException {

  private static final long serialVersionUID = 1689118940959060003L;

  public EmptyArrayException(String message) {
    super(message);
  }

  public EmptyArrayException(StringHelper message) {
    super(message);
  }

}
