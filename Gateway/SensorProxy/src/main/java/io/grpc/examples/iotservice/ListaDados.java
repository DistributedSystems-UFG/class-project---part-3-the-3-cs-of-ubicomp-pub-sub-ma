// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorService.proto

package io.grpc.examples.iotservice;

/**
 * Protobuf type {@code sensor_service.ListaDados}
 */
public final class ListaDados extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensor_service.ListaDados)
    ListaDadosOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListaDados.newBuilder() to construct.
  private ListaDados(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListaDados() {
    dados_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListaDados();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaDados_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaDados_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.iotservice.ListaDados.class, io.grpc.examples.iotservice.ListaDados.Builder.class);
  }

  public static final int DADOS_FIELD_NUMBER = 1;
  private java.util.List<io.grpc.examples.iotservice.Dado> dados_;
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grpc.examples.iotservice.Dado> getDadosList() {
    return dados_;
  }
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grpc.examples.iotservice.DadoOrBuilder> 
      getDadosOrBuilderList() {
    return dados_;
  }
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  @java.lang.Override
  public int getDadosCount() {
    return dados_.size();
  }
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  @java.lang.Override
  public io.grpc.examples.iotservice.Dado getDados(int index) {
    return dados_.get(index);
  }
  /**
   * <code>repeated .sensor_service.Dado dados = 1;</code>
   */
  @java.lang.Override
  public io.grpc.examples.iotservice.DadoOrBuilder getDadosOrBuilder(
      int index) {
    return dados_.get(index);
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
    for (int i = 0; i < dados_.size(); i++) {
      output.writeMessage(1, dados_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dados_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dados_.get(i));
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
    if (!(obj instanceof io.grpc.examples.iotservice.ListaDados)) {
      return super.equals(obj);
    }
    io.grpc.examples.iotservice.ListaDados other = (io.grpc.examples.iotservice.ListaDados) obj;

    if (!getDadosList()
        .equals(other.getDadosList())) return false;
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
    if (getDadosCount() > 0) {
      hash = (37 * hash) + DADOS_FIELD_NUMBER;
      hash = (53 * hash) + getDadosList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.iotservice.ListaDados parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaDados parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ListaDados parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ListaDados parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.iotservice.ListaDados prototype) {
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
   * Protobuf type {@code sensor_service.ListaDados}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensor_service.ListaDados)
      io.grpc.examples.iotservice.ListaDadosOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaDados_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaDados_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.iotservice.ListaDados.class, io.grpc.examples.iotservice.ListaDados.Builder.class);
    }

    // Construct using io.grpc.examples.iotservice.ListaDados.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dadosBuilder_ == null) {
        dados_ = java.util.Collections.emptyList();
      } else {
        dados_ = null;
        dadosBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ListaDados_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ListaDados getDefaultInstanceForType() {
      return io.grpc.examples.iotservice.ListaDados.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ListaDados build() {
      io.grpc.examples.iotservice.ListaDados result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ListaDados buildPartial() {
      io.grpc.examples.iotservice.ListaDados result = new io.grpc.examples.iotservice.ListaDados(this);
      int from_bitField0_ = bitField0_;
      if (dadosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dados_ = java.util.Collections.unmodifiableList(dados_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dados_ = dados_;
      } else {
        result.dados_ = dadosBuilder_.build();
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
      if (other instanceof io.grpc.examples.iotservice.ListaDados) {
        return mergeFrom((io.grpc.examples.iotservice.ListaDados)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.iotservice.ListaDados other) {
      if (other == io.grpc.examples.iotservice.ListaDados.getDefaultInstance()) return this;
      if (dadosBuilder_ == null) {
        if (!other.dados_.isEmpty()) {
          if (dados_.isEmpty()) {
            dados_ = other.dados_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDadosIsMutable();
            dados_.addAll(other.dados_);
          }
          onChanged();
        }
      } else {
        if (!other.dados_.isEmpty()) {
          if (dadosBuilder_.isEmpty()) {
            dadosBuilder_.dispose();
            dadosBuilder_ = null;
            dados_ = other.dados_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dadosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDadosFieldBuilder() : null;
          } else {
            dadosBuilder_.addAllMessages(other.dados_);
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
              io.grpc.examples.iotservice.Dado m =
                  input.readMessage(
                      io.grpc.examples.iotservice.Dado.parser(),
                      extensionRegistry);
              if (dadosBuilder_ == null) {
                ensureDadosIsMutable();
                dados_.add(m);
              } else {
                dadosBuilder_.addMessage(m);
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

    private java.util.List<io.grpc.examples.iotservice.Dado> dados_ =
      java.util.Collections.emptyList();
    private void ensureDadosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dados_ = new java.util.ArrayList<io.grpc.examples.iotservice.Dado>(dados_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.examples.iotservice.Dado, io.grpc.examples.iotservice.Dado.Builder, io.grpc.examples.iotservice.DadoOrBuilder> dadosBuilder_;

    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public java.util.List<io.grpc.examples.iotservice.Dado> getDadosList() {
      if (dadosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dados_);
      } else {
        return dadosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public int getDadosCount() {
      if (dadosBuilder_ == null) {
        return dados_.size();
      } else {
        return dadosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public io.grpc.examples.iotservice.Dado getDados(int index) {
      if (dadosBuilder_ == null) {
        return dados_.get(index);
      } else {
        return dadosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder setDados(
        int index, io.grpc.examples.iotservice.Dado value) {
      if (dadosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDadosIsMutable();
        dados_.set(index, value);
        onChanged();
      } else {
        dadosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder setDados(
        int index, io.grpc.examples.iotservice.Dado.Builder builderForValue) {
      if (dadosBuilder_ == null) {
        ensureDadosIsMutable();
        dados_.set(index, builderForValue.build());
        onChanged();
      } else {
        dadosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder addDados(io.grpc.examples.iotservice.Dado value) {
      if (dadosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDadosIsMutable();
        dados_.add(value);
        onChanged();
      } else {
        dadosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder addDados(
        int index, io.grpc.examples.iotservice.Dado value) {
      if (dadosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDadosIsMutable();
        dados_.add(index, value);
        onChanged();
      } else {
        dadosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder addDados(
        io.grpc.examples.iotservice.Dado.Builder builderForValue) {
      if (dadosBuilder_ == null) {
        ensureDadosIsMutable();
        dados_.add(builderForValue.build());
        onChanged();
      } else {
        dadosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder addDados(
        int index, io.grpc.examples.iotservice.Dado.Builder builderForValue) {
      if (dadosBuilder_ == null) {
        ensureDadosIsMutable();
        dados_.add(index, builderForValue.build());
        onChanged();
      } else {
        dadosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder addAllDados(
        java.lang.Iterable<? extends io.grpc.examples.iotservice.Dado> values) {
      if (dadosBuilder_ == null) {
        ensureDadosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dados_);
        onChanged();
      } else {
        dadosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder clearDados() {
      if (dadosBuilder_ == null) {
        dados_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dadosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public Builder removeDados(int index) {
      if (dadosBuilder_ == null) {
        ensureDadosIsMutable();
        dados_.remove(index);
        onChanged();
      } else {
        dadosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public io.grpc.examples.iotservice.Dado.Builder getDadosBuilder(
        int index) {
      return getDadosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public io.grpc.examples.iotservice.DadoOrBuilder getDadosOrBuilder(
        int index) {
      if (dadosBuilder_ == null) {
        return dados_.get(index);  } else {
        return dadosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public java.util.List<? extends io.grpc.examples.iotservice.DadoOrBuilder> 
         getDadosOrBuilderList() {
      if (dadosBuilder_ != null) {
        return dadosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dados_);
      }
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public io.grpc.examples.iotservice.Dado.Builder addDadosBuilder() {
      return getDadosFieldBuilder().addBuilder(
          io.grpc.examples.iotservice.Dado.getDefaultInstance());
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public io.grpc.examples.iotservice.Dado.Builder addDadosBuilder(
        int index) {
      return getDadosFieldBuilder().addBuilder(
          index, io.grpc.examples.iotservice.Dado.getDefaultInstance());
    }
    /**
     * <code>repeated .sensor_service.Dado dados = 1;</code>
     */
    public java.util.List<io.grpc.examples.iotservice.Dado.Builder> 
         getDadosBuilderList() {
      return getDadosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.examples.iotservice.Dado, io.grpc.examples.iotservice.Dado.Builder, io.grpc.examples.iotservice.DadoOrBuilder> 
        getDadosFieldBuilder() {
      if (dadosBuilder_ == null) {
        dadosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.examples.iotservice.Dado, io.grpc.examples.iotservice.Dado.Builder, io.grpc.examples.iotservice.DadoOrBuilder>(
                dados_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dados_ = null;
      }
      return dadosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensor_service.ListaDados)
  }

  // @@protoc_insertion_point(class_scope:sensor_service.ListaDados)
  private static final io.grpc.examples.iotservice.ListaDados DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.iotservice.ListaDados();
  }

  public static io.grpc.examples.iotservice.ListaDados getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListaDados>
      PARSER = new com.google.protobuf.AbstractParser<ListaDados>() {
    @java.lang.Override
    public ListaDados parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListaDados> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListaDados> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.iotservice.ListaDados getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

