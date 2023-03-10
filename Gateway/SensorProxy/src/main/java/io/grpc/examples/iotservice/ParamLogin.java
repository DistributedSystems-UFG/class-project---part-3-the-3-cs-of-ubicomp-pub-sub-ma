// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SensorService.proto

package io.grpc.examples.iotservice;

/**
 * Protobuf type {@code sensor_service.ParamLogin}
 */
public final class ParamLogin extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensor_service.ParamLogin)
    ParamLoginOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParamLogin.newBuilder() to construct.
  private ParamLogin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParamLogin() {
    usuario_ = "";
    senha_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ParamLogin();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ParamLogin_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ParamLogin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.iotservice.ParamLogin.class, io.grpc.examples.iotservice.ParamLogin.Builder.class);
  }

  public static final int USUARIO_FIELD_NUMBER = 1;
  private volatile java.lang.Object usuario_;
  /**
   * <code>string usuario = 1;</code>
   * @return The usuario.
   */
  @java.lang.Override
  public java.lang.String getUsuario() {
    java.lang.Object ref = usuario_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      usuario_ = s;
      return s;
    }
  }
  /**
   * <code>string usuario = 1;</code>
   * @return The bytes for usuario.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsuarioBytes() {
    java.lang.Object ref = usuario_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      usuario_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENHA_FIELD_NUMBER = 2;
  private volatile java.lang.Object senha_;
  /**
   * <code>string senha = 2;</code>
   * @return The senha.
   */
  @java.lang.Override
  public java.lang.String getSenha() {
    java.lang.Object ref = senha_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      senha_ = s;
      return s;
    }
  }
  /**
   * <code>string senha = 2;</code>
   * @return The bytes for senha.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenhaBytes() {
    java.lang.Object ref = senha_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      senha_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(usuario_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, usuario_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(senha_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senha_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(usuario_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, usuario_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(senha_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senha_);
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
    if (!(obj instanceof io.grpc.examples.iotservice.ParamLogin)) {
      return super.equals(obj);
    }
    io.grpc.examples.iotservice.ParamLogin other = (io.grpc.examples.iotservice.ParamLogin) obj;

    if (!getUsuario()
        .equals(other.getUsuario())) return false;
    if (!getSenha()
        .equals(other.getSenha())) return false;
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
    hash = (37 * hash) + USUARIO_FIELD_NUMBER;
    hash = (53 * hash) + getUsuario().hashCode();
    hash = (37 * hash) + SENHA_FIELD_NUMBER;
    hash = (53 * hash) + getSenha().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.iotservice.ParamLogin parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.iotservice.ParamLogin parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.iotservice.ParamLogin prototype) {
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
   * Protobuf type {@code sensor_service.ParamLogin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensor_service.ParamLogin)
      io.grpc.examples.iotservice.ParamLoginOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ParamLogin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ParamLogin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.iotservice.ParamLogin.class, io.grpc.examples.iotservice.ParamLogin.Builder.class);
    }

    // Construct using io.grpc.examples.iotservice.ParamLogin.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      usuario_ = "";

      senha_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.iotservice.IoTServiceProto.internal_static_sensor_service_ParamLogin_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ParamLogin getDefaultInstanceForType() {
      return io.grpc.examples.iotservice.ParamLogin.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ParamLogin build() {
      io.grpc.examples.iotservice.ParamLogin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.iotservice.ParamLogin buildPartial() {
      io.grpc.examples.iotservice.ParamLogin result = new io.grpc.examples.iotservice.ParamLogin(this);
      result.usuario_ = usuario_;
      result.senha_ = senha_;
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
      if (other instanceof io.grpc.examples.iotservice.ParamLogin) {
        return mergeFrom((io.grpc.examples.iotservice.ParamLogin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.iotservice.ParamLogin other) {
      if (other == io.grpc.examples.iotservice.ParamLogin.getDefaultInstance()) return this;
      if (!other.getUsuario().isEmpty()) {
        usuario_ = other.usuario_;
        onChanged();
      }
      if (!other.getSenha().isEmpty()) {
        senha_ = other.senha_;
        onChanged();
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
              usuario_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              senha_ = input.readStringRequireUtf8();

              break;
            } // case 18
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

    private java.lang.Object usuario_ = "";
    /**
     * <code>string usuario = 1;</code>
     * @return The usuario.
     */
    public java.lang.String getUsuario() {
      java.lang.Object ref = usuario_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        usuario_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string usuario = 1;</code>
     * @return The bytes for usuario.
     */
    public com.google.protobuf.ByteString
        getUsuarioBytes() {
      java.lang.Object ref = usuario_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        usuario_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string usuario = 1;</code>
     * @param value The usuario to set.
     * @return This builder for chaining.
     */
    public Builder setUsuario(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      usuario_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string usuario = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsuario() {
      
      usuario_ = getDefaultInstance().getUsuario();
      onChanged();
      return this;
    }
    /**
     * <code>string usuario = 1;</code>
     * @param value The bytes for usuario to set.
     * @return This builder for chaining.
     */
    public Builder setUsuarioBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      usuario_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object senha_ = "";
    /**
     * <code>string senha = 2;</code>
     * @return The senha.
     */
    public java.lang.String getSenha() {
      java.lang.Object ref = senha_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senha_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string senha = 2;</code>
     * @return The bytes for senha.
     */
    public com.google.protobuf.ByteString
        getSenhaBytes() {
      java.lang.Object ref = senha_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string senha = 2;</code>
     * @param value The senha to set.
     * @return This builder for chaining.
     */
    public Builder setSenha(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      senha_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string senha = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSenha() {
      
      senha_ = getDefaultInstance().getSenha();
      onChanged();
      return this;
    }
    /**
     * <code>string senha = 2;</code>
     * @param value The bytes for senha to set.
     * @return This builder for chaining.
     */
    public Builder setSenhaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      senha_ = value;
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


    // @@protoc_insertion_point(builder_scope:sensor_service.ParamLogin)
  }

  // @@protoc_insertion_point(class_scope:sensor_service.ParamLogin)
  private static final io.grpc.examples.iotservice.ParamLogin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.iotservice.ParamLogin();
  }

  public static io.grpc.examples.iotservice.ParamLogin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParamLogin>
      PARSER = new com.google.protobuf.AbstractParser<ParamLogin>() {
    @java.lang.Override
    public ParamLogin parsePartialFrom(
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

  public static com.google.protobuf.Parser<ParamLogin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParamLogin> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.iotservice.ParamLogin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

