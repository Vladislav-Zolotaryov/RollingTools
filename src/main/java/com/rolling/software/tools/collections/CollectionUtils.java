package com.rolling.software.tools.collections;

import static com.rolling.software.tools.StringHelper.str;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Supplier;

import com.rolling.software.tools.arrays.ArrayUtils;

public final class CollectionUtils {

  private CollectionUtils() {}

  public static <T> Optional<T> first(Collection<T> items) {
    Iterator<T> iterator = items.iterator();
    if (iterator.hasNext()) {
      return Optional.of(iterator.next());
    } else {
      return Optional.empty();
    }
  }

  public static <T> T firstOrThrow(Collection<T> items) throws EmptyCollectionException {
    return firstOrThrow(items,
        () -> new EmptyCollectionException(str("Collection %s was empty").args(items)));
  }

  public static <T> T firstOrThrow(Collection<T> items, Supplier<RuntimeException> supplier) {
    return first(items).orElseThrow(supplier);
  }

  @SuppressWarnings("unchecked")
  public static <T> Optional<T> last(Collection<T> items) {
    Object[] array = items.toArray();
    if (array.length > 0) {
      return Optional.of((T) ArrayUtils.last(array));
    } else {
      return Optional.empty();
    }
  }

  public static <T> T lastOrThrow(Collection<T> items) throws EmptyCollectionException {
    return lastOrThrow(items,
        () -> new EmptyCollectionException(str("Collection %s was empty").args(items)));
  }

  public static <T> T lastOrThrow(Collection<T> items, Supplier<RuntimeException> supplier) {
    return last(items).orElseThrow(supplier);
  }


}
