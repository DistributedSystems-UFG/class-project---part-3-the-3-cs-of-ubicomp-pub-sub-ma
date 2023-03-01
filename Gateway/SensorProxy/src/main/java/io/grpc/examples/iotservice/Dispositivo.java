// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorService.proto

package io.grpc.examples.iotservice;

/**
 * Protobuf type {@code sensor_service.Dispositivo}
 */
public final class Dispositivo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensor_service.Dispositivo)
    DispositivoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Dispositivo.newBuilder() to construct.
  private Dispositivo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Dispositivo() {
    nomeDispositivo_ = "";
    localizacao_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Dispositivo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_Dispositivo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_Dispositivo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.iotservice.Dispositivo.class, io.grpc.examples.iotservice.Dispositivo.Builder.class);
  }

  public static final int NOMEDISPOSITIVO_FIELD_NUMBER = 1;
  private volatile java.lang.Object nomeDispositivo_;
  /**
   * <code>string nomeDispositivo = 1;</code>
   * @return The nomeDispositivo.
   */
  @java.lang.Override
  public java.lang.String getNomeDispositivo() {
    java.lang.Object ref = nomeDispositivo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nomeDispositivo_ = s;
      return s;
    }
  }
  /**
   * <code>string nomeDispositivo = 1;</code>
   * @return The bytes for nomeDispositivo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNomeDispositivoBytes() {
    java.lang.Object ref = nomeDispositivo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nomeDispositivo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCALIZACAO_FIELD_NUMBER = 2;
  private volatile java.lang.Object localizacao_;
  /**
   * <code>string localizacao = 2;</code>
   * @return The localizacao.
   */
  @java.lang.Override
  public java.lang.String getLocalizacao() {
    java.lang.Object ref = localizacao_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localizacao_ = s;
      return s;
    }
  }
  /**
   * <code>string localizacao = 2;</code>
   * @return The bytes for localizacao.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocalizacaoBytes() {
    java.lang.Object ref = localizacao_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      localizacao_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIPODISPOSITIVO_FIELD_NUMBER = 3;
  private int tipoDispositivo_;
  /**
   * <code>uint32 tipoDispositivo = 3;</code>
   * @return The tipoDispositivo.
   */
  @java.lang.Override
  public int getTipoDispositivo() {
    return tipoDispositivo_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nomeDispositivo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nomeDispositivo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(localizacao_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, localizacao_);
    }
    if (tipoDispositivo_ != 0) {
      output.writeUInt32(3, tipoDispositivo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nomeDispositivo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nomeDispositivo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(localizacao_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, localizacao_);
    }
    if (tipoDispositivo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, tipoDispositivo_);
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
    if (!(obj instanceof io.grpc.examples.iotservice.Dispositivo)) {
      return super.equals(obj);
    }
    io.grpc.examples.iotservice.Dispositivo other = (io.grpc.examples.iotservice.Dispositivo) obj;

    if (!getNomeDispositivo()
        .equals(other.getNomeDispositivo())) return false;
    if (!getLocalizacao()
        .equals(other.getLocalizacao())) return false;
    if (getTipoDispositivo()
        != other.getTipoDispositivo()) return false;
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
    hash = (37 * hash) + NOMEDISPOSITIVO_FIELD_NUMBER;
    hash = (53 * hash) + getNomeDispositivo().hashCode();
    hash = (37 * hash) + LOCALIZACAO_FIELD_NUMBER;
    hash = (53 * hash) + getLocalizacao().hashCode();
    hash = (37 * hash) + TIPODISPOSITIVO_FIELD_NUMBER;
    hash = (53 * hash) + getTipoDispositivo();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.iotservice.Dispositivo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.Dispositivo parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.iotservice.Dispositivo prototype) {
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
   * Protobuf type {@code sensor_service.Dispositivo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensor_service.Dispositivo)
      io.grpc.examples.iotservice.DispositivoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_Dispositivo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_Dispositivo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.iotservice.Dispositivo.class, io.grpc.examples.iotservice.Dispositivo.Builder.class);
    }

    // Construct using io.grpc.examples.iotservice.Dispositivo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      nomeDispositivo_ = "";

      localizacao_ = "";

      tipoDispositivo_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_Dispositivo_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.Dispositivo getDefaultInstanceForType() {
      return io.grpc.examples.iotservice.Dispositivo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.Dispositivo build() {
      io.grpc.examples.iotservice.Dispositivo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.Dispositivo buildPartial() {
      io.grpc.examples.iotservice.Dispositivo result = new io.grpc.examples.iotservice.Dispositivo(this);
      result.nomeDispositivo_ = nomeDispositivo_;
      result.localizacao_ = localizacao_;
      result.tipoDispositivo_ = tipoDispositivo_;
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
      if (other instanceof io.grpc.examples.iotservice.Dispositivo) {
        return mergeFrom((io.grpc.examples.iotservice.Dispositivo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.iotservice.Dispositivo other) {
      if (other == io.grpc.examples.iotservice.Dispositivo.getDefaultInstance()) return this;
      if (!other.getNomeDispositivo().isEmpty()) {
        nomeDispositivo_ = other.nomeDispositivo_;
        onChanged();
      }
      if (!other.getLocalizacao().isEmpty()) {
        localizacao_ = other.localizacao_;
        onChanged();
      }
      if (other.getTipoDispositivo() != 0) {
        setTipoDispositivo(other.getTipoDispositivo());
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
              nomeDispositivo_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              localizacao_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              tipoDispositivo_ = input.readUInt32();

              break;
            } // case 24
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

    private java.lang.Object nomeDispositivo_ = "";
    /**
     * <code>string nomeDispositivo = 1;</code>
     * @return The nomeDispositivo.
     */
    public java.lang.String getNomeDispositivo() {
      java.lang.Object ref = nomeDispositivo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nomeDispositivo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nomeDispositivo = 1;</code>
     * @return The bytes for nomeDispositivo.
     */
    public com.google.protobuf.ByteString
        getNomeDispositivoBytes() {
      java.lang.Object ref = nomeDispositivo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nomeDispositivo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nomeDispositivo = 1;</code>
     * @param value The nomeDispositivo to set.
     * @return This builder for chaining.
     */
    public Builder setNomeDispositivo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nomeDispositivo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nomeDispositivo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNomeDispositivo() {
      
      nomeDispositivo_ = getDefaultInstance().getNomeDispositivo();
      onChanged();
      return this;
    }
    /**
     * <code>string nomeDispositivo = 1;</code>
     * @param value The bytes for nomeDispositivo to set.
     * @return This builder for chaining.
     */
    public Builder setNomeDispositivoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nomeDispositivo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object localizacao_ = "";
    /**
     * <code>string localizacao = 2;</code>
     * @return The localizacao.
     */
    public java.lang.String getLocalizacao() {
      java.lang.Object ref = localizacao_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localizacao_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string localizacao = 2;</code>
     * @return The bytes for localizacao.
     */
    public com.google.protobuf.ByteString
        getLocalizacaoBytes() {
      java.lang.Object ref = localizacao_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localizacao_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string localizacao = 2;</code>
     * @param value The localizacao to set.
     * @return This builder for chaining.
     */
    public Builder setLocalizacao(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      localizacao_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string localizacao = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalizacao() {
      
      localizacao_ = getDefaultInstance().getLocalizacao();
      onChanged();
      return this;
    }
    /**
     * <code>string localizacao = 2;</code>
     * @param value The bytes for localizacao to set.
     * @return This builder for chaining.
     */
    public Builder setLocalizacaoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      localizacao_ = value;
      onChanged();
      return this;
    }

    private int tipoDispositivo_ ;
    /**
     * <code>uint32 tipoDispositivo = 3;</code>
     * @return The tipoDispositivo.
     */
    @java.lang.Override
    public int getTipoDispositivo() {
      return tipoDispositivo_;
    }
    /**
     * <code>uint32 tipoDispositivo = 3;</code>
     * @param value The tipoDispositivo to set.
     * @return This builder for chaining.
     */
    public Builder setTipoDispositivo(int value) {
      
      tipoDispositivo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 tipoDispositivo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTipoDispositivo() {
      
      tipoDispositivo_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:sensor_service.Dispositivo)
  }

  // @@protoc_insertion_point(class_scope:sensor_service.Dispositivo)
  private static final io.grpc.examples.iotservice.Dispositivo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.iotservice.Dispositivo();
  }

  public static io.grpc.examples.iotservice.Dispositivo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dispositivo>
      PARSER = new com.google.protobuf.AbstractParser<Dispositivo>() {
    @java.lang.Override
    public Dispositivo parsePartialFrom(
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

  public static com.google.protobuf.Parser<Dispositivo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dispositivo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.iotservice.Dispositivo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
