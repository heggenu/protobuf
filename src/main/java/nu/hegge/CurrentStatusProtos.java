// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: currentstatus.proto

package nu.hegge;

public final class CurrentStatusProtos {
  private CurrentStatusProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface currentstatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:nu.hegge.currentstatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 timestamp = 1;</code>
     */
    int getTimestamp();

    /**
     * <code>string drivername = 2;</code>
     */
    java.lang.String getDrivername();
    /**
     * <code>string drivername = 2;</code>
     */
    com.google.protobuf.ByteString
        getDrivernameBytes();

    /**
     * <code>float wheelvelocity = 3;</code>
     */
    float getWheelvelocity();

    /**
     * <code>bool engineactive = 4;</code>
     */
    boolean getEngineactive();

    /**
     * <code>bool ptoactive = 5;</code>
     */
    boolean getPtoactive();
  }
  /**
   * Protobuf type {@code nu.hegge.currentstatus}
   */
  public  static final class currentstatus extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:nu.hegge.currentstatus)
      currentstatusOrBuilder {
    // Use currentstatus.newBuilder() to construct.
    private currentstatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private currentstatus() {
      timestamp_ = 0;
      drivername_ = "";
      wheelvelocity_ = 0F;
      engineactive_ = false;
      ptoactive_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private currentstatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              timestamp_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              drivername_ = s;
              break;
            }
            case 29: {

              wheelvelocity_ = input.readFloat();
              break;
            }
            case 32: {

              engineactive_ = input.readBool();
              break;
            }
            case 40: {

              ptoactive_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return nu.hegge.CurrentStatusProtos.internal_static_nu_hegge_currentstatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return nu.hegge.CurrentStatusProtos.internal_static_nu_hegge_currentstatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              nu.hegge.CurrentStatusProtos.currentstatus.class, nu.hegge.CurrentStatusProtos.currentstatus.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int timestamp_;
    /**
     * <code>uint32 timestamp = 1;</code>
     */
    public int getTimestamp() {
      return timestamp_;
    }

    public static final int DRIVERNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object drivername_;
    /**
     * <code>string drivername = 2;</code>
     */
    public java.lang.String getDrivername() {
      java.lang.Object ref = drivername_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        drivername_ = s;
        return s;
      }
    }
    /**
     * <code>string drivername = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDrivernameBytes() {
      java.lang.Object ref = drivername_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        drivername_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WHEELVELOCITY_FIELD_NUMBER = 3;
    private float wheelvelocity_;
    /**
     * <code>float wheelvelocity = 3;</code>
     */
    public float getWheelvelocity() {
      return wheelvelocity_;
    }

    public static final int ENGINEACTIVE_FIELD_NUMBER = 4;
    private boolean engineactive_;
    /**
     * <code>bool engineactive = 4;</code>
     */
    public boolean getEngineactive() {
      return engineactive_;
    }

    public static final int PTOACTIVE_FIELD_NUMBER = 5;
    private boolean ptoactive_;
    /**
     * <code>bool ptoactive = 5;</code>
     */
    public boolean getPtoactive() {
      return ptoactive_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (timestamp_ != 0) {
        output.writeUInt32(1, timestamp_);
      }
      if (!getDrivernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, drivername_);
      }
      if (wheelvelocity_ != 0F) {
        output.writeFloat(3, wheelvelocity_);
      }
      if (engineactive_ != false) {
        output.writeBool(4, engineactive_);
      }
      if (ptoactive_ != false) {
        output.writeBool(5, ptoactive_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, timestamp_);
      }
      if (!getDrivernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, drivername_);
      }
      if (wheelvelocity_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, wheelvelocity_);
      }
      if (engineactive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, engineactive_);
      }
      if (ptoactive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, ptoactive_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof nu.hegge.CurrentStatusProtos.currentstatus)) {
        return super.equals(obj);
      }
      nu.hegge.CurrentStatusProtos.currentstatus other = (nu.hegge.CurrentStatusProtos.currentstatus) obj;

      boolean result = true;
      result = result && (getTimestamp()
          == other.getTimestamp());
      result = result && getDrivername()
          .equals(other.getDrivername());
      result = result && (
          java.lang.Float.floatToIntBits(getWheelvelocity())
          == java.lang.Float.floatToIntBits(
              other.getWheelvelocity()));
      result = result && (getEngineactive()
          == other.getEngineactive());
      result = result && (getPtoactive()
          == other.getPtoactive());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp();
      hash = (37 * hash) + DRIVERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getDrivername().hashCode();
      hash = (37 * hash) + WHEELVELOCITY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getWheelvelocity());
      hash = (37 * hash) + ENGINEACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEngineactive());
      hash = (37 * hash) + PTOACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getPtoactive());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static nu.hegge.CurrentStatusProtos.currentstatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(nu.hegge.CurrentStatusProtos.currentstatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code nu.hegge.currentstatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:nu.hegge.currentstatus)
        nu.hegge.CurrentStatusProtos.currentstatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return nu.hegge.CurrentStatusProtos.internal_static_nu_hegge_currentstatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return nu.hegge.CurrentStatusProtos.internal_static_nu_hegge_currentstatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                nu.hegge.CurrentStatusProtos.currentstatus.class, nu.hegge.CurrentStatusProtos.currentstatus.Builder.class);
      }

      // Construct using nu.hegge.CurrentStatusProtos.currentstatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        timestamp_ = 0;

        drivername_ = "";

        wheelvelocity_ = 0F;

        engineactive_ = false;

        ptoactive_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return nu.hegge.CurrentStatusProtos.internal_static_nu_hegge_currentstatus_descriptor;
      }

      public nu.hegge.CurrentStatusProtos.currentstatus getDefaultInstanceForType() {
        return nu.hegge.CurrentStatusProtos.currentstatus.getDefaultInstance();
      }

      public nu.hegge.CurrentStatusProtos.currentstatus build() {
        nu.hegge.CurrentStatusProtos.currentstatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public nu.hegge.CurrentStatusProtos.currentstatus buildPartial() {
        nu.hegge.CurrentStatusProtos.currentstatus result = new nu.hegge.CurrentStatusProtos.currentstatus(this);
        result.timestamp_ = timestamp_;
        result.drivername_ = drivername_;
        result.wheelvelocity_ = wheelvelocity_;
        result.engineactive_ = engineactive_;
        result.ptoactive_ = ptoactive_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof nu.hegge.CurrentStatusProtos.currentstatus) {
          return mergeFrom((nu.hegge.CurrentStatusProtos.currentstatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(nu.hegge.CurrentStatusProtos.currentstatus other) {
        if (other == nu.hegge.CurrentStatusProtos.currentstatus.getDefaultInstance()) return this;
        if (other.getTimestamp() != 0) {
          setTimestamp(other.getTimestamp());
        }
        if (!other.getDrivername().isEmpty()) {
          drivername_ = other.drivername_;
          onChanged();
        }
        if (other.getWheelvelocity() != 0F) {
          setWheelvelocity(other.getWheelvelocity());
        }
        if (other.getEngineactive() != false) {
          setEngineactive(other.getEngineactive());
        }
        if (other.getPtoactive() != false) {
          setPtoactive(other.getPtoactive());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        nu.hegge.CurrentStatusProtos.currentstatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (nu.hegge.CurrentStatusProtos.currentstatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int timestamp_ ;
      /**
       * <code>uint32 timestamp = 1;</code>
       */
      public int getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>uint32 timestamp = 1;</code>
       */
      public Builder setTimestamp(int value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 timestamp = 1;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object drivername_ = "";
      /**
       * <code>string drivername = 2;</code>
       */
      public java.lang.String getDrivername() {
        java.lang.Object ref = drivername_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          drivername_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string drivername = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDrivernameBytes() {
        java.lang.Object ref = drivername_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          drivername_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string drivername = 2;</code>
       */
      public Builder setDrivername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        drivername_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string drivername = 2;</code>
       */
      public Builder clearDrivername() {
        
        drivername_ = getDefaultInstance().getDrivername();
        onChanged();
        return this;
      }
      /**
       * <code>string drivername = 2;</code>
       */
      public Builder setDrivernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        drivername_ = value;
        onChanged();
        return this;
      }

      private float wheelvelocity_ ;
      /**
       * <code>float wheelvelocity = 3;</code>
       */
      public float getWheelvelocity() {
        return wheelvelocity_;
      }
      /**
       * <code>float wheelvelocity = 3;</code>
       */
      public Builder setWheelvelocity(float value) {
        
        wheelvelocity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float wheelvelocity = 3;</code>
       */
      public Builder clearWheelvelocity() {
        
        wheelvelocity_ = 0F;
        onChanged();
        return this;
      }

      private boolean engineactive_ ;
      /**
       * <code>bool engineactive = 4;</code>
       */
      public boolean getEngineactive() {
        return engineactive_;
      }
      /**
       * <code>bool engineactive = 4;</code>
       */
      public Builder setEngineactive(boolean value) {
        
        engineactive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool engineactive = 4;</code>
       */
      public Builder clearEngineactive() {
        
        engineactive_ = false;
        onChanged();
        return this;
      }

      private boolean ptoactive_ ;
      /**
       * <code>bool ptoactive = 5;</code>
       */
      public boolean getPtoactive() {
        return ptoactive_;
      }
      /**
       * <code>bool ptoactive = 5;</code>
       */
      public Builder setPtoactive(boolean value) {
        
        ptoactive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool ptoactive = 5;</code>
       */
      public Builder clearPtoactive() {
        
        ptoactive_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:nu.hegge.currentstatus)
    }

    // @@protoc_insertion_point(class_scope:nu.hegge.currentstatus)
    private static final nu.hegge.CurrentStatusProtos.currentstatus DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new nu.hegge.CurrentStatusProtos.currentstatus();
    }

    public static nu.hegge.CurrentStatusProtos.currentstatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<currentstatus>
        PARSER = new com.google.protobuf.AbstractParser<currentstatus>() {
      public currentstatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new currentstatus(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<currentstatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<currentstatus> getParserForType() {
      return PARSER;
    }

    public nu.hegge.CurrentStatusProtos.currentstatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nu_hegge_currentstatus_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nu_hegge_currentstatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023currentstatus.proto\022\010nu.hegge\"v\n\rcurre" +
      "ntstatus\022\021\n\ttimestamp\030\001 \001(\r\022\022\n\ndrivernam" +
      "e\030\002 \001(\t\022\025\n\rwheelvelocity\030\003 \001(\002\022\024\n\014engine" +
      "active\030\004 \001(\010\022\021\n\tptoactive\030\005 \001(\010B\037\n\010nu.he" +
      "ggeB\023CurrentStatusProtosb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_nu_hegge_currentstatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nu_hegge_currentstatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nu_hegge_currentstatus_descriptor,
        new java.lang.String[] { "Timestamp", "Drivername", "Wheelvelocity", "Engineactive", "Ptoactive", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
