package org.example.beans;

import java.util.ArrayList;

public class Order {
    private Integer ID;
    private String comment; // for washing, packaging, transport;
    private String receiver; // operator or delivery or worker
    private Double discountPercent;
    private Double priceCarpet;
    private Double bigBlanketPrice;
    private Double smallBlanketPrice;
    ArrayList<Carpet> carpets = new ArrayList<>();
    ArrayList<BigBlanket> bigBlankets = new ArrayList<>();
    ArrayList<BigBlanket> smallBlankets = new ArrayList<>();

}
