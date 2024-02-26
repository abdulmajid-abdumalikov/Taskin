package org.example.beans;

import java.util.ArrayList;

public class Order {
    private Integer ID;
    private String commentFromReceiver; // for washing, packaging, transport;
    private String commentFromDeliver;
    private Integer OrderWriterID; // operator or delivery or worker
    private Integer OrderWroteTime;
    private Integer productReceiverID;
    private Integer productDeliverID;
    private String productReceivedTime;
    private String productDeliveredTime;
    private Integer discountPercent;
    private Double priceCarpet;
    private Double bigBlanketPrice;
    private Double smallBlanketPrice;
    ArrayList<Carpet> carpets = new ArrayList<>();
    ArrayList<BigBlanket> bigBlankets = new ArrayList<>();
    ArrayList<BigBlanket> smallBlankets = new ArrayList<>();
    private Boolean hasStain;
    private Boolean needDelivered;

}
