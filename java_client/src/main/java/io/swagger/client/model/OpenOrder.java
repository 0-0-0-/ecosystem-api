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
import io.swagger.client.model.BlockchainData;
import java.io.IOException;

/**
 * an open order that hasn&#x27;t been submitted yet
 */@ApiModel(description = "an open order that hasn't been submitted yet")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-02-15T10:30:05.403+02:00")
public class OpenOrder {
@SerializedName("id")
  private String id = null;
  @SerializedName("blockchain_data")
  private BlockchainData blockchainData = null;
  
  public OpenOrder id(String id) {
    this.id = id;
    return this;
  }

  
  /**
  * Get id
  * @return id
  **/
  @ApiModelProperty(example = "sdfsdfsdfsd", required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  public OpenOrder blockchainData(BlockchainData blockchainData) {
    this.blockchainData = blockchainData;
    return this;
  }

  
  /**
  * Get blockchainData
  * @return blockchainData
  **/
  @ApiModelProperty(value = "")
  public BlockchainData getBlockchainData() {
    return blockchainData;
  }
  public void setBlockchainData(BlockchainData blockchainData) {
    this.blockchainData = blockchainData;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenOrder openOrder = (OpenOrder) o;
    return Objects.equals(this.id, openOrder.id) &&
        Objects.equals(this.blockchainData, openOrder.blockchainData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, blockchainData);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    blockchainData: ").append(toIndentedString(blockchainData)).append("\n");
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


