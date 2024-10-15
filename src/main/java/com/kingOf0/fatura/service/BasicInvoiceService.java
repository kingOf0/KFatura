package com.kingOf0.fatura.service;

import com.kingOf0.fatura.model.basic.BasicInvoice;
import com.kingOf0.fatura.model.basic.BasicInvoiceItem;
import com.kingOf0.fatura.model.invoice.Invoice;
import com.kingOf0.fatura.model.invoice.InvoiceItem;

import java.text.SimpleDateFormat;

public class BasicInvoiceService {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("HH:mm:ss");

    public static Invoice createBasicInvoice(BasicInvoice basicInvoice) {
        Invoice invoice = new Invoice();

        invoice.setFaturaTarihi(simpleDateFormat.format(basicInvoice.getDate()));
        invoice.setSaat(simpleTimeFormat.format(basicInvoice.getDate()));

        invoice.setVknTckn(basicInvoice.getVkntckn());
        invoice.setAliciAdi(basicInvoice.getName());
        invoice.setAliciSoyadi(basicInvoice.getSurname());

        double sum = 0.0;
        double taxSum = 0.0;
        for (BasicInvoiceItem item : basicInvoice.getItems()) {
            invoice.getMalHizmetTable().add(getInvoiceItem(item));

            double v = item.getQuantity() * item.getUnitPrice();
            sum += v;
            taxSum += v * item.getTaxRate() / 100;
        }
        double finalSum = sum + taxSum;

        invoice.setMalhizmetToplamTutari(String.valueOf(sum));
        invoice.setHesaplanankdv(String.valueOf(taxSum));
        invoice.setOdenecekTutar(String.valueOf(finalSum));
        return invoice;
    }

    private static InvoiceItem getInvoiceItem(BasicInvoiceItem item) {
        InvoiceItem invoiceItem = new InvoiceItem();

        invoiceItem.setMalHizmet(item.getName());
        invoiceItem.setMiktar(item.getQuantity().toString());
        invoiceItem.setBirim(item.getUnit());
        invoiceItem.setBirimFiyat(item.getUnitPrice().toString());
        invoiceItem.setMalHizmetTutari(String.valueOf(item.getQuantity() * item.getUnitPrice()));

        double d = item.getQuantity() * item.getUnitPrice();
        invoiceItem.setFiyat(String.valueOf(d));

        invoiceItem.setKdvOrani(item.getTaxRate().toString());
        invoiceItem.setKdvTutari(String.valueOf(d * item.getTaxRate() / 100));

        return invoiceItem;
    }

}
