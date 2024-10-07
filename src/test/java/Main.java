import com.kingOf0.fatura.model.basic.BasicInvoice;
import com.kingOf0.fatura.model.basic.BasicInvoiceItem;
import com.kingOf0.fatura.model.invoice.Invoice;
import com.kingOf0.fatura.service.BasicInvoiceService;
import com.kingOf0.fatura.service.InvoiceService;
import com.kingOf0.fatura.utils.HttpUtils;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String username = System.getenv("userid");
        String password = System.getenv("password");

        try {
            InvoiceService invoiceService = new InvoiceService();

            String token = invoiceService.getToken(username, password);

            BasicInvoice basicInvoice = new BasicInvoice(
                    new java.util.Date(),
                    "12345678901",
                    "Test Name",
                    "Test Surname",
                    Arrays.asList(new BasicInvoiceItem("Elma", 1, "ADET", 50.0, 20.0))
            );

            Invoice invoice = BasicInvoiceService.createBasicInvoice(basicInvoice);
            HttpUtils.Response draftInvoiceCommand = invoiceService.createDraftInvoiceCommand(token, invoice);
            System.out.println("Draft Invoice Command: " + draftInvoiceCommand.getContent());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
