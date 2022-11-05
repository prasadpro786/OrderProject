package com.example.OrderDetails;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OrderDetails")
public class OrderDetails {

    @Id
    private String orderId;
    private String itemId;
    private String itemName;
    private String itemunitPrice;
    private String itemQuantity;

    public OrderDetails() {
        super();
    }

    public OrderDetails(String orderId, String itemId, String itemName, String itemunitPrice, String itemQuantity) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemunitPrice = itemunitPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemunitPrice() {
        return itemunitPrice;
    }

    public void setItemunitPrice(String itemunitPrice) {
        this.itemunitPrice = itemunitPrice;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId='" + orderId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemunitPrice='" + itemunitPrice + '\'' +
                ", itemQuantity='" + itemQuantity + '\'' +
                '}';
    }
}
