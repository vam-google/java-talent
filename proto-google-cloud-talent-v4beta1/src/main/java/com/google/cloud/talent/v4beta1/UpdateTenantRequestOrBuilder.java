// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/tenant_service.proto

package com.google.cloud.talent.v4beta1;

public interface UpdateTenantRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.UpdateTenantRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasTenant();
  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.talent.v4beta1.Tenant getTenant();
  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.talent.v4beta1.TenantOrBuilder getTenantOrBuilder();

  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask]
   * is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are
   * updated. Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask]
   * is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are
   * updated. Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask]
   * is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are
   * updated. Otherwise all the fields are updated.
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
