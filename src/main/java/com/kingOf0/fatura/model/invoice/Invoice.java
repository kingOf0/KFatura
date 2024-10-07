package com.kingOf0.fatura.model.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Invoice {

    private String faturaUuid;
    private String belgeNumarasi = "";
    private String faturaTarihi = "";
    private String saat = "";
    private String paraBirimi = "TRY";
    private String dovzTLkur = "0";
    private String faturaTipi = "SATIS";
    private String hangiTip = "5000/30000";
    private String vknTckn = "";
    private String aliciUnvan = "";
    private String aliciAdi = "";
    private String aliciSoyadi = "";
    private String binaAdi = "";
    private String binaNo = "";
    private String kapiNo = "";
    private String kasabaKoy = "";
    private String vergiDairesi = "";
    private String ulke = "Türkiye";
    private String bulvarcaddesokak = "";
    private String irsaliyeNumarasi = "";
    private String irsaliyeTarihi = "";
    private String mahalleSemtIlce = "";
    private String sehir = " ";
    private String postaKodu = "";
    private String tel = "";
    private String fax = "";
    private String eposta = "";
    private String websitesi = "";
    private List<Object> iadeTable = new ArrayList<>();
    private String vergiCesidi = " ";
    private List<InvoiceItem> malHizmetTable = new ArrayList<>();
    private String tip = "İskonto";
    private String matrah = "0";
    private String malhizmetToplamTutari = "0";
    private String toplamIskonto = "0";
    private String hesaplanankdv = "0";
    private String vergilerToplami = "0";
    private String vergilerDahilToplamTutar = "0";
    private String odenecekTutar = "0";
    private String not = "";
    private String siparisNumarasi = "";
    private String siparisTarihi = "";
    private String fisNo = "";
    private String fisTarihi = "";
    private String fisSaati = " ";
    private String fisTipi = " ";
    private String zRaporNo = "";
    private String okcSeriNo = "";

    public Invoice(UUID uuid) {
        this.faturaUuid = uuid.toString();
    }

    public Invoice() {
        this.faturaUuid = UUID.randomUUID().toString();
    }

    public void check() {
        if (faturaUuid == null) {
            throw new IllegalArgumentException("Fatura UUID boş olamaz");
        }
        if (faturaTarihi.isEmpty()) {
            throw new IllegalArgumentException("Fatura tarihi boş olamaz");
        }
        if (saat.isEmpty()) {
            throw new IllegalArgumentException("Saat boş olamaz");
        }
        if (vknTckn.isEmpty()) {
            throw new IllegalArgumentException("Vkn Tckn boş olamaz");
        }
        if (vknTckn.length() != 11 && vknTckn.length() != 10) {
            throw new IllegalArgumentException("Vkn Tckn 11 veya 10 haneli olmalıdır");
        }

    }

    public String getFaturaUuid() {
        return faturaUuid;
    }

    public void setFaturaUuid(String faturaUuid) {
        this.faturaUuid = faturaUuid;
    }

    public String getBelgeNumarasi() {
        return belgeNumarasi;
    }

    public void setBelgeNumarasi(String belgeNumarasi) {
        this.belgeNumarasi = belgeNumarasi;
    }

    public String getFaturaTarihi() {
        return faturaTarihi;
    }

    public void setFaturaTarihi(String faturaTarihi) {
        this.faturaTarihi = faturaTarihi;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        this.paraBirimi = paraBirimi;
    }

    public String getDovzTLkur() {
        return dovzTLkur;
    }

    public void setDovzTLkur(String dovzTLkur) {
        this.dovzTLkur = dovzTLkur;
    }

    public String getFaturaTipi() {
        return faturaTipi;
    }

    public void setFaturaTipi(String faturaTipi) {
        this.faturaTipi = faturaTipi;
    }

    public String getHangiTip() {
        return hangiTip;
    }

    public void setHangiTip(String hangiTip) {
        this.hangiTip = hangiTip;
    }

    public String getVknTckn() {
        return vknTckn;
    }

    public void setVknTckn(String vknTckn) {
        this.vknTckn = vknTckn;
    }

    public String getAliciUnvan() {
        return aliciUnvan;
    }

    public void setAliciUnvan(String aliciUnvan) {
        this.aliciUnvan = aliciUnvan;
    }

    public String getAliciAdi() {
        return aliciAdi;
    }

    public void setAliciAdi(String aliciAdi) {
        this.aliciAdi = aliciAdi;
    }

    public String getAliciSoyadi() {
        return aliciSoyadi;
    }

    public void setAliciSoyadi(String aliciSoyadi) {
        this.aliciSoyadi = aliciSoyadi;
    }

    public String getBinaAdi() {
        return binaAdi;
    }

    public void setBinaAdi(String binaAdi) {
        this.binaAdi = binaAdi;
    }

    public String getBinaNo() {
        return binaNo;
    }

    public void setBinaNo(String binaNo) {
        this.binaNo = binaNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public String getKasabaKoy() {
        return kasabaKoy;
    }

    public void setKasabaKoy(String kasabaKoy) {
        this.kasabaKoy = kasabaKoy;
    }

    public String getVergiDairesi() {
        return vergiDairesi;
    }

    public void setVergiDairesi(String vergiDairesi) {
        this.vergiDairesi = vergiDairesi;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getBulvarcaddesokak() {
        return bulvarcaddesokak;
    }

    public void setBulvarcaddesokak(String bulvarcaddesokak) {
        this.bulvarcaddesokak = bulvarcaddesokak;
    }

    public String getIrsaliyeNumarasi() {
        return irsaliyeNumarasi;
    }

    public void setIrsaliyeNumarasi(String irsaliyeNumarasi) {
        this.irsaliyeNumarasi = irsaliyeNumarasi;
    }

    public String getIrsaliyeTarihi() {
        return irsaliyeTarihi;
    }

    public void setIrsaliyeTarihi(String irsaliyeTarihi) {
        this.irsaliyeTarihi = irsaliyeTarihi;
    }

    public String getMahalleSemtIlce() {
        return mahalleSemtIlce;
    }

    public void setMahalleSemtIlce(String mahalleSemtIlce) {
        this.mahalleSemtIlce = mahalleSemtIlce;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(String postaKodu) {
        this.postaKodu = postaKodu;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getWebsitesi() {
        return websitesi;
    }

    public void setWebsitesi(String websitesi) {
        this.websitesi = websitesi;
    }

    public List<Object> getIadeTable() {
        return iadeTable;
    }

    public void setIadeTable(List<Object> iadeTable) {
        this.iadeTable = iadeTable;
    }

    public String getVergiCesidi() {
        return vergiCesidi;
    }

    public void setVergiCesidi(String vergiCesidi) {
        this.vergiCesidi = vergiCesidi;
    }

    public List<InvoiceItem> getMalHizmetTable() {
        return malHizmetTable;
    }

    public void setMalHizmetTable(List<InvoiceItem> malHizmetTable) {
        this.malHizmetTable = malHizmetTable;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getMatrah() {
        return matrah;
    }

    public void setMatrah(String matrah) {
        this.matrah = matrah;
    }

    public String getMalhizmetToplamTutari() {
        return malhizmetToplamTutari;
    }

    public void setMalhizmetToplamTutari(String malhizmetToplamTutari) {
        this.malhizmetToplamTutari = malhizmetToplamTutari;
    }

    public String getToplamIskonto() {
        return toplamIskonto;
    }

    public void setToplamIskonto(String toplamIskonto) {
        this.toplamIskonto = toplamIskonto;
    }

    public String getHesaplanankdv() {
        return hesaplanankdv;
    }

    public void setHesaplanankdv(String hesaplanankdv) {
        this.hesaplanankdv = hesaplanankdv;
    }

    public String getVergilerToplami() {
        return vergilerToplami;
    }

    public void setVergilerToplami(String vergilerToplami) {
        this.vergilerToplami = vergilerToplami;
    }

    public String getVergilerDahilToplamTutar() {
        return vergilerDahilToplamTutar;
    }

    public void setVergilerDahilToplamTutar(String vergilerDahilToplamTutar) {
        this.vergilerDahilToplamTutar = vergilerDahilToplamTutar;
    }

    public String getOdenecekTutar() {
        return odenecekTutar;
    }

    public void setOdenecekTutar(String odenecekTutar) {
        this.odenecekTutar = odenecekTutar;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public String getSiparisNumarasi() {
        return siparisNumarasi;
    }

    public void setSiparisNumarasi(String siparisNumarasi) {
        this.siparisNumarasi = siparisNumarasi;
    }

    public String getSiparisTarihi() {
        return siparisTarihi;
    }

    public void setSiparisTarihi(String siparisTarihi) {
        this.siparisTarihi = siparisTarihi;
    }

    public String getFisNo() {
        return fisNo;
    }

    public void setFisNo(String fisNo) {
        this.fisNo = fisNo;
    }

    public String getFisTarihi() {
        return fisTarihi;
    }

    public void setFisTarihi(String fisTarihi) {
        this.fisTarihi = fisTarihi;
    }

    public String getFisSaati() {
        return fisSaati;
    }

    public void setFisSaati(String fisSaati) {
        this.fisSaati = fisSaati;
    }

    public String getFisTipi() {
        return fisTipi;
    }

    public void setFisTipi(String fisTipi) {
        this.fisTipi = fisTipi;
    }

    public String getzRaporNo() {
        return zRaporNo;
    }

    public void setzRaporNo(String zRaporNo) {
        this.zRaporNo = zRaporNo;
    }

    public String getOkcSeriNo() {
        return okcSeriNo;
    }

    public void setOkcSeriNo(String okcSeriNo) {
        this.okcSeriNo = okcSeriNo;
    }
}