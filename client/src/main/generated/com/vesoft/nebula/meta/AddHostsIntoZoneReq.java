/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class AddHostsIntoZoneReq implements TBase, java.io.Serializable, Cloneable, Comparable<AddHostsIntoZoneReq> {
  private static final TStruct STRUCT_DESC = new TStruct("AddHostsIntoZoneReq");
  private static final TField HOSTS_FIELD_DESC = new TField("hosts", TType.LIST, (short)1);
  private static final TField ZONE_NAME_FIELD_DESC = new TField("zone_name", TType.STRING, (short)2);
  private static final TField IS_NEW_FIELD_DESC = new TField("is_new", TType.BOOL, (short)3);

  public List<com.vesoft.nebula.HostAddr> hosts;
  public byte[] zone_name;
  public boolean is_new;
  public static final int HOSTS = 1;
  public static final int ZONE_NAME = 2;
  public static final int IS_NEW = 3;

  // isset id assignments
  private static final int __IS_NEW_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(HOSTS, new FieldMetaData("hosts", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class))));
    tmpMetaDataMap.put(ZONE_NAME, new FieldMetaData("zone_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(IS_NEW, new FieldMetaData("is_new", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(AddHostsIntoZoneReq.class, metaDataMap);
  }

  public AddHostsIntoZoneReq() {
  }

  public AddHostsIntoZoneReq(
      List<com.vesoft.nebula.HostAddr> hosts,
      byte[] zone_name,
      boolean is_new) {
    this();
    this.hosts = hosts;
    this.zone_name = zone_name;
    this.is_new = is_new;
    setIs_newIsSet(true);
  }

  public static class Builder {
    private List<com.vesoft.nebula.HostAddr> hosts;
    private byte[] zone_name;
    private boolean is_new;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setHosts(final List<com.vesoft.nebula.HostAddr> hosts) {
      this.hosts = hosts;
      return this;
    }

    public Builder setZone_name(final byte[] zone_name) {
      this.zone_name = zone_name;
      return this;
    }

    public Builder setIs_new(final boolean is_new) {
      this.is_new = is_new;
      __optional_isset.set(__IS_NEW_ISSET_ID, true);
      return this;
    }

    public AddHostsIntoZoneReq build() {
      AddHostsIntoZoneReq result = new AddHostsIntoZoneReq();
      result.setHosts(this.hosts);
      result.setZone_name(this.zone_name);
      if (__optional_isset.get(__IS_NEW_ISSET_ID)) {
        result.setIs_new(this.is_new);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddHostsIntoZoneReq(AddHostsIntoZoneReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetHosts()) {
      this.hosts = TBaseHelper.deepCopy(other.hosts);
    }
    if (other.isSetZone_name()) {
      this.zone_name = TBaseHelper.deepCopy(other.zone_name);
    }
    this.is_new = TBaseHelper.deepCopy(other.is_new);
  }

  public AddHostsIntoZoneReq deepCopy() {
    return new AddHostsIntoZoneReq(this);
  }

  public List<com.vesoft.nebula.HostAddr> getHosts() {
    return this.hosts;
  }

  public AddHostsIntoZoneReq setHosts(List<com.vesoft.nebula.HostAddr> hosts) {
    this.hosts = hosts;
    return this;
  }

  public void unsetHosts() {
    this.hosts = null;
  }

  // Returns true if field hosts is set (has been assigned a value) and false otherwise
  public boolean isSetHosts() {
    return this.hosts != null;
  }

  public void setHostsIsSet(boolean __value) {
    if (!__value) {
      this.hosts = null;
    }
  }

  public byte[] getZone_name() {
    return this.zone_name;
  }

  public AddHostsIntoZoneReq setZone_name(byte[] zone_name) {
    this.zone_name = zone_name;
    return this;
  }

  public void unsetZone_name() {
    this.zone_name = null;
  }

  // Returns true if field zone_name is set (has been assigned a value) and false otherwise
  public boolean isSetZone_name() {
    return this.zone_name != null;
  }

  public void setZone_nameIsSet(boolean __value) {
    if (!__value) {
      this.zone_name = null;
    }
  }

  public boolean isIs_new() {
    return this.is_new;
  }

  public AddHostsIntoZoneReq setIs_new(boolean is_new) {
    this.is_new = is_new;
    setIs_newIsSet(true);
    return this;
  }

  public void unsetIs_new() {
    __isset_bit_vector.clear(__IS_NEW_ISSET_ID);
  }

  // Returns true if field is_new is set (has been assigned a value) and false otherwise
  public boolean isSetIs_new() {
    return __isset_bit_vector.get(__IS_NEW_ISSET_ID);
  }

  public void setIs_newIsSet(boolean __value) {
    __isset_bit_vector.set(__IS_NEW_ISSET_ID, __value);
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case HOSTS:
      if (__value == null) {
        unsetHosts();
      } else {
        setHosts((List<com.vesoft.nebula.HostAddr>)__value);
      }
      break;

    case ZONE_NAME:
      if (__value == null) {
        unsetZone_name();
      } else {
        setZone_name((byte[])__value);
      }
      break;

    case IS_NEW:
      if (__value == null) {
        unsetIs_new();
      } else {
        setIs_new((Boolean)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case HOSTS:
      return getHosts();

    case ZONE_NAME:
      return getZone_name();

    case IS_NEW:
      return new Boolean(isIs_new());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof AddHostsIntoZoneReq))
      return false;
    AddHostsIntoZoneReq that = (AddHostsIntoZoneReq)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetHosts(), that.isSetHosts(), this.hosts, that.hosts)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetZone_name(), that.isSetZone_name(), this.zone_name, that.zone_name)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.is_new, that.is_new)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {hosts, zone_name, is_new});
  }

  @Override
  public int compareTo(AddHostsIntoZoneReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHosts()).compareTo(other.isSetHosts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(hosts, other.hosts);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetZone_name()).compareTo(other.isSetZone_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(zone_name, other.zone_name);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIs_new()).compareTo(other.isSetIs_new());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(is_new, other.is_new);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case HOSTS:
          if (__field.type == TType.LIST) {
            {
              TList _list229 = iprot.readListBegin();
              this.hosts = new ArrayList<com.vesoft.nebula.HostAddr>(Math.max(0, _list229.size));
              for (int _i230 = 0; 
                   (_list229.size < 0) ? iprot.peekList() : (_i230 < _list229.size); 
                   ++_i230)
              {
                com.vesoft.nebula.HostAddr _elem231;
                _elem231 = new com.vesoft.nebula.HostAddr();
                _elem231.read(iprot);
                this.hosts.add(_elem231);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ZONE_NAME:
          if (__field.type == TType.STRING) {
            this.zone_name = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case IS_NEW:
          if (__field.type == TType.BOOL) {
            this.is_new = iprot.readBool();
            setIs_newIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.hosts != null) {
      oprot.writeFieldBegin(HOSTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.hosts.size()));
        for (com.vesoft.nebula.HostAddr _iter232 : this.hosts)        {
          _iter232.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.zone_name != null) {
      oprot.writeFieldBegin(ZONE_NAME_FIELD_DESC);
      oprot.writeBinary(this.zone_name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IS_NEW_FIELD_DESC);
    oprot.writeBool(this.is_new);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("AddHostsIntoZoneReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("hosts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHosts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHosts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("zone_name");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getZone_name() == null) {
      sb.append("null");
    } else {
        int __zone_name_size = Math.min(this.getZone_name().length, 128);
        for (int i = 0; i < __zone_name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getZone_name()[i]).length() > 1 ? Integer.toHexString(this.getZone_name()[i]).substring(Integer.toHexString(this.getZone_name()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getZone_name()[i]).toUpperCase());
        }
        if (this.getZone_name().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("is_new");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isIs_new(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

