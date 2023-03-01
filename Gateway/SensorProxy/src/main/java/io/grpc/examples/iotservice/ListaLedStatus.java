// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorService.proto

package io.grpc.examples.iotservice;

/**
 * Protobuf type {@code sensor_service.ListaLedStatus}
 */
public final class ListaLedStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensor_service.ListaLedStatus)
    ListaLedStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListaLedStatus.newBuilder() to construct.
  private ListaLedStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListaLedStatus() {
    status_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListaLedStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaLedStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaLedStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.iotservice.ListaLedStatus.class, io.grpc.examples.iotservice.ListaLedStatus.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private java.util.List<io.grpc.examples.iotservice.LedStatus> status_;
  /**
   * <code>repeated .sensor_service.LedStatus status = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grpc.examples.iotservice.LedStatus> getStatusList() {
    return status_;
  }
  /**
   * <code>repeated .sensor_service.LedStatus status = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grpc.examples.iotservice.LedStatusOrBuilder> 
      getStatusOrBuilderList() {
    return status_;
  }
  /**
   * <code>repeated .sensor_service.LedStatus status = 1;</code>
   */
  @java.lang.Override
  public int getStatusCount() {
    return status_.size();
  }
  /**
   * <code>repeated .sensor_service.LedStatus status = 1;</code>
   */
  @java.lang.Override
  public io.grpc.examples.iotservice.LedStatus getStatus(int index) {
    return status_.get(index);
  }
  /**
   * <code>repeated .sensor_service.LedStatus status = 1;</code>
   */
  @java.lang.Override
  public io.grpc.examples.iotservice.LedStatusOrBuilder getStatusOrBuilder(
      int index) {
    return status_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < status_.size(); i++) {
      output.writeMessage(1, status_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < status_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, status_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.examples.iotservice.ListaLedStatus)) {
      return super.equals(obj);
    }
    io.grpc.examples.iotservice.ListaLedStatus other = (io.grpc.examples.iotservice.ListaLedStatus) obj;

    if (!getStatusList()
        .equals(other.getStatusList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStatusCount() > 0) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatusList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ListaLedStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.iotservice.ListaLedStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code sensor_service.ListaLedStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensor_service.ListaLedStatus)
      io.grpc.examples.iotservice.ListaLedStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaLedStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaLedStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.iotservice.ListaLedStatus.class, io.grpc.examples.iotservice.ListaLedStatus.Builder.class);
    }

    // Construct using io.grpc.examples.iotservice.ListaLedStatus.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (statusBuilder_ == null) {
        status_ = java.util.Collections.emptyList();
      } else {
        status_ = null;
        statusBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaLedStatus_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ListaLedStatus getDefaultInstanceForType() {
      return io.grpc.examples.iotservice.ListaLedStatus.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ListaLedStatus build() {
      io.grpc.examples.iotservice.ListaLedStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ListaLedStatus buildPartial() {
      io.grpc.examples.iotservice.ListaLedStatus result = new io.grpc.examples.iotservice.ListaLedStatus(this);
      int from_bitField0_ = bitField0_;
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          status_ = java.util.Collections.unmodifiableList(status_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.iotservice.ListaLedStatus) {
        return mergeFrom((io.grpc.examples.iotservice.ListaLedStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.iotservice.ListaLedStatus other) {
      if (other == io.grpc.examples.iotservice.ListaLedStatus.getDefaultInstance()) return this;
      if (statusBuilder_ == null) {
        if (!other.status_.isEmpty()) {
          if (status_.isEmpty()) {
            status_ = other.status_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStatusIsMutable();
            status_.addAll(other.status_);
          }
          onChanged();
        }
      } else {
        if (!other.status_.isEmpty()) {
          if (statusBuilder_.isEmpty()) {
            statusBuilder_.dispose();
            statusBuilder_ = null;
            status_ = other.status_;
            bitField0_ = (bitField0_ & ~0x00000001);
            statusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStatusFieldBuilder() : null;
          } else {
            statusBuilder_.addAllMessages(other.status_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              io.grpc.examples.iotservice.LedStatus m =
                  input.readMessage(
                      io.grpc.examples.iotservice.LedStatus.parser(),
                      extensionRegistry);
              if (statusBuilder_ == null) {
                ensureStatusIsMutable();
                status_.add(m);
              } else {
                statusBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grpc.examples.iotservice.LedStatus> status_ =
      java.util.Collections.emptyList();
    private void ensureStatusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        status_ = new java.util.ArrayList<io.grpc.examples.iotservice.LedStatus>(status_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.examples.iotservice.LedStatus, io.grpc.examples.iotservice.LedStatus.Builder, io.grpc.examples.iotservice.LedStatusOrBuilder> statusBuilder_;

    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public java.util.List<io.grpc.examples.iotservice.LedStatus> getStatusList() {
      if (statusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(status_);
      } else {
        return statusBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public int getStatusCount() {
      if (statusBuilder_ == null) {
        return status_.size();
      } else {
        return statusBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public io.grpc.examples.iotservice.LedStatus getStatus(int index) {
      if (statusBuilder_ == null) {
        return status_.get(index);
      } else {
        return statusBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder setStatus(
        int index, io.grpc.examples.iotservice.LedStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusIsMutable();
        status_.set(index, value);
        onChanged();
      } else {
        statusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder setStatus(
        int index, io.grpc.examples.iotservice.LedStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        status_.set(index, builderForValue.build());
        onChanged();
      } else {
        statusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder addStatus(io.grpc.examples.iotservice.LedStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusIsMutable();
        status_.add(value);
        onChanged();
      } else {
        statusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder addStatus(
        int index, io.grpc.examples.iotservice.LedStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusIsMutable();
        status_.add(index, value);
        onChanged();
      } else {
        statusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder addStatus(
        io.grpc.examples.iotservice.LedStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        status_.add(builderForValue.build());
        onChanged();
      } else {
        statusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder addStatus(
        int index, io.grpc.examples.iotservice.LedStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        status_.add(index, builderForValue.build());
        onChanged();
      } else {
        statusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder addAllStatus(
        java.lang.Iterable<? extends io.grpc.examples.iotservice.LedStatus> values) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, status_);
        onChanged();
      } else {
        statusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        statusBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public Builder removeStatus(int index) {
      if (statusBuilder_ == null) {
        ensureStatusIsMutable();
        status_.remove(index);
        onChanged();
      } else {
        statusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public io.grpc.examples.iotservice.LedStatus.Builder getStatusBuilder(
        int index) {
      return getStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public io.grpc.examples.iotservice.LedStatusOrBuilder getStatusOrBuilder(
        int index) {
      if (statusBuilder_ == null) {
        return status_.get(index);  } else {
        return statusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public java.util.List<? extends io.grpc.examples.iotservice.LedStatusOrBuilder> 
         getStatusOrBuilderList() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(status_);
      }
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public io.grpc.examples.iotservice.LedStatus.Builder addStatusBuilder() {
      return getStatusFieldBuilder().addBuilder(
          io.grpc.examples.iotservice.LedStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public io.grpc.examples.iotservice.LedStatus.Builder addStatusBuilder(
        int index) {
      return getStatusFieldBuilder().addBuilder(
          index, io.grpc.examples.iotservice.LedStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .sensor_service.LedStatus status = 1;</code>
     */
    public java.util.List<io.grpc.examples.iotservice.LedStatus.Builder> 
         getStatusBuilderList() {
      return getStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.examples.iotservice.LedStatus, io.grpc.examples.iotservice.LedStatus.Builder, io.grpc.examples.iotservice.LedStatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.examples.iotservice.LedStatus, io.grpc.examples.iotservice.LedStatus.Builder, io.grpc.examples.iotservice.LedStatusOrBuilder>(
                status_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensor_service.ListaLedStatus)
  }

  // @@protoc_insertion_point(class_scope:sensor_service.ListaLedStatus)
  private static final io.grpc.examples.iotservice.ListaLedStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.iotservice.ListaLedStatus();
  }

  public static io.grpc.examples.iotservice.ListaLedStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListaLedStatus>
      PARSER = new com.google.protobuf.AbstractParser<ListaLedStatus>() {
    @java.lang.Override
    public ListaLedStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListaLedStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListaLedStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.iotservice.ListaLedStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

