package com.kingOf0.fatura.model.invoice;

public class InvoiceItem {

    private String malHizmet = "";
    private String miktar = "1";
    private String birim = "ADET";
    private String birimFiyat = "1";
    private String fiyat = "1";
    private String iskontoOrani = "0";
    private String iskontoTutari = "0";
    private String iskontoNedeni = "";
    private String malHizmetTutari = "1";
    private String vergiOrani = "0";
    private String kdvOrani = "20";
    private String kdvTutari = "0";
    private String vergininKdvTutari = "0";
    private String ozelMatrahTutari = "0";
    private String hesaplananotvtevkifatakatkisi = "0";

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getMalHizmet() {
        return malHizmet;
    }

    public void setMalHizmet(String malHizmet) {
        this.malHizmet = malHizmet;
    }

    public String getMiktar() {
        return miktar;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(String birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public String getIskontoOrani() {
        return iskontoOrani;
    }

    public void setIskontoOrani(String iskontoOrani) {
        this.iskontoOrani = iskontoOrani;
    }

    public String getIskontoTutari() {
        return iskontoTutari;
    }

    public void setIskontoTutari(String iskontoTutari) {
        this.iskontoTutari = iskontoTutari;
    }

    public String getIskontoNedeni() {
        return iskontoNedeni;
    }

    public void setIskontoNedeni(String iskontoNedeni) {
        this.iskontoNedeni = iskontoNedeni;
    }

    public String getMalHizmetTutari() {
        return malHizmetTutari;
    }

    public void setMalHizmetTutari(String malHizmetTutari) {
        this.malHizmetTutari = malHizmetTutari;
    }

    public String getVergiOrani() {
        return vergiOrani;
    }

    public void setVergiOrani(String vergiOrani) {
        this.vergiOrani = vergiOrani;
    }

    public String getKdvTutari() {
        return kdvTutari;
    }

    public String getKdvOrani() {
        return kdvOrani;
    }

    public void setKdvOrani(String kdvOrani) {
        this.kdvOrani = kdvOrani;
    }

    public void setKdvTutari(String kdvTutari) {
        this.kdvTutari = kdvTutari;
    }

    public String getVergininKdvTutari() {
        return vergininKdvTutari;
    }

    public void setVergininKdvTutari(String vergininKdvTutari) {
        this.vergininKdvTutari = vergininKdvTutari;
    }

    public String getOzelMatrahTutari() {
        return ozelMatrahTutari;
    }

    public void setOzelMatrahTutari(String ozelMatrahTutari) {
        this.ozelMatrahTutari = ozelMatrahTutari;
    }

    public String getHesaplananotvtevkifatakatkisi() {
        return hesaplananotvtevkifatakatkisi;
    }

    public void setHesaplananotvtevkifatakatkisi(String hesaplananotvtevkifatakatkisi) {
        this.hesaplananotvtevkifatakatkisi = hesaplananotvtevkifatakatkisi;
    }
}