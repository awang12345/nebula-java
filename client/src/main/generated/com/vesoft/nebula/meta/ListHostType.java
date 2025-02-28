/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;


import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum ListHostType implements com.facebook.thrift.TEnum {
  ALLOC(0),
  GRAPH(1),
  META(2),
  STORAGE(3),
  AGENT(4),
  STORAGE_LISTENER(5);

  private final int value;

  private ListHostType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ListHostType findByValue(int value) { 
    switch (value) {
      case 0:
        return ALLOC;
      case 1:
        return GRAPH;
      case 2:
        return META;
      case 3:
        return STORAGE;
      case 4:
        return AGENT;
      case 5:
        return STORAGE_LISTENER;
      default:
        return null;
    }
  }
}
