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
 * Sign in data for JWT sign in type
 */@ApiModel(description = "Sign in data for JWT sign in type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-06-12T15:56:08.924+03:00")
public class JWTSignInData {
@SerializedName("device_id")
  private String deviceId = null;
  @SerializedName("wallet_address")
  private String walletAddress = null;
  
    /**
   * Gets or Sets signInType
   */
  @JsonAdapter(SignInTypeEnum.Adapter.class)
  public enum SignInTypeEnum {
    
    JWT("jwt"),
    WHITELIST("whitelist");

    private String value;

    SignInTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static SignInTypeEnum fromValue(String text) {
      for (SignInTypeEnum b : SignInTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<SignInTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignInTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignInTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SignInTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("sign_in_type")
  private SignInTypeEnum signInType = null;
  @SerializedName("jwt")
  private String jwt = null;
  
  public JWTSignInData deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  
  /**
  * Get deviceId
  * @return deviceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }
  
  public JWTSignInData walletAddress(String walletAddress) {
    this.walletAddress = walletAddress;
    return this;
  }

  
  /**
  * The address where earned funds will go to
  * @return walletAddress
  **/
  @ApiModelProperty(required = true, value = "The address where earned funds will go to")
  public String getWalletAddress() {
    return walletAddress;
  }
  public void setWalletAddress(String walletAddress) {
    this.walletAddress = walletAddress;
  }
  
  public JWTSignInData signInType(SignInTypeEnum signInType) {
    this.signInType = signInType;
    return this;
  }

  
  /**
  * Get signInType
  * @return signInType
  **/
  @ApiModelProperty(required = true, value = "")
  public SignInTypeEnum getSignInType() {
    return signInType;
  }
  public void setSignInType(SignInTypeEnum signInType) {
    this.signInType = signInType;
  }
  
  public JWTSignInData jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }

  
  /**
  * see JWTBodyRegister
  * @return jwt
  **/
  @ApiModelProperty(example = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0aW1lc3RhbXAiOjEyMzQ1Njc4OTAsInVzZXJfaWQiOiJ1c2VyOjEyMzQiLCJhcHBfaWQiOiJhcHA6a2lrIn0.ywXZUlH2fSTxIk8V2egE9WkyJ4a9UOsAZqFN5G7o84al_utwmMA-HKSSM0-2EDtaZ2lM4FUIs0Byd0KO2HxglxrHL_grFHW_wFtnjcNrNxCsGKIXEpGowudQDuAh_ycY2EZ_JKhNY4ZPrTx69ImmeYvDkN3PvYV6_uSYQSMy6H0", required = true, value = "see JWTBodyRegister")
  public String getJwt() {
    return jwt;
  }
  public void setJwt(String jwt) {
    this.jwt = jwt;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTSignInData jwTSignInData = (JWTSignInData) o;
    return Objects.equals(this.deviceId, jwTSignInData.deviceId) &&
        Objects.equals(this.walletAddress, jwTSignInData.walletAddress) &&
        Objects.equals(this.signInType, jwTSignInData.signInType) &&
        Objects.equals(this.jwt, jwTSignInData.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, walletAddress, signInType, jwt);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTSignInData {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    walletAddress: ").append(toIndentedString(walletAddress)).append("\n");
    sb.append("    signInType: ").append(toIndentedString(signInType)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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



