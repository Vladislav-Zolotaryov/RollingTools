package com.rolling.software.tools.collections;

import com.rolling.software.tools.LazyRuntimeException;
import com.rolling.software.tools.StringHelper;

public class EmptyCollectionException extends LazyRuntimeException {

  private static final long serialVersionUID = -3871736956885789674L;

  public EmptyCollectionException(String message) {
    super(message);
  }

  public EmptyCollectionException(StringHelper message) {
    super(message);
  }

}
