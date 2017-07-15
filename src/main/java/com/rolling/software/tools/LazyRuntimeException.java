package com.rolling.software.tools;

import static com.rolling.software.tools.StringHelper.str;

public class LazyRuntimeException extends RuntimeException {

  private static final long serialVersionUID = -6663756572762727717L;

  private final StringHelper message;

  public LazyRuntimeException(String message) {
    this.message = str(message);
  }

  public LazyRuntimeException(StringHelper message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message.format();
  }

  @Override
  public String toString() {
    return "[" + getClass().getSimpleName() + "] " + getMessage();
  }

}
