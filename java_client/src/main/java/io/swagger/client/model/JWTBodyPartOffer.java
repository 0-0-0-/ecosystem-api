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
import java.math.BigDecimal;

/**
 * JWTBodyPartOffer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-31T11:02:17.956+02:00")
public class JWTBodyPartOffer {
@SerializedName("id")
  private String id = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  
  public JWTBodyPartOffer id(String id) {
    this.id = id;
    return this;
  }

  
  /**
  * offer id - id is decided by digital service
  * @return id
  **/
  @ApiModelProperty(required = true, value = "offer id - id is decided by digital service")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  public JWTBodyPartOffer amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * amount of kin for this offer - price
  * @return amount
  **/
  @ApiModelProperty(required = true, value = "amount of kin for this offer - price")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTBodyPartOffer jwTBodyPartOffer = (JWTBodyPartOffer) o;
    return Objects.equals(this.id, jwTBodyPartOffer.id) &&
        Objects.equals(this.amount, jwTBodyPartOffer.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTBodyPartOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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



