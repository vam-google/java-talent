/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Filter on the job information of Application.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.ApplicationJobFilter}
 */
public final class ApplicationJobFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.ApplicationJobFilter)
    ApplicationJobFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApplicationJobFilter.newBuilder() to construct.
  private ApplicationJobFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApplicationJobFilter() {
    jobRequisitionId_ = "";
    jobTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ApplicationJobFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ApplicationJobFilter(
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
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              jobRequisitionId_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              jobTitle_ = s;
              break;
            }
          case 32:
            {
              negated_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.ApplicationJobFilter.class,
            com.google.cloud.talent.v4beta1.ApplicationJobFilter.Builder.class);
  }

  public static final int JOB_REQUISITION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object jobRequisitionId_;
  /**
   *
   *
   * <pre>
   * The job requisition id in the application. The API does an exact match on
   * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
   * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_requisition_id = 2;</code>
   *
   * @return The jobRequisitionId.
   */
  public java.lang.String getJobRequisitionId() {
    java.lang.Object ref = jobRequisitionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobRequisitionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The job requisition id in the application. The API does an exact match on
   * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
   * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_requisition_id = 2;</code>
   *
   * @return The bytes for jobRequisitionId.
   */
  public com.google.protobuf.ByteString getJobRequisitionIdBytes() {
    java.lang.Object ref = jobRequisitionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      jobRequisitionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_TITLE_FIELD_NUMBER = 3;
  private volatile java.lang.Object jobTitle_;
  /**
   *
   *
   * <pre>
   * The job title in the application. The API does an exact match on the
   * [Job.title][google.cloud.talent.v4beta1.Job.title] of
   * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_title = 3;</code>
   *
   * @return The jobTitle.
   */
  public java.lang.String getJobTitle() {
    java.lang.Object ref = jobTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobTitle_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The job title in the application. The API does an exact match on the
   * [Job.title][google.cloud.talent.v4beta1.Job.title] of
   * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_title = 3;</code>
   *
   * @return The bytes for jobTitle.
   */
  public com.google.protobuf.ByteString getJobTitleBytes() {
    java.lang.Object ref = jobTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      jobTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEGATED_FIELD_NUMBER = 4;
  private boolean negated_;
  /**
   *
   *
   * <pre>
   * If true, the API excludes all profiles with any
   * [Application.job][google.cloud.talent.v4beta1.Application.job] matching the
   * filters.
   * </pre>
   *
   * <code>bool negated = 4;</code>
   *
   * @return The negated.
   */
  public boolean getNegated() {
    return negated_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getJobRequisitionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobRequisitionId_);
    }
    if (!getJobTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jobTitle_);
    }
    if (negated_ != false) {
      output.writeBool(4, negated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJobRequisitionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jobRequisitionId_);
    }
    if (!getJobTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jobTitle_);
    }
    if (negated_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, negated_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.ApplicationJobFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.ApplicationJobFilter other =
        (com.google.cloud.talent.v4beta1.ApplicationJobFilter) obj;

    if (!getJobRequisitionId().equals(other.getJobRequisitionId())) return false;
    if (!getJobTitle().equals(other.getJobTitle())) return false;
    if (getNegated() != other.getNegated()) return false;
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
    hash = (37 * hash) + JOB_REQUISITION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobRequisitionId().hashCode();
    hash = (37 * hash) + JOB_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getJobTitle().hashCode();
    hash = (37 * hash) + NEGATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getNegated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.ApplicationJobFilter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Filter on the job information of Application.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.ApplicationJobFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.ApplicationJobFilter)
      com.google.cloud.talent.v4beta1.ApplicationJobFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.ApplicationJobFilter.class,
              com.google.cloud.talent.v4beta1.ApplicationJobFilter.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.ApplicationJobFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      jobRequisitionId_ = "";

      jobTitle_ = "";

      negated_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationJobFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationJobFilter getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.ApplicationJobFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationJobFilter build() {
      com.google.cloud.talent.v4beta1.ApplicationJobFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationJobFilter buildPartial() {
      com.google.cloud.talent.v4beta1.ApplicationJobFilter result =
          new com.google.cloud.talent.v4beta1.ApplicationJobFilter(this);
      result.jobRequisitionId_ = jobRequisitionId_;
      result.jobTitle_ = jobTitle_;
      result.negated_ = negated_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.ApplicationJobFilter) {
        return mergeFrom((com.google.cloud.talent.v4beta1.ApplicationJobFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.ApplicationJobFilter other) {
      if (other == com.google.cloud.talent.v4beta1.ApplicationJobFilter.getDefaultInstance())
        return this;
      if (!other.getJobRequisitionId().isEmpty()) {
        jobRequisitionId_ = other.jobRequisitionId_;
        onChanged();
      }
      if (!other.getJobTitle().isEmpty()) {
        jobTitle_ = other.jobTitle_;
        onChanged();
      }
      if (other.getNegated() != false) {
        setNegated(other.getNegated());
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
      com.google.cloud.talent.v4beta1.ApplicationJobFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.ApplicationJobFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object jobRequisitionId_ = "";
    /**
     *
     *
     * <pre>
     * The job requisition id in the application. The API does an exact match on
     * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_requisition_id = 2;</code>
     *
     * @return The jobRequisitionId.
     */
    public java.lang.String getJobRequisitionId() {
      java.lang.Object ref = jobRequisitionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobRequisitionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The job requisition id in the application. The API does an exact match on
     * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_requisition_id = 2;</code>
     *
     * @return The bytes for jobRequisitionId.
     */
    public com.google.protobuf.ByteString getJobRequisitionIdBytes() {
      java.lang.Object ref = jobRequisitionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        jobRequisitionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The job requisition id in the application. The API does an exact match on
     * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_requisition_id = 2;</code>
     *
     * @param value The jobRequisitionId to set.
     * @return This builder for chaining.
     */
    public Builder setJobRequisitionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      jobRequisitionId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The job requisition id in the application. The API does an exact match on
     * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_requisition_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJobRequisitionId() {

      jobRequisitionId_ = getDefaultInstance().getJobRequisitionId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The job requisition id in the application. The API does an exact match on
     * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_requisition_id = 2;</code>
     *
     * @param value The bytes for jobRequisitionId to set.
     * @return This builder for chaining.
     */
    public Builder setJobRequisitionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      jobRequisitionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jobTitle_ = "";
    /**
     *
     *
     * <pre>
     * The job title in the application. The API does an exact match on the
     * [Job.title][google.cloud.talent.v4beta1.Job.title] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_title = 3;</code>
     *
     * @return The jobTitle.
     */
    public java.lang.String getJobTitle() {
      java.lang.Object ref = jobTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The job title in the application. The API does an exact match on the
     * [Job.title][google.cloud.talent.v4beta1.Job.title] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_title = 3;</code>
     *
     * @return The bytes for jobTitle.
     */
    public com.google.protobuf.ByteString getJobTitleBytes() {
      java.lang.Object ref = jobTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        jobTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The job title in the application. The API does an exact match on the
     * [Job.title][google.cloud.talent.v4beta1.Job.title] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_title = 3;</code>
     *
     * @param value The jobTitle to set.
     * @return This builder for chaining.
     */
    public Builder setJobTitle(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      jobTitle_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The job title in the application. The API does an exact match on the
     * [Job.title][google.cloud.talent.v4beta1.Job.title] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_title = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJobTitle() {

      jobTitle_ = getDefaultInstance().getJobTitle();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The job title in the application. The API does an exact match on the
     * [Job.title][google.cloud.talent.v4beta1.Job.title] of
     * [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
     * </pre>
     *
     * <code>string job_title = 3;</code>
     *
     * @param value The bytes for jobTitle to set.
     * @return This builder for chaining.
     */
    public Builder setJobTitleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      jobTitle_ = value;
      onChanged();
      return this;
    }

    private boolean negated_;
    /**
     *
     *
     * <pre>
     * If true, the API excludes all profiles with any
     * [Application.job][google.cloud.talent.v4beta1.Application.job] matching the
     * filters.
     * </pre>
     *
     * <code>bool negated = 4;</code>
     *
     * @return The negated.
     */
    public boolean getNegated() {
      return negated_;
    }
    /**
     *
     *
     * <pre>
     * If true, the API excludes all profiles with any
     * [Application.job][google.cloud.talent.v4beta1.Application.job] matching the
     * filters.
     * </pre>
     *
     * <code>bool negated = 4;</code>
     *
     * @param value The negated to set.
     * @return This builder for chaining.
     */
    public Builder setNegated(boolean value) {

      negated_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, the API excludes all profiles with any
     * [Application.job][google.cloud.talent.v4beta1.Application.job] matching the
     * filters.
     * </pre>
     *
     * <code>bool negated = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNegated() {

      negated_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.ApplicationJobFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.ApplicationJobFilter)
  private static final com.google.cloud.talent.v4beta1.ApplicationJobFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.ApplicationJobFilter();
  }

  public static com.google.cloud.talent.v4beta1.ApplicationJobFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplicationJobFilter> PARSER =
      new com.google.protobuf.AbstractParser<ApplicationJobFilter>() {
        @java.lang.Override
        public ApplicationJobFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApplicationJobFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ApplicationJobFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplicationJobFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.ApplicationJobFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
