// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public interface CompensationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CompensationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.BASE],
   * which is referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry entries = 1;
   * </code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry>
      getEntriesList();
  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.BASE],
   * which is referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry entries = 1;
   * </code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry getEntries(int index);
  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.BASE],
   * which is referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry entries = 1;
   * </code>
   */
  int getEntriesCount();
  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.BASE],
   * which is referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry entries = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.talent.v4beta1.CompensationInfo.CompensationEntryOrBuilder>
      getEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Job compensation information.
   * At most one entry can be of type
   * [CompensationInfo.CompensationType.BASE][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.BASE],
   * which is referred as **base compensation entry** for the job.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry entries = 1;
   * </code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationEntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. Annualized base compensation range. Computed as base
   * compensation entry's
   * [CompensationEntry.amount][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.amount]
   * times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See
   * [CompensationEntry][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry]
   * for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CompensationInfo.CompensationRange annualized_base_compensation_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean hasAnnualizedBaseCompensationRange();
  /**
   *
   *
   * <pre>
   * Output only. Annualized base compensation range. Computed as base
   * compensation entry's
   * [CompensationEntry.amount][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.amount]
   * times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See
   * [CompensationEntry][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry]
   * for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CompensationInfo.CompensationRange annualized_base_compensation_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange
      getAnnualizedBaseCompensationRange();
  /**
   *
   *
   * <pre>
   * Output only. Annualized base compensation range. Computed as base
   * compensation entry's
   * [CompensationEntry.amount][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.amount]
   * times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See
   * [CompensationEntry][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry]
   * for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CompensationInfo.CompensationRange annualized_base_compensation_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationRangeOrBuilder
      getAnnualizedBaseCompensationRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Annualized total compensation range. Computed as all
   * compensation entries'
   * [CompensationEntry.amount][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.amount]
   * times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See
   * [CompensationEntry][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry]
   * for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CompensationInfo.CompensationRange annualized_total_compensation_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean hasAnnualizedTotalCompensationRange();
  /**
   *
   *
   * <pre>
   * Output only. Annualized total compensation range. Computed as all
   * compensation entries'
   * [CompensationEntry.amount][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.amount]
   * times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See
   * [CompensationEntry][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry]
   * for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CompensationInfo.CompensationRange annualized_total_compensation_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange
      getAnnualizedTotalCompensationRange();
  /**
   *
   *
   * <pre>
   * Output only. Annualized total compensation range. Computed as all
   * compensation entries'
   * [CompensationEntry.amount][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.amount]
   * times
   * [CompensationEntry.expected_units_per_year][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.expected_units_per_year].
   * See
   * [CompensationEntry][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry]
   * for explanation on compensation annualization.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CompensationInfo.CompensationRange annualized_total_compensation_range = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationRangeOrBuilder
      getAnnualizedTotalCompensationRangeOrBuilder();
}
