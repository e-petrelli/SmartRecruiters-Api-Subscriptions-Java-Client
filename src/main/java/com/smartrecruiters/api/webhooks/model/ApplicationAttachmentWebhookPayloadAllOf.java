/*
 * Webhooks
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 201907.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartrecruiters.api.webhooks.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApplicationAttachmentWebhookPayloadAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-07T12:35:47.135042Z[Europe/London]")
public class ApplicationAttachmentWebhookPayloadAllOf {
  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachment_id";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private String attachmentId;


  public ApplicationAttachmentWebhookPayloadAllOf attachmentId(String attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * Get attachmentId
   * @return attachmentId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAttachmentId() {
    return attachmentId;
  }



  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationAttachmentWebhookPayloadAllOf applicationAttachmentWebhookPayloadAllOf = (ApplicationAttachmentWebhookPayloadAllOf) o;
    return Objects.equals(this.attachmentId, applicationAttachmentWebhookPayloadAllOf.attachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationAttachmentWebhookPayloadAllOf {\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
