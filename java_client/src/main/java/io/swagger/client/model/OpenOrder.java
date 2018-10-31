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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-31T11:02:17.956+02:00")
public class OpenOrder {
@SerializedName("id")
  private String id = null;
  @SerializedName("offer_id")
  private String offerId = null;
  
    /**
   * Gets or Sets offerType
   */
  @JsonAdapter(OfferTypeEnum.Adapter.class)
  public enum OfferTypeEnum {
    
    EARN("earn"),
    SPEND("spend");

    private String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static OfferTypeEnum fromValue(String text) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<OfferTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OfferTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("offer_type")
  private OfferTypeEnum offerType = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("blockchain_data")
  private BlockchainData blockchainData = null;
  
    /**
   * the origin of the order
   */
  @JsonAdapter(OriginEnum.Adapter.class)
  public enum OriginEnum {
    
    MARKETPLACE("marketplace"),
    EXTERNAL("external");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static OriginEnum fromValue(String text) {
      for (OriginEnum b : OriginEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OriginEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("origin")
  private OriginEnum origin = null;
  @SerializedName("expiration_date")
  private String expirationDate = null;
  
  public OpenOrder id(String id) {
    this.id = id;
    return this;
  }

  
  /**
  * unique identifier of this item
  * @return id
  **/
  @ApiModelProperty(required = true, value = "unique identifier of this item")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  public OpenOrder offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  /**
  * the offer which this order was created from
  * @return offerId
  **/
  @ApiModelProperty(required = true, value = "the offer which this order was created from")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }
  
  public OpenOrder offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

  
  /**
  * Get offerType
  * @return offerType
  **/
  @ApiModelProperty(required = true, value = "")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }
  
  public OpenOrder title(String title) {
    this.title = title;
    return this;
  }

  
  /**
  * usually a brand name
  * @return title
  **/
  @ApiModelProperty(example = "Spotify", required = true, value = "usually a brand name")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  
  public OpenOrder description(String description) {
    this.description = description;
    return this;
  }

  
  /**
  * Get description
  * @return description
  **/
  @ApiModelProperty(example = "completed poll", required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public OpenOrder amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * kin amount
  * @return amount
  **/
  @ApiModelProperty(required = true, value = "kin amount")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  
  public OpenOrder blockchainData(BlockchainData blockchainData) {
    this.blockchainData = blockchainData;
    return this;
  }

  
  /**
  * Get blockchainData
  * @return blockchainData
  **/
  @ApiModelProperty(required = true, value = "")
  public BlockchainData getBlockchainData() {
    return blockchainData;
  }
  public void setBlockchainData(BlockchainData blockchainData) {
    this.blockchainData = blockchainData;
  }
  
  public OpenOrder origin(OriginEnum origin) {
    this.origin = origin;
    return this;
  }

  
  /**
  * the origin of the order
  * @return origin
  **/
  @ApiModelProperty(required = true, value = "the origin of the order")
  public OriginEnum getOrigin() {
    return origin;
  }
  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }
  
  public OpenOrder expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  
  /**
  * Get expirationDate
  * @return expirationDate
  **/
  @ApiModelProperty(example = "2018-08-09T11:25:33Z", required = true, value = "")
  public String getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
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
        Objects.equals(this.offerId, openOrder.offerId) &&
        Objects.equals(this.offerType, openOrder.offerType) &&
        Objects.equals(this.title, openOrder.title) &&
        Objects.equals(this.description, openOrder.description) &&
        Objects.equals(this.amount, openOrder.amount) &&
        Objects.equals(this.blockchainData, openOrder.blockchainData) &&
        Objects.equals(this.origin, openOrder.origin) &&
        Objects.equals(this.expirationDate, openOrder.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offerId, offerType, title, description, amount, blockchainData, origin, expirationDate);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    blockchainData: ").append(toIndentedString(blockchainData)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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



