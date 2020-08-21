// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manejoCanciones.proto

package mx.uv.manejoCanciones;

/**
 * Protobuf type {@code mnjCanciones.CancionAG}
 */
public final class CancionAG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mnjCanciones.CancionAG)
    CancionAGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CancionAG.newBuilder() to construct.
  private CancionAG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CancionAG() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CancionAG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CancionAG(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            idUsuario_ = input.readInt32();
            break;
          }
          case 18: {
            mx.uv.manejoCanciones.Cancion.Builder subBuilder = null;
            if (cancion_ != null) {
              subBuilder = cancion_.toBuilder();
            }
            cancion_ = input.readMessage(mx.uv.manejoCanciones.Cancion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cancion_);
              cancion_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_CancionAG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_CancionAG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            mx.uv.manejoCanciones.CancionAG.class, mx.uv.manejoCanciones.CancionAG.Builder.class);
  }

  public static final int IDUSUARIO_FIELD_NUMBER = 1;
  private int idUsuario_;
  /**
   * <code>int32 idUsuario = 1;</code>
   * @return The idUsuario.
   */
  @java.lang.Override
  public int getIdUsuario() {
    return idUsuario_;
  }

  public static final int CANCION_FIELD_NUMBER = 2;
  private mx.uv.manejoCanciones.Cancion cancion_;
  /**
   * <code>.mnjCanciones.Cancion cancion = 2;</code>
   * @return Whether the cancion field is set.
   */
  @java.lang.Override
  public boolean hasCancion() {
    return cancion_ != null;
  }
  /**
   * <code>.mnjCanciones.Cancion cancion = 2;</code>
   * @return The cancion.
   */
  @java.lang.Override
  public mx.uv.manejoCanciones.Cancion getCancion() {
    return cancion_ == null ? mx.uv.manejoCanciones.Cancion.getDefaultInstance() : cancion_;
  }
  /**
   * <code>.mnjCanciones.Cancion cancion = 2;</code>
   */
  @java.lang.Override
  public mx.uv.manejoCanciones.CancionOrBuilder getCancionOrBuilder() {
    return getCancion();
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
    if (idUsuario_ != 0) {
      output.writeInt32(1, idUsuario_);
    }
    if (cancion_ != null) {
      output.writeMessage(2, getCancion());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idUsuario_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, idUsuario_);
    }
    if (cancion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCancion());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof mx.uv.manejoCanciones.CancionAG)) {
      return super.equals(obj);
    }
    mx.uv.manejoCanciones.CancionAG other = (mx.uv.manejoCanciones.CancionAG) obj;

    if (getIdUsuario()
        != other.getIdUsuario()) return false;
    if (hasCancion() != other.hasCancion()) return false;
    if (hasCancion()) {
      if (!getCancion()
          .equals(other.getCancion())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IDUSUARIO_FIELD_NUMBER;
    hash = (53 * hash) + getIdUsuario();
    if (hasCancion()) {
      hash = (37 * hash) + CANCION_FIELD_NUMBER;
      hash = (53 * hash) + getCancion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static mx.uv.manejoCanciones.CancionAG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.CancionAG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static mx.uv.manejoCanciones.CancionAG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mx.uv.manejoCanciones.CancionAG parseFrom(
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
  public static Builder newBuilder(mx.uv.manejoCanciones.CancionAG prototype) {
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
   * Protobuf type {@code mnjCanciones.CancionAG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mnjCanciones.CancionAG)
      mx.uv.manejoCanciones.CancionAGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_CancionAG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_CancionAG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mx.uv.manejoCanciones.CancionAG.class, mx.uv.manejoCanciones.CancionAG.Builder.class);
    }

    // Construct using mx.uv.manejoCanciones.CancionAG.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      idUsuario_ = 0;

      if (cancionBuilder_ == null) {
        cancion_ = null;
      } else {
        cancion_ = null;
        cancionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_CancionAG_descriptor;
    }

    @java.lang.Override
    public mx.uv.manejoCanciones.CancionAG getDefaultInstanceForType() {
      return mx.uv.manejoCanciones.CancionAG.getDefaultInstance();
    }

    @java.lang.Override
    public mx.uv.manejoCanciones.CancionAG build() {
      mx.uv.manejoCanciones.CancionAG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public mx.uv.manejoCanciones.CancionAG buildPartial() {
      mx.uv.manejoCanciones.CancionAG result = new mx.uv.manejoCanciones.CancionAG(this);
      result.idUsuario_ = idUsuario_;
      if (cancionBuilder_ == null) {
        result.cancion_ = cancion_;
      } else {
        result.cancion_ = cancionBuilder_.build();
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
      if (other instanceof mx.uv.manejoCanciones.CancionAG) {
        return mergeFrom((mx.uv.manejoCanciones.CancionAG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(mx.uv.manejoCanciones.CancionAG other) {
      if (other == mx.uv.manejoCanciones.CancionAG.getDefaultInstance()) return this;
      if (other.getIdUsuario() != 0) {
        setIdUsuario(other.getIdUsuario());
      }
      if (other.hasCancion()) {
        mergeCancion(other.getCancion());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      mx.uv.manejoCanciones.CancionAG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (mx.uv.manejoCanciones.CancionAG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int idUsuario_ ;
    /**
     * <code>int32 idUsuario = 1;</code>
     * @return The idUsuario.
     */
    @java.lang.Override
    public int getIdUsuario() {
      return idUsuario_;
    }
    /**
     * <code>int32 idUsuario = 1;</code>
     * @param value The idUsuario to set.
     * @return This builder for chaining.
     */
    public Builder setIdUsuario(int value) {
      
      idUsuario_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idUsuario = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdUsuario() {
      
      idUsuario_ = 0;
      onChanged();
      return this;
    }

    private mx.uv.manejoCanciones.Cancion cancion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        mx.uv.manejoCanciones.Cancion, mx.uv.manejoCanciones.Cancion.Builder, mx.uv.manejoCanciones.CancionOrBuilder> cancionBuilder_;
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     * @return Whether the cancion field is set.
     */
    public boolean hasCancion() {
      return cancionBuilder_ != null || cancion_ != null;
    }
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     * @return The cancion.
     */
    public mx.uv.manejoCanciones.Cancion getCancion() {
      if (cancionBuilder_ == null) {
        return cancion_ == null ? mx.uv.manejoCanciones.Cancion.getDefaultInstance() : cancion_;
      } else {
        return cancionBuilder_.getMessage();
      }
    }
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     */
    public Builder setCancion(mx.uv.manejoCanciones.Cancion value) {
      if (cancionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cancion_ = value;
        onChanged();
      } else {
        cancionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     */
    public Builder setCancion(
        mx.uv.manejoCanciones.Cancion.Builder builderForValue) {
      if (cancionBuilder_ == null) {
        cancion_ = builderForValue.build();
        onChanged();
      } else {
        cancionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     */
    public Builder mergeCancion(mx.uv.manejoCanciones.Cancion value) {
      if (cancionBuilder_ == null) {
        if (cancion_ != null) {
          cancion_ =
            mx.uv.manejoCanciones.Cancion.newBuilder(cancion_).mergeFrom(value).buildPartial();
        } else {
          cancion_ = value;
        }
        onChanged();
      } else {
        cancionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     */
    public Builder clearCancion() {
      if (cancionBuilder_ == null) {
        cancion_ = null;
        onChanged();
      } else {
        cancion_ = null;
        cancionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     */
    public mx.uv.manejoCanciones.Cancion.Builder getCancionBuilder() {
      
      onChanged();
      return getCancionFieldBuilder().getBuilder();
    }
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     */
    public mx.uv.manejoCanciones.CancionOrBuilder getCancionOrBuilder() {
      if (cancionBuilder_ != null) {
        return cancionBuilder_.getMessageOrBuilder();
      } else {
        return cancion_ == null ?
            mx.uv.manejoCanciones.Cancion.getDefaultInstance() : cancion_;
      }
    }
    /**
     * <code>.mnjCanciones.Cancion cancion = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        mx.uv.manejoCanciones.Cancion, mx.uv.manejoCanciones.Cancion.Builder, mx.uv.manejoCanciones.CancionOrBuilder> 
        getCancionFieldBuilder() {
      if (cancionBuilder_ == null) {
        cancionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            mx.uv.manejoCanciones.Cancion, mx.uv.manejoCanciones.Cancion.Builder, mx.uv.manejoCanciones.CancionOrBuilder>(
                getCancion(),
                getParentForChildren(),
                isClean());
        cancion_ = null;
      }
      return cancionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mnjCanciones.CancionAG)
  }

  // @@protoc_insertion_point(class_scope:mnjCanciones.CancionAG)
  private static final mx.uv.manejoCanciones.CancionAG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new mx.uv.manejoCanciones.CancionAG();
  }

  public static mx.uv.manejoCanciones.CancionAG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CancionAG>
      PARSER = new com.google.protobuf.AbstractParser<CancionAG>() {
    @java.lang.Override
    public CancionAG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CancionAG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CancionAG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CancionAG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public mx.uv.manejoCanciones.CancionAG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
