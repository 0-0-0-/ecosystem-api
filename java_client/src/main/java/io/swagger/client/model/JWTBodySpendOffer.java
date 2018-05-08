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
 * JWTBodySpendOffer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-05-08T12:31:47.633+03:00")
public class JWTBodySpendOffer {
@SerializedName("id")
  private String id = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("wallet_address")
  private String walletAddress = null;
  
  public JWTBodySpendOffer id(String id) {
    this.id = id;
    return this;
  }

  
  /**
  * offer id - id is decided by digital service
  * @return id
  **/
  @ApiModelProperty(value = "offer id - id is decided by digital service")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  public JWTBodySpendOffer title(String title) {
    this.title = title;
    return this;
  }

  
  /**
  * offer title - appears in order history
  * @return title
  **/
  @ApiModelProperty(value = "offer title - appears in order history")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  
  public JWTBodySpendOffer description(String description) {
    this.description = description;
    return this;
  }

  
  /**
  * offer description - appears in order history
  * @return description
  **/
  @ApiModelProperty(value = "offer description - appears in order history")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public JWTBodySpendOffer amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * amount of kin for this offer - price
  * @return amount
  **/
  @ApiModelProperty(value = "amount of kin for this offer - price")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
  
  public JWTBodySpendOffer walletAddress(String walletAddress) {
    this.walletAddress = walletAddress;
    return this;
  }

  
  /**
  * address the client should send kin to to acquire this offer
  * @return walletAddress
  **/
  @ApiModelProperty(value = "address the client should send kin to to acquire this offer")
  public String getWalletAddress() {
    return walletAddress;
  }
  public void setWalletAddress(String walletAddress) {
    this.walletAddress = walletAddress;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTBodySpendOffer jwTBodySpendOffer = (JWTBodySpendOffer) o;
    return Objects.equals(this.id, jwTBodySpendOffer.id) &&
        Objects.equals(this.title, jwTBodySpendOffer.title) &&
        Objects.equals(this.description, jwTBodySpendOffer.description) &&
        Objects.equals(this.amount, jwTBodySpendOffer.amount) &&
        Objects.equals(this.walletAddress, jwTBodySpendOffer.walletAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, amount, walletAddress);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTBodySpendOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    walletAddress: ").append(toIndentedString(walletAddress)).append("\n");
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



