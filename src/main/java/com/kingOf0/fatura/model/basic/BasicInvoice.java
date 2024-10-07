package com.kingOf0.fatura.model.basic;

import java.util.Date;
import java.util.List;

public class BasicInvoice {

    private final Date date;
    private final String vkntckn;
    private final String name;
    private final String surname;
    private final List<BasicInvoiceItem> items;

    public BasicInvoice(Date date, String vkntckn, String name, String surname, List<BasicInvoiceItem> items) {
        this.date = date;
        this.vkntckn = vkntckn;
        this.name = name;
        this.surname = surname;
        this.items = items;
    }

    public List<BasicInvoiceItem> getItems() {
        return items;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getVkntckn() {
        return vkntckn;
    }


}
