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
import io.swagger.client.model.ConfigBlockchain;
import io.swagger.client.model.ConfigKeys;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Config
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-06-12T15:56:08.924+03:00")
public class Config {
@SerializedName("bi_server")
  private String biServer = null;
  @SerializedName("blockchain")
  private ConfigBlockchain blockchain = null;
  @SerializedName("keys")
  private Map<String, ConfigKeys> keys = null;
  
  public Config biServer(String biServer) {
    this.biServer = biServer;
    return this;
  }

  
  /**
  * Get biServer
  * @return biServer
  **/
  @ApiModelProperty(value = "")
  public String getBiServer() {
    return biServer;
  }
  public void setBiServer(String biServer) {
    this.biServer = biServer;
  }
  
  public Config blockchain(ConfigBlockchain blockchain) {
    this.blockchain = blockchain;
    return this;
  }

  
  /**
  * Get blockchain
  * @return blockchain
  **/
  @ApiModelProperty(required = true, value = "")
  public ConfigBlockchain getBlockchain() {
    return blockchain;
  }
  public void setBlockchain(ConfigBlockchain blockchain) {
    this.blockchain = blockchain;
  }
  
  public Config keys(Map<String, ConfigKeys> keys) {
    this.keys = keys;
    return this;
  }

  public Config putKeysItem(String key, ConfigKeys keysItem) {
    
    this.keys.put(key, keysItem);
    return this;
  }
  /**
  * Get keys
  * @return keys
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, ConfigKeys> getKeys() {
    return keys;
  }
  public void setKeys(Map<String, ConfigKeys> keys) {
    this.keys = keys;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.biServer, config.biServer) &&
        Objects.equals(this.blockchain, config.blockchain) &&
        Objects.equals(this.keys, config.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biServer, blockchain, keys);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    
    sb.append("    biServer: ").append(toIndentedString(biServer)).append("\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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



