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
import io.swagger.client.model.JWTBodyPaymentConfirmationPayment;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * JWTBodyPaymentConfirmation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-31T11:02:17.956+02:00")
public class JWTBodyPaymentConfirmation {
@SerializedName("iat")
  private BigDecimal iat = null;
  @SerializedName("iss")
  private String iss = null;
  @SerializedName("exp")
  private BigDecimal exp = null;
  
    /**
   * subject
   */
  @JsonAdapter(SubEnum.Adapter.class)
  public enum SubEnum {
    
    REGISTER("register"),
    SPEND("spend"),
    EARN("earn"),
    PAY_TO_USER("pay_to_user"),
    PAYMENT_CONFIRMATION("payment_confirmation");

    private String value;

    SubEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static SubEnum fromValue(String text) {
      for (SubEnum b : SubEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<SubEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("sub")
  private SubEnum sub = null;
  @SerializedName("offer_id")
  private String offerId = null;
  @SerializedName("sender_user_id")
  private String senderUserId = null;
  @SerializedName("recipient_user_id")
  private String recipientUserId = null;
  @SerializedName("payment")
  private JWTBodyPaymentConfirmationPayment payment = null;
  
  public JWTBodyPaymentConfirmation iat(BigDecimal iat) {
    this.iat = iat;
    return this;
  }

  
  /**
  * issued at - seconds from epoc
  * @return iat
  **/
  @ApiModelProperty(required = true, value = "issued at - seconds from epoc")
  public BigDecimal getIat() {
    return iat;
  }
  public void setIat(BigDecimal iat) {
    this.iat = iat;
  }
  
  public JWTBodyPaymentConfirmation iss(String iss) {
    this.iss = iss;
    return this;
  }

  
  /**
  * issuer name, the same as app_id (kik)
  * @return iss
  **/
  @ApiModelProperty(required = true, value = "issuer name, the same as app_id (kik)")
  public String getIss() {
    return iss;
  }
  public void setIss(String iss) {
    this.iss = iss;
  }
  
  public JWTBodyPaymentConfirmation exp(BigDecimal exp) {
    this.exp = exp;
    return this;
  }

  
  /**
  * expiration - seconds from epoc
  * @return exp
  **/
  @ApiModelProperty(required = true, value = "expiration - seconds from epoc")
  public BigDecimal getExp() {
    return exp;
  }
  public void setExp(BigDecimal exp) {
    this.exp = exp;
  }
  
  public JWTBodyPaymentConfirmation sub(SubEnum sub) {
    this.sub = sub;
    return this;
  }

  
  /**
  * subject
  * @return sub
  **/
  @ApiModelProperty(required = true, value = "subject")
  public SubEnum getSub() {
    return sub;
  }
  public void setSub(SubEnum sub) {
    this.sub = sub;
  }
  
  public JWTBodyPaymentConfirmation offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  /**
  * offer id - id is decided by digital service
  * @return offerId
  **/
  @ApiModelProperty(required = true, value = "offer id - id is decided by digital service")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }
  
  public JWTBodyPaymentConfirmation senderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
    return this;
  }

  
  /**
  * user identifier - same value as given by register
  * @return senderUserId
  **/
  @ApiModelProperty(value = "user identifier - same value as given by register")
  public String getSenderUserId() {
    return senderUserId;
  }
  public void setSenderUserId(String senderUserId) {
    this.senderUserId = senderUserId;
  }
  
  public JWTBodyPaymentConfirmation recipientUserId(String recipientUserId) {
    this.recipientUserId = recipientUserId;
    return this;
  }

  
  /**
  * user identifier - same value as given by register
  * @return recipientUserId
  **/
  @ApiModelProperty(value = "user identifier - same value as given by register")
  public String getRecipientUserId() {
    return recipientUserId;
  }
  public void setRecipientUserId(String recipientUserId) {
    this.recipientUserId = recipientUserId;
  }
  
  public JWTBodyPaymentConfirmation payment(JWTBodyPaymentConfirmationPayment payment) {
    this.payment = payment;
    return this;
  }

  
  /**
  * Get payment
  * @return payment
  **/
  @ApiModelProperty(required = true, value = "")
  public JWTBodyPaymentConfirmationPayment getPayment() {
    return payment;
  }
  public void setPayment(JWTBodyPaymentConfirmationPayment payment) {
    this.payment = payment;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTBodyPaymentConfirmation jwTBodyPaymentConfirmation = (JWTBodyPaymentConfirmation) o;
    return Objects.equals(this.iat, jwTBodyPaymentConfirmation.iat) &&
        Objects.equals(this.iss, jwTBodyPaymentConfirmation.iss) &&
        Objects.equals(this.exp, jwTBodyPaymentConfirmation.exp) &&
        Objects.equals(this.sub, jwTBodyPaymentConfirmation.sub) &&
        Objects.equals(this.offerId, jwTBodyPaymentConfirmation.offerId) &&
        Objects.equals(this.senderUserId, jwTBodyPaymentConfirmation.senderUserId) &&
        Objects.equals(this.recipientUserId, jwTBodyPaymentConfirmation.recipientUserId) &&
        Objects.equals(this.payment, jwTBodyPaymentConfirmation.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iat, iss, exp, sub, offerId, senderUserId, recipientUserId, payment);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTBodyPaymentConfirmation {\n");
    
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
    sb.append("    recipientUserId: ").append(toIndentedString(recipientUserId)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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



