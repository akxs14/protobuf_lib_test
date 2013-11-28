// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.liquidm;

public final class Test {
  private Test() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface VarietyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 x = 1;
    /**
     * <code>required int32 x = 1;</code>
     */
    boolean hasX();
    /**
     * <code>required int32 x = 1;</code>
     */
    int getX();

    // required int32 y = 2;
    /**
     * <code>required int32 y = 2;</code>
     */
    boolean hasY();
    /**
     * <code>required int32 y = 2;</code>
     */
    int getY();

    // optional string tag = 3;
    /**
     * <code>optional string tag = 3;</code>
     */
    boolean hasTag();
    /**
     * <code>optional string tag = 3;</code>
     */
    java.lang.String getTag();
    /**
     * <code>optional string tag = 3;</code>
     */
    com.google.protobuf.ByteString
        getTagBytes();
  }
  /**
   * Protobuf type {@code example.liquidm.Variety}
   */
  public static final class Variety extends
      com.google.protobuf.GeneratedMessage
      implements VarietyOrBuilder {
    // Use Variety.newBuilder() to construct.
    private Variety(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Variety(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Variety defaultInstance;
    public static Variety getDefaultInstance() {
      return defaultInstance;
    }

    public Variety getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Variety(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              x_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              y_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              tag_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.liquidm.Test.internal_static_example_liquidm_Variety_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.liquidm.Test.internal_static_example_liquidm_Variety_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.liquidm.Test.Variety.class, com.liquidm.Test.Variety.Builder.class);
    }

    public static com.google.protobuf.Parser<Variety> PARSER =
        new com.google.protobuf.AbstractParser<Variety>() {
      public Variety parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Variety(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Variety> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code example.liquidm.Variety.Foonum}
     */
    public enum Foonum
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>A = 1;</code>
       */
      A(0, 1),
      /**
       * <code>B = 2;</code>
       */
      B(1, 2),
      ;

      /**
       * <code>A = 1;</code>
       */
      public static final int A_VALUE = 1;
      /**
       * <code>B = 2;</code>
       */
      public static final int B_VALUE = 2;


      public final int getNumber() { return value; }

      public static Foonum valueOf(int value) {
        switch (value) {
          case 1: return A;
          case 2: return B;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Foonum>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Foonum>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Foonum>() {
              public Foonum findValueByNumber(int number) {
                return Foonum.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.liquidm.Test.Variety.getDescriptor().getEnumTypes().get(0);
      }

      private static final Foonum[] VALUES = values();

      public static Foonum valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Foonum(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:example.liquidm.Variety.Foonum)
    }

    private int bitField0_;
    // required int32 x = 1;
    public static final int X_FIELD_NUMBER = 1;
    private int x_;
    /**
     * <code>required int32 x = 1;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 x = 1;</code>
     */
    public int getX() {
      return x_;
    }

    // required int32 y = 2;
    public static final int Y_FIELD_NUMBER = 2;
    private int y_;
    /**
     * <code>required int32 y = 2;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 y = 2;</code>
     */
    public int getY() {
      return y_;
    }

    // optional string tag = 3;
    public static final int TAG_FIELD_NUMBER = 3;
    private java.lang.Object tag_;
    /**
     * <code>optional string tag = 3;</code>
     */
    public boolean hasTag() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string tag = 3;</code>
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tag_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string tag = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      x_ = 0;
      y_ = 0;
      tag_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, y_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getTagBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, y_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getTagBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.liquidm.Test.Variety parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.liquidm.Test.Variety parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.liquidm.Test.Variety parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.liquidm.Test.Variety parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.liquidm.Test.Variety parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.liquidm.Test.Variety parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.liquidm.Test.Variety parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.liquidm.Test.Variety parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.liquidm.Test.Variety parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.liquidm.Test.Variety parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.liquidm.Test.Variety prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code example.liquidm.Variety}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.liquidm.Test.VarietyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.liquidm.Test.internal_static_example_liquidm_Variety_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.liquidm.Test.internal_static_example_liquidm_Variety_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.liquidm.Test.Variety.class, com.liquidm.Test.Variety.Builder.class);
      }

      // Construct using com.liquidm.Test.Variety.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        tag_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.liquidm.Test.internal_static_example_liquidm_Variety_descriptor;
      }

      public com.liquidm.Test.Variety getDefaultInstanceForType() {
        return com.liquidm.Test.Variety.getDefaultInstance();
      }

      public com.liquidm.Test.Variety build() {
        com.liquidm.Test.Variety result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.liquidm.Test.Variety buildPartial() {
        com.liquidm.Test.Variety result = new com.liquidm.Test.Variety(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.y_ = y_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.tag_ = tag_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.liquidm.Test.Variety) {
          return mergeFrom((com.liquidm.Test.Variety)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.liquidm.Test.Variety other) {
        if (other == com.liquidm.Test.Variety.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasTag()) {
          bitField0_ |= 0x00000004;
          tag_ = other.tag_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasX()) {
          
          return false;
        }
        if (!hasY()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.liquidm.Test.Variety parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.liquidm.Test.Variety) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 x = 1;
      private int x_ ;
      /**
       * <code>required int32 x = 1;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public int getX() {
        return x_;
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000001;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 x = 1;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        onChanged();
        return this;
      }

      // required int32 y = 2;
      private int y_ ;
      /**
       * <code>required int32 y = 2;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 y = 2;</code>
       */
      public int getY() {
        return y_;
      }
      /**
       * <code>required int32 y = 2;</code>
       */
      public Builder setY(int value) {
        bitField0_ |= 0x00000002;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 y = 2;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        onChanged();
        return this;
      }

      // optional string tag = 3;
      private java.lang.Object tag_ = "";
      /**
       * <code>optional string tag = 3;</code>
       */
      public boolean hasTag() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string tag = 3;</code>
       */
      public java.lang.String getTag() {
        java.lang.Object ref = tag_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          tag_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string tag = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTagBytes() {
        java.lang.Object ref = tag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string tag = 3;</code>
       */
      public Builder setTag(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string tag = 3;</code>
       */
      public Builder clearTag() {
        bitField0_ = (bitField0_ & ~0x00000004);
        tag_ = getDefaultInstance().getTag();
        onChanged();
        return this;
      }
      /**
       * <code>optional string tag = 3;</code>
       */
      public Builder setTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        tag_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:example.liquidm.Variety)
    }

    static {
      defaultInstance = new Variety(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:example.liquidm.Variety)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_example_liquidm_Variety_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_example_liquidm_Variety_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\022\017example.liquidm\"D\n\007Variety" +
      "\022\t\n\001x\030\001 \002(\005\022\t\n\001y\030\002 \002(\005\022\013\n\003tag\030\003 \001(\t\"\026\n\006F" +
      "oonum\022\005\n\001A\020\001\022\005\n\001B\020\002B\020\n\013com.liquidm\210\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_example_liquidm_Variety_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_example_liquidm_Variety_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_example_liquidm_Variety_descriptor,
              new java.lang.String[] { "X", "Y", "Tag", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
