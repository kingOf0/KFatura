# KFatura
earsivportal için java API

## Örnek Kullanım

Basit bir fatura oluşturmak için aşağıdaki kodu inceleyebilirsiniz.

```java
String username = System.getenv("userid");
String password = System.getenv("password");

try {
    InvoiceService invoiceService = new InvoiceService();

    String token = invoiceService.getToken(username, password);

    BasicInvoice basicInvoice = new BasicInvoice(
            new Date(),
            "11111111111",
            "İsim",
            "Soyisim",
            List.of(new BasicInvoiceItem("Elma", 1, "ADET", 50.0, 20.0))
    );

    Invoice invoice = BasicInvoiceService.createBasicInvoice(basicInvoice);
    HttpUtils.Response response = invoiceService.createDraftInvoiceCommand(token, invoice);

} catch (Exception e) {
    e.printStackTrace();
}
```

Detaylı faturalar oluşturmak için Invoice sınıfını kendiniz instantiate edebilirsiniz.
