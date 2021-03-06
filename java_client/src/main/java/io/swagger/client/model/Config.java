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
import io.swagger.client.model.ConfigJwtKeys;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Config
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-31T11:02:17.956+02:00")
public class Config {
@SerializedName("environment_name")
  private String environmentName = null;
  @SerializedName("ecosystem_service")
  private String ecosystemService = null;
  @SerializedName("webview")
  private String webview = null;
  @SerializedName("bi_service")
  private String biService = null;
  @SerializedName("blockchain")
  private ConfigBlockchain blockchain = null;
  @SerializedName("jwt_keys")
  private Map<String, ConfigJwtKeys> jwtKeys = null;
  
  public Config environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  
  /**
  * Get environmentName
  * @return environmentName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEnvironmentName() {
    return environmentName;
  }
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }
  
  public Config ecosystemService(String ecosystemService) {
    this.ecosystemService = ecosystemService;
    return this;
  }

  
  /**
  * Get ecosystemService
  * @return ecosystemService
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEcosystemService() {
    return ecosystemService;
  }
  public void setEcosystemService(String ecosystemService) {
    this.ecosystemService = ecosystemService;
  }
  
  public Config webview(String webview) {
    this.webview = webview;
    return this;
  }

  
  /**
  * Get webview
  * @return webview
  **/
  @ApiModelProperty(required = true, value = "")
  public String getWebview() {
    return webview;
  }
  public void setWebview(String webview) {
    this.webview = webview;
  }
  
  public Config biService(String biService) {
    this.biService = biService;
    return this;
  }

  
  /**
  * Get biService
  * @return biService
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBiService() {
    return biService;
  }
  public void setBiService(String biService) {
    this.biService = biService;
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
  
  public Config jwtKeys(Map<String, ConfigJwtKeys> jwtKeys) {
    this.jwtKeys = jwtKeys;
    return this;
  }

  public Config putJwtKeysItem(String key, ConfigJwtKeys jwtKeysItem) {
    
    this.jwtKeys.put(key, jwtKeysItem);
    return this;
  }
  /**
  * Get jwtKeys
  * @return jwtKeys
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, ConfigJwtKeys> getJwtKeys() {
    return jwtKeys;
  }
  public void setJwtKeys(Map<String, ConfigJwtKeys> jwtKeys) {
    this.jwtKeys = jwtKeys;
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
    return Objects.equals(this.environmentName, config.environmentName) &&
        Objects.equals(this.ecosystemService, config.ecosystemService) &&
        Objects.equals(this.webview, config.webview) &&
        Objects.equals(this.biService, config.biService) &&
        Objects.equals(this.blockchain, config.blockchain) &&
        Objects.equals(this.jwtKeys, config.jwtKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, ecosystemService, webview, biService, blockchain, jwtKeys);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    ecosystemService: ").append(toIndentedString(ecosystemService)).append("\n");
    sb.append("    webview: ").append(toIndentedString(webview)).append("\n");
    sb.append("    biService: ").append(toIndentedString(biService)).append("\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    jwtKeys: ").append(toIndentedString(jwtKeys)).append("\n");
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



