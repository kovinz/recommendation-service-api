// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafka_message_sent_event.proto

package com.wine.to.up.notification.service.api.message;

public final class KafkaMessageSentEventOuterClass {
  private KafkaMessageSentEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KafkaMessageSentEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KafkaMessageSentEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 transactionId = 1;</code>
     */
    int getTransactionId();

    /**
     * <code>optional string message = 2;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 2;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    java.util.List<com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader> 
        getHeadersList();
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader getHeaders(int index);
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    int getHeadersCount();
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    java.util.List<? extends com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder> 
        getHeadersOrBuilderList();
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder getHeadersOrBuilder(
        int index);
  }
  /**
   * <pre>
   *event that indicates that message was sent to kafka
   * </pre>
   *
   * Protobuf type {@code KafkaMessageSentEvent}
   */
  public  static final class KafkaMessageSentEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KafkaMessageSentEvent)
      KafkaMessageSentEventOrBuilder {
    // Use KafkaMessageSentEvent.newBuilder() to construct.
    private KafkaMessageSentEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KafkaMessageSentEvent() {
      transactionId_ = 0;
      message_ = "";
      headers_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private KafkaMessageSentEvent(
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

              transactionId_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                headers_ = new java.util.ArrayList<com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader>();
                mutable_bitField0_ |= 0x00000004;
              }
              headers_.add(
                  input.readMessage(com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          headers_ = java.util.Collections.unmodifiableList(headers_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.internal_static_KafkaMessageSentEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.internal_static_KafkaMessageSentEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent.class, com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent.Builder.class);
    }

    private int bitField0_;
    public static final int TRANSACTIONID_FIELD_NUMBER = 1;
    private int transactionId_;
    /**
     * <code>optional int32 transactionId = 1;</code>
     */
    public int getTransactionId() {
      return transactionId_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object message_;
    /**
     * <code>optional string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>optional string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HEADERS_FIELD_NUMBER = 3;
    private java.util.List<com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader> headers_;
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    public java.util.List<com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader> getHeadersList() {
      return headers_;
    }
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    public java.util.List<? extends com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder> 
        getHeadersOrBuilderList() {
      return headers_;
    }
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    public int getHeadersCount() {
      return headers_.size();
    }
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    public com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader getHeaders(int index) {
      return headers_.get(index);
    }
    /**
     * <code>repeated .KafkaMessageHeader headers = 3;</code>
     */
    public com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder getHeadersOrBuilder(
        int index) {
      return headers_.get(index);
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
      if (transactionId_ != 0) {
        output.writeInt32(1, transactionId_);
      }
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
      }
      for (int i = 0; i < headers_.size(); i++) {
        output.writeMessage(3, headers_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (transactionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, transactionId_);
      }
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
      }
      for (int i = 0; i < headers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, headers_.get(i));
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
      if (!(obj instanceof com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent)) {
        return super.equals(obj);
      }
      com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent other = (com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent) obj;

      boolean result = true;
      result = result && (getTransactionId()
          == other.getTransactionId());
      result = result && getMessage()
          .equals(other.getMessage());
      result = result && getHeadersList()
          .equals(other.getHeadersList());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + TRANSACTIONID_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionId();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      if (getHeadersCount() > 0) {
        hash = (37 * hash) + HEADERS_FIELD_NUMBER;
        hash = (53 * hash) + getHeadersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parseFrom(
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
    public static Builder newBuilder(com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent prototype) {
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
     * <pre>
     *event that indicates that message was sent to kafka
     * </pre>
     *
     * Protobuf type {@code KafkaMessageSentEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KafkaMessageSentEvent)
        com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.internal_static_KafkaMessageSentEvent_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.internal_static_KafkaMessageSentEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent.class, com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent.Builder.class);
      }

      // Construct using com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent.newBuilder()
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
          getHeadersFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        transactionId_ = 0;

        message_ = "";

        if (headersBuilder_ == null) {
          headers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          headersBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.internal_static_KafkaMessageSentEvent_descriptor;
      }

      public com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent getDefaultInstanceForType() {
        return com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent.getDefaultInstance();
      }

      public com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent build() {
        com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent buildPartial() {
        com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent result = new com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.transactionId_ = transactionId_;
        result.message_ = message_;
        if (headersBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            headers_ = java.util.Collections.unmodifiableList(headers_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.headers_ = headers_;
        } else {
          result.headers_ = headersBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent) {
          return mergeFrom((com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent other) {
        if (other == com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent.getDefaultInstance()) return this;
        if (other.getTransactionId() != 0) {
          setTransactionId(other.getTransactionId());
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        if (headersBuilder_ == null) {
          if (!other.headers_.isEmpty()) {
            if (headers_.isEmpty()) {
              headers_ = other.headers_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureHeadersIsMutable();
              headers_.addAll(other.headers_);
            }
            onChanged();
          }
        } else {
          if (!other.headers_.isEmpty()) {
            if (headersBuilder_.isEmpty()) {
              headersBuilder_.dispose();
              headersBuilder_ = null;
              headers_ = other.headers_;
              bitField0_ = (bitField0_ & ~0x00000004);
              headersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getHeadersFieldBuilder() : null;
            } else {
              headersBuilder_.addAllMessages(other.headers_);
            }
          }
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
        com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int transactionId_ ;
      /**
       * <code>optional int32 transactionId = 1;</code>
       */
      public int getTransactionId() {
        return transactionId_;
      }
      /**
       * <code>optional int32 transactionId = 1;</code>
       */
      public Builder setTransactionId(int value) {
        
        transactionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 transactionId = 1;</code>
       */
      public Builder clearTransactionId() {
        
        transactionId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 2;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 2;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 2;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 2;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader> headers_ =
        java.util.Collections.emptyList();
      private void ensureHeadersIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          headers_ = new java.util.ArrayList<com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader>(headers_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder> headersBuilder_;

      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public java.util.List<com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader> getHeadersList() {
        if (headersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(headers_);
        } else {
          return headersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public int getHeadersCount() {
        if (headersBuilder_ == null) {
          return headers_.size();
        } else {
          return headersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader getHeaders(int index) {
        if (headersBuilder_ == null) {
          return headers_.get(index);
        } else {
          return headersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder setHeaders(
          int index, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader value) {
        if (headersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHeadersIsMutable();
          headers_.set(index, value);
          onChanged();
        } else {
          headersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder setHeaders(
          int index, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder builderForValue) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          headers_.set(index, builderForValue.build());
          onChanged();
        } else {
          headersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder addHeaders(com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader value) {
        if (headersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHeadersIsMutable();
          headers_.add(value);
          onChanged();
        } else {
          headersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder addHeaders(
          int index, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader value) {
        if (headersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHeadersIsMutable();
          headers_.add(index, value);
          onChanged();
        } else {
          headersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder addHeaders(
          com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder builderForValue) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          headers_.add(builderForValue.build());
          onChanged();
        } else {
          headersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder addHeaders(
          int index, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder builderForValue) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          headers_.add(index, builderForValue.build());
          onChanged();
        } else {
          headersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder addAllHeaders(
          java.lang.Iterable<? extends com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader> values) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, headers_);
          onChanged();
        } else {
          headersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder clearHeaders() {
        if (headersBuilder_ == null) {
          headers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          headersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public Builder removeHeaders(int index) {
        if (headersBuilder_ == null) {
          ensureHeadersIsMutable();
          headers_.remove(index);
          onChanged();
        } else {
          headersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder getHeadersBuilder(
          int index) {
        return getHeadersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder getHeadersOrBuilder(
          int index) {
        if (headersBuilder_ == null) {
          return headers_.get(index);  } else {
          return headersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public java.util.List<? extends com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder> 
           getHeadersOrBuilderList() {
        if (headersBuilder_ != null) {
          return headersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(headers_);
        }
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder addHeadersBuilder() {
        return getHeadersFieldBuilder().addBuilder(
            com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.getDefaultInstance());
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder addHeadersBuilder(
          int index) {
        return getHeadersFieldBuilder().addBuilder(
            index, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.getDefaultInstance());
      }
      /**
       * <code>repeated .KafkaMessageHeader headers = 3;</code>
       */
      public java.util.List<com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder> 
           getHeadersBuilderList() {
        return getHeadersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder> 
          getHeadersFieldBuilder() {
        if (headersBuilder_ == null) {
          headersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeader.Builder, com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.KafkaMessageHeaderOrBuilder>(
                  headers_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          headers_ = null;
        }
        return headersBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:KafkaMessageSentEvent)
    }

    // @@protoc_insertion_point(class_scope:KafkaMessageSentEvent)
    private static final com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent();
    }

    public static com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KafkaMessageSentEvent>
        PARSER = new com.google.protobuf.AbstractParser<KafkaMessageSentEvent>() {
      public KafkaMessageSentEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new KafkaMessageSentEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KafkaMessageSentEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KafkaMessageSentEvent> getParserForType() {
      return PARSER;
    }

    public com.wine.to.up.notification.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KafkaMessageSentEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KafkaMessageSentEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036kafka_message_sent_event.proto\032\032kafka_" +
      "message_header.proto\"e\n\025KafkaMessageSent" +
      "Event\022\025\n\rtransactionId\030\001 \001(\005\022\017\n\007message\030" +
      "\002 \001(\t\022$\n\007headers\030\003 \003(\0132\023.KafkaMessageHea" +
      "derB1\n/com.wine.to.up.notification.servi" +
      "ce.api.messageb\006proto3"
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
          com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.getDescriptor(),
        }, assigner);
    internal_static_KafkaMessageSentEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KafkaMessageSentEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KafkaMessageSentEvent_descriptor,
        new java.lang.String[] { "TransactionId", "Message", "Headers", });
    com.wine.to.up.notification.service.api.message.KafkaMessageHeaderOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}