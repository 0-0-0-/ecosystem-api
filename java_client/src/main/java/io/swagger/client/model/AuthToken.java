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
 * token issued by marketplace server
 */@ApiModel(description = "token issued by marketplace server")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-31T11:02:17.956+02:00")
public class AuthToken {
@SerializedName("token")
  private String token = null;
  @SerializedName("activated")
  private Boolean activated = null;
  @SerializedName("expiration_date")
  private String expirationDate = null;
  @SerializedName("app_id")
  private String appId = null;
  @SerializedName("user_id")
  private String userId = null;
  @SerializedName("ecosystem_user_id")
  private String ecosystemUserId = null;
  
  public AuthToken token(String token) {
    this.token = token;
    return this;
  }

  
  /**
  * Get token
  * @return token
  **/
  @ApiModelProperty(example = "AAAAA-RRRRRR-DDDDD-BBBBBB", required = true, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }
  
  public AuthToken activated(Boolean activated) {
    this.activated = activated;
    return this;
  }

  
  /**
  * Get activated
  * @return activated
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isActivated() {
    return activated;
  }
  public void setActivated(Boolean activated) {
    this.activated = activated;
  }
  
  public AuthToken expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  
  /**
  * Get expirationDate
  * @return expirationDate
  **/
  @ApiModelProperty(example = "2018-09-29T12:55:44Z", required = true, value = "")
  public String getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }
  
  public AuthToken appId(String appId) {
    this.appId = appId;
    return this;
  }

  
  /**
  * a 3 - 4 letter symbol identifying the app
  * @return appId
  **/
  @ApiModelProperty(example = "kik", required = true, value = "a 3 - 4 letter symbol identifying the app")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }
  
  public AuthToken userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  /**
  * the user_id from the digital service
  * @return userId
  **/
  @ApiModelProperty(example = "doody", required = true, value = "the user_id from the digital service")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  public AuthToken ecosystemUserId(String ecosystemUserId) {
    this.ecosystemUserId = ecosystemUserId;
    return this;
  }

  
  /**
  * the internal server user_id - it&#x27;s unique across all the digital services
  * @return ecosystemUserId
  **/
  @ApiModelProperty(example = "Usdefsdlfjksldjf", required = true, value = "the internal server user_id - it's unique across all the digital services")
  public String getEcosystemUserId() {
    return ecosystemUserId;
  }
  public void setEcosystemUserId(String ecosystemUserId) {
    this.ecosystemUserId = ecosystemUserId;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthToken authToken = (AuthToken) o;
    return Objects.equals(this.token, authToken.token) &&
        Objects.equals(this.activated, authToken.activated) &&
        Objects.equals(this.expirationDate, authToken.expirationDate) &&
        Objects.equals(this.appId, authToken.appId) &&
        Objects.equals(this.userId, authToken.userId) &&
        Objects.equals(this.ecosystemUserId, authToken.ecosystemUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, activated, expirationDate, appId, userId, ecosystemUserId);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthToken {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    ecosystemUserId: ").append(toIndentedString(ecosystemUserId)).append("\n");
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



