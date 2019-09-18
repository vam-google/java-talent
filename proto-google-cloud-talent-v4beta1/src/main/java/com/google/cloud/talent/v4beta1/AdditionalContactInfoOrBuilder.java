// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface AdditionalContactInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.AdditionalContactInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The usage of this contact method. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   */
  int getUsageValue();
  /**
   *
   *
   * <pre>
   * The usage of this contact method. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   */
  com.google.cloud.talent.v4beta1.ContactInfoUsage getUsage();

  /**
   *
   *
   * <pre>
   * The name of the contact method.
   * For example, "hangout", "skype".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the contact method.
   * For example, "hangout", "skype".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The contact id.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string contact_id = 3;</code>
   */
  java.lang.String getContactId();
  /**
   *
   *
   * <pre>
   * The contact id.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string contact_id = 3;</code>
   */
  com.google.protobuf.ByteString getContactIdBytes();
}
