/*
 * Kin Ecosystem
 * Apis for client to server interaction
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EarnSubmission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-01-29T14:22:38.269+02:00")
public class EarnSubmission {
@SerializedName("recipient_address")
  private String recipientAddress = null;
  @SerializedName("completed_form")
  private Object completedForm = null;
  
  public EarnSubmission recipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
    return this;
  }

  
  /**
  * Get recipientAddress
  * @return recipientAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRecipientAddress() {
    return recipientAddress;
  }
  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }
  
  public EarnSubmission completedForm(Object completedForm) {
    this.completedForm = completedForm;
    return this;
  }

  
  /**
  * Get completedForm
  * @return completedForm
  **/
  @ApiModelProperty(value = "")
  public Object getCompletedForm() {
    return completedForm;
  }
  public void setCompletedForm(Object completedForm) {
    this.completedForm = completedForm;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarnSubmission earnSubmission = (EarnSubmission) o;
    return Objects.equals(this.recipientAddress, earnSubmission.recipientAddress) &&
        Objects.equals(this.completedForm, earnSubmission.completedForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientAddress, completedForm);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarnSubmission {\n");
    
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    completedForm: ").append(toIndentedString(completedForm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



