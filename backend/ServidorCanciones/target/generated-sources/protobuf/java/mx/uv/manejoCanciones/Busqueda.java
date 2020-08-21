// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manejoCanciones.proto

package mx.uv.manejoCanciones;

/**
 * Protobuf type {@code mnjCanciones.Busqueda}
 */
public final class Busqueda extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mnjCanciones.Busqueda)
    BusquedaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Busqueda.newBuilder() to construct.
  private Busqueda(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Busqueda() {
    nombre_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Busqueda();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Busqueda(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            nombre_ = s;
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
    return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_Busqueda_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_Busqueda_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            mx.uv.manejoCanciones.Busqueda.class, mx.uv.manejoCanciones.Busqueda.Builder.class);
  }

  public static final int NOMBRE_FIELD_NUMBER = 1;
  private volatile java.lang.Object nombre_;
  /**
   * <code>string nombre = 1;</code>
   * @return The nombre.
   */
  @java.lang.Override
  public java.lang.String getNombre() {
    java.lang.Object ref = nombre_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nombre_ = s;
      return s;
    }
  }
  /**
   * <code>string nombre = 1;</code>
   * @return The bytes for nombre.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNombreBytes() {
    java.lang.Object ref = nombre_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nombre_ = b;
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
    if (!getNombreBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nombre_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNombreBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nombre_);
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
    if (!(obj instanceof mx.uv.manejoCanciones.Busqueda)) {
      return super.equals(obj);
    }
    mx.uv.manejoCanciones.Busqueda other = (mx.uv.manejoCanciones.Busqueda) obj;

    if (!getNombre()
        .equals(other.getNombre())) return false;
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
    hash = (37 * hash) + NOMBRE_FIELD_NUMBER;
    hash = (53 * hash) + getNombre().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static mx.uv.manejoCanciones.Busqueda parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.Busqueda parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static mx.uv.manejoCanciones.Busqueda parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mx.uv.manejoCanciones.Busqueda parseFrom(
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
  public static Builder newBuilder(mx.uv.manejoCanciones.Busqueda prototype) {
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
   * Protobuf type {@code mnjCanciones.Busqueda}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mnjCanciones.Busqueda)
      mx.uv.manejoCanciones.BusquedaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_Busqueda_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_Busqueda_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mx.uv.manejoCanciones.Busqueda.class, mx.uv.manejoCanciones.Busqueda.Builder.class);
    }

    // Construct using mx.uv.manejoCanciones.Busqueda.newBuilder()
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
      nombre_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return mx.uv.manejoCanciones.CancionesProto.internal_static_mnjCanciones_Busqueda_descriptor;
    }

    @java.lang.Override
    public mx.uv.manejoCanciones.Busqueda getDefaultInstanceForType() {
      return mx.uv.manejoCanciones.Busqueda.getDefaultInstance();
    }

    @java.lang.Override
    public mx.uv.manejoCanciones.Busqueda build() {
      mx.uv.manejoCanciones.Busqueda result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public mx.uv.manejoCanciones.Busqueda buildPartial() {
      mx.uv.manejoCanciones.Busqueda result = new mx.uv.manejoCanciones.Busqueda(this);
      result.nombre_ = nombre_;
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
      if (other instanceof mx.uv.manejoCanciones.Busqueda) {
        return mergeFrom((mx.uv.manejoCanciones.Busqueda)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(mx.uv.manejoCanciones.Busqueda other) {
      if (other == mx.uv.manejoCanciones.Busqueda.getDefaultInstance()) return this;
      if (!other.getNombre().isEmpty()) {
        nombre_ = other.nombre_;
        onChanged();
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
      mx.uv.manejoCanciones.Busqueda parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (mx.uv.manejoCanciones.Busqueda) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object nombre_ = "";
    /**
     * <code>string nombre = 1;</code>
     * @return The nombre.
     */
    public java.lang.String getNombre() {
      java.lang.Object ref = nombre_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nombre_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nombre = 1;</code>
     * @return The bytes for nombre.
     */
    public com.google.protobuf.ByteString
        getNombreBytes() {
      java.lang.Object ref = nombre_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nombre_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nombre = 1;</code>
     * @param value The nombre to set.
     * @return This builder for chaining.
     */
    public Builder setNombre(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nombre_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nombre = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNombre() {
      
      nombre_ = getDefaultInstance().getNombre();
      onChanged();
      return this;
    }
    /**
     * <code>string nombre = 1;</code>
     * @param value The bytes for nombre to set.
     * @return This builder for chaining.
     */
    public Builder setNombreBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nombre_ = value;
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


    // @@protoc_insertion_point(builder_scope:mnjCanciones.Busqueda)
  }

  // @@protoc_insertion_point(class_scope:mnjCanciones.Busqueda)
  private static final mx.uv.manejoCanciones.Busqueda DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new mx.uv.manejoCanciones.Busqueda();
  }

  public static mx.uv.manejoCanciones.Busqueda getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Busqueda>
      PARSER = new com.google.protobuf.AbstractParser<Busqueda>() {
    @java.lang.Override
    public Busqueda parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Busqueda(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Busqueda> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Busqueda> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public mx.uv.manejoCanciones.Busqueda getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

