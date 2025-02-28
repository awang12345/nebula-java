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
public class HostBackupInfo implements TBase, java.io.Serializable, Cloneable, Comparable<HostBackupInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("HostBackupInfo");
  private static final TField HOST_FIELD_DESC = new TField("host", TType.STRUCT, (short)1);
  private static final TField CHECKPOINTS_FIELD_DESC = new TField("checkpoints", TType.LIST, (short)2);

  public com.vesoft.nebula.HostAddr host;
  public List<com.vesoft.nebula.CheckpointInfo> checkpoints;
  public static final int HOST = 1;
  public static final int CHECKPOINTS = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(HOST, new FieldMetaData("host", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(CHECKPOINTS, new FieldMetaData("checkpoints", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.CheckpointInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(HostBackupInfo.class, metaDataMap);
  }

  public HostBackupInfo() {
  }

  public HostBackupInfo(
      com.vesoft.nebula.HostAddr host,
      List<com.vesoft.nebula.CheckpointInfo> checkpoints) {
    this();
    this.host = host;
    this.checkpoints = checkpoints;
  }

  public static class Builder {
    private com.vesoft.nebula.HostAddr host;
    private List<com.vesoft.nebula.CheckpointInfo> checkpoints;

    public Builder() {
    }

    public Builder setHost(final com.vesoft.nebula.HostAddr host) {
      this.host = host;
      return this;
    }

    public Builder setCheckpoints(final List<com.vesoft.nebula.CheckpointInfo> checkpoints) {
      this.checkpoints = checkpoints;
      return this;
    }

    public HostBackupInfo build() {
      HostBackupInfo result = new HostBackupInfo();
      result.setHost(this.host);
      result.setCheckpoints(this.checkpoints);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HostBackupInfo(HostBackupInfo other) {
    if (other.isSetHost()) {
      this.host = TBaseHelper.deepCopy(other.host);
    }
    if (other.isSetCheckpoints()) {
      this.checkpoints = TBaseHelper.deepCopy(other.checkpoints);
    }
  }

  public HostBackupInfo deepCopy() {
    return new HostBackupInfo(this);
  }

  public com.vesoft.nebula.HostAddr getHost() {
    return this.host;
  }

  public HostBackupInfo setHost(com.vesoft.nebula.HostAddr host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  // Returns true if field host is set (has been assigned a value) and false otherwise
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean __value) {
    if (!__value) {
      this.host = null;
    }
  }

  public List<com.vesoft.nebula.CheckpointInfo> getCheckpoints() {
    return this.checkpoints;
  }

  public HostBackupInfo setCheckpoints(List<com.vesoft.nebula.CheckpointInfo> checkpoints) {
    this.checkpoints = checkpoints;
    return this;
  }

  public void unsetCheckpoints() {
    this.checkpoints = null;
  }

  // Returns true if field checkpoints is set (has been assigned a value) and false otherwise
  public boolean isSetCheckpoints() {
    return this.checkpoints != null;
  }

  public void setCheckpointsIsSet(boolean __value) {
    if (!__value) {
      this.checkpoints = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case HOST:
      if (__value == null) {
        unsetHost();
      } else {
        setHost((com.vesoft.nebula.HostAddr)__value);
      }
      break;

    case CHECKPOINTS:
      if (__value == null) {
        unsetCheckpoints();
      } else {
        setCheckpoints((List<com.vesoft.nebula.CheckpointInfo>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case HOST:
      return getHost();

    case CHECKPOINTS:
      return getCheckpoints();

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
    if (!(_that instanceof HostBackupInfo))
      return false;
    HostBackupInfo that = (HostBackupInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetHost(), that.isSetHost(), this.host, that.host)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetCheckpoints(), that.isSetCheckpoints(), this.checkpoints, that.checkpoints)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {host, checkpoints});
  }

  @Override
  public int compareTo(HostBackupInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(host, other.host);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCheckpoints()).compareTo(other.isSetCheckpoints());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(checkpoints, other.checkpoints);
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
        case HOST:
          if (__field.type == TType.STRUCT) {
            this.host = new com.vesoft.nebula.HostAddr();
            this.host.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CHECKPOINTS:
          if (__field.type == TType.LIST) {
            {
              TList _list253 = iprot.readListBegin();
              this.checkpoints = new ArrayList<com.vesoft.nebula.CheckpointInfo>(Math.max(0, _list253.size));
              for (int _i254 = 0; 
                   (_list253.size < 0) ? iprot.peekList() : (_i254 < _list253.size); 
                   ++_i254)
              {
                com.vesoft.nebula.CheckpointInfo _elem255;
                _elem255 = new com.vesoft.nebula.CheckpointInfo();
                _elem255.read(iprot);
                this.checkpoints.add(_elem255);
              }
              iprot.readListEnd();
            }
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
    if (this.host != null) {
      oprot.writeFieldBegin(HOST_FIELD_DESC);
      this.host.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.checkpoints != null) {
      oprot.writeFieldBegin(CHECKPOINTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.checkpoints.size()));
        for (com.vesoft.nebula.CheckpointInfo _iter256 : this.checkpoints)        {
          _iter256.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
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
    StringBuilder sb = new StringBuilder("HostBackupInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("host");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHost() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHost(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("checkpoints");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getCheckpoints() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getCheckpoints(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

