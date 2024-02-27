package org.example.beans;

import java.util.ArrayList;

public class Order {
    private Integer ID;
    private Integer ClientID;
    private String commentFromWriter; // for washing, packaging, transport;
    private String commentFromDeliver;
    private Integer OrderWriterID; // operator or delivery or worker
    private Integer OrderWroteTime;
    private Integer productReceiverID;
    private Integer productDeliverID;
    private String productReceivedTime;
    private String productDeliveredTime;
    private Integer discountPercent;
    private Double carpetPrice;
    private Double bigBlanketPrice;
    private Double smallBlanketPrice;
    Reject reject;
    private Boolean hasStain;
    private Boolean needDelivered;
    private Boolean inStorage;
    private Double totalPrice;
    private String paymentType;

}
