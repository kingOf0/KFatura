package com.kingOf0.fatura.model.basic;

public class BasicInvoiceItem {

    private final String name;
    private final Integer quantity;
    private final String unit;
    private final Double unitPrice;
    private final Integer taxRate; //20

    public BasicInvoiceItem(String name, Integer quantity, String unit, Double unitPrice, Integer taxRate) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

}
