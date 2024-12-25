// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package com.example.grpc2.stubs;

/**
 * <pre>
 * Réponse contenant les statistiques de solde
 * </pre>
 *
 * Protobuf type {@code GetTotalSoldeResponse}
 */
public  final class GetTotalSoldeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetTotalSoldeResponse)
    GetTotalSoldeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTotalSoldeResponse.newBuilder() to construct.
  private GetTotalSoldeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTotalSoldeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTotalSoldeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTotalSoldeResponse(
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
            com.example.grpc2.stubs.SoldeStats.Builder subBuilder = null;
            if (stats_ != null) {
              subBuilder = stats_.toBuilder();
            }
            stats_ = input.readMessage(com.example.grpc2.stubs.SoldeStats.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stats_);
              stats_ = subBuilder.buildPartial();
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
    return com.example.grpc2.stubs.CompteServiceOuterClass.internal_static_GetTotalSoldeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc2.stubs.CompteServiceOuterClass.internal_static_GetTotalSoldeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc2.stubs.GetTotalSoldeResponse.class, com.example.grpc2.stubs.GetTotalSoldeResponse.Builder.class);
  }

  public static final int STATS_FIELD_NUMBER = 1;
  private com.example.grpc2.stubs.SoldeStats stats_;
  /**
   * <code>.SoldeStats stats = 1;</code>
   * @return Whether the stats field is set.
   */
  public boolean hasStats() {
    return stats_ != null;
  }
  /**
   * <code>.SoldeStats stats = 1;</code>
   * @return The stats.
   */
  public com.example.grpc2.stubs.SoldeStats getStats() {
    return stats_ == null ? com.example.grpc2.stubs.SoldeStats.getDefaultInstance() : stats_;
  }
  /**
   * <code>.SoldeStats stats = 1;</code>
   */
  public com.example.grpc2.stubs.SoldeStatsOrBuilder getStatsOrBuilder() {
    return getStats();
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
    if (stats_ != null) {
      output.writeMessage(1, getStats());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stats_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStats());
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
    if (!(obj instanceof com.example.grpc2.stubs.GetTotalSoldeResponse)) {
      return super.equals(obj);
    }
    com.example.grpc2.stubs.GetTotalSoldeResponse other = (com.example.grpc2.stubs.GetTotalSoldeResponse) obj;

    if (hasStats() != other.hasStats()) return false;
    if (hasStats()) {
      if (!getStats()
          .equals(other.getStats())) return false;
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
    if (hasStats()) {
      hash = (37 * hash) + STATS_FIELD_NUMBER;
      hash = (53 * hash) + getStats().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc2.stubs.GetTotalSoldeResponse parseFrom(
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
  public static Builder newBuilder(com.example.grpc2.stubs.GetTotalSoldeResponse prototype) {
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
   * <pre>
   * Réponse contenant les statistiques de solde
   * </pre>
   *
   * Protobuf type {@code GetTotalSoldeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetTotalSoldeResponse)
      com.example.grpc2.stubs.GetTotalSoldeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc2.stubs.CompteServiceOuterClass.internal_static_GetTotalSoldeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc2.stubs.CompteServiceOuterClass.internal_static_GetTotalSoldeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc2.stubs.GetTotalSoldeResponse.class, com.example.grpc2.stubs.GetTotalSoldeResponse.Builder.class);
    }

    // Construct using com.example.grpc2.stubs.GetTotalSoldeResponse.newBuilder()
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
      if (statsBuilder_ == null) {
        stats_ = null;
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc2.stubs.CompteServiceOuterClass.internal_static_GetTotalSoldeResponse_descriptor;
    }

    @java.lang.Override
    public com.example.grpc2.stubs.GetTotalSoldeResponse getDefaultInstanceForType() {
      return com.example.grpc2.stubs.GetTotalSoldeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc2.stubs.GetTotalSoldeResponse build() {
      com.example.grpc2.stubs.GetTotalSoldeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc2.stubs.GetTotalSoldeResponse buildPartial() {
      com.example.grpc2.stubs.GetTotalSoldeResponse result = new com.example.grpc2.stubs.GetTotalSoldeResponse(this);
      if (statsBuilder_ == null) {
        result.stats_ = stats_;
      } else {
        result.stats_ = statsBuilder_.build();
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
      if (other instanceof com.example.grpc2.stubs.GetTotalSoldeResponse) {
        return mergeFrom((com.example.grpc2.stubs.GetTotalSoldeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc2.stubs.GetTotalSoldeResponse other) {
      if (other == com.example.grpc2.stubs.GetTotalSoldeResponse.getDefaultInstance()) return this;
      if (other.hasStats()) {
        mergeStats(other.getStats());
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
      com.example.grpc2.stubs.GetTotalSoldeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc2.stubs.GetTotalSoldeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.grpc2.stubs.SoldeStats stats_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc2.stubs.SoldeStats, com.example.grpc2.stubs.SoldeStats.Builder, com.example.grpc2.stubs.SoldeStatsOrBuilder> statsBuilder_;
    /**
     * <code>.SoldeStats stats = 1;</code>
     * @return Whether the stats field is set.
     */
    public boolean hasStats() {
      return statsBuilder_ != null || stats_ != null;
    }
    /**
     * <code>.SoldeStats stats = 1;</code>
     * @return The stats.
     */
    public com.example.grpc2.stubs.SoldeStats getStats() {
      if (statsBuilder_ == null) {
        return stats_ == null ? com.example.grpc2.stubs.SoldeStats.getDefaultInstance() : stats_;
      } else {
        return statsBuilder_.getMessage();
      }
    }
    /**
     * <code>.SoldeStats stats = 1;</code>
     */
    public Builder setStats(com.example.grpc2.stubs.SoldeStats value) {
      if (statsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stats_ = value;
        onChanged();
      } else {
        statsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.SoldeStats stats = 1;</code>
     */
    public Builder setStats(
        com.example.grpc2.stubs.SoldeStats.Builder builderForValue) {
      if (statsBuilder_ == null) {
        stats_ = builderForValue.build();
        onChanged();
      } else {
        statsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.SoldeStats stats = 1;</code>
     */
    public Builder mergeStats(com.example.grpc2.stubs.SoldeStats value) {
      if (statsBuilder_ == null) {
        if (stats_ != null) {
          stats_ =
            com.example.grpc2.stubs.SoldeStats.newBuilder(stats_).mergeFrom(value).buildPartial();
        } else {
          stats_ = value;
        }
        onChanged();
      } else {
        statsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.SoldeStats stats = 1;</code>
     */
    public Builder clearStats() {
      if (statsBuilder_ == null) {
        stats_ = null;
        onChanged();
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.SoldeStats stats = 1;</code>
     */
    public com.example.grpc2.stubs.SoldeStats.Builder getStatsBuilder() {
      
      onChanged();
      return getStatsFieldBuilder().getBuilder();
    }
    /**
     * <code>.SoldeStats stats = 1;</code>
     */
    public com.example.grpc2.stubs.SoldeStatsOrBuilder getStatsOrBuilder() {
      if (statsBuilder_ != null) {
        return statsBuilder_.getMessageOrBuilder();
      } else {
        return stats_ == null ?
            com.example.grpc2.stubs.SoldeStats.getDefaultInstance() : stats_;
      }
    }
    /**
     * <code>.SoldeStats stats = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc2.stubs.SoldeStats, com.example.grpc2.stubs.SoldeStats.Builder, com.example.grpc2.stubs.SoldeStatsOrBuilder> 
        getStatsFieldBuilder() {
      if (statsBuilder_ == null) {
        statsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc2.stubs.SoldeStats, com.example.grpc2.stubs.SoldeStats.Builder, com.example.grpc2.stubs.SoldeStatsOrBuilder>(
                getStats(),
                getParentForChildren(),
                isClean());
        stats_ = null;
      }
      return statsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetTotalSoldeResponse)
  }

  // @@protoc_insertion_point(class_scope:GetTotalSoldeResponse)
  private static final com.example.grpc2.stubs.GetTotalSoldeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc2.stubs.GetTotalSoldeResponse();
  }

  public static com.example.grpc2.stubs.GetTotalSoldeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTotalSoldeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTotalSoldeResponse>() {
    @java.lang.Override
    public GetTotalSoldeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTotalSoldeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTotalSoldeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTotalSoldeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc2.stubs.GetTotalSoldeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

