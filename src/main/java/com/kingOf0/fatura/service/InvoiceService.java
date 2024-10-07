package com.kingOf0.fatura.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingOf0.fatura.Environment;
import com.kingOf0.fatura.model.invoice.Invoice;
import com.kingOf0.fatura.utils.HttpUtils;
import com.kingOf0.fatura.utils.Utils;

import java.io.IOException;

public class InvoiceService {

    public static final ObjectMapper objectMapper = new ObjectMapper();

    public String getToken(String userName, String password) throws IOException {
        String body = String.format("assoscmd=%s&rtype=json&userid=%s&sifre=%s&sifre2=%s&parola=1", Environment.getLoginCommand(), userName, password, password);

        HttpUtils.Response response = HttpUtils.postRequest(Environment.getBaseUrl() + Environment.getLoginPath(), body);
        JsonNode jsonNode = objectMapper.readTree(response.getContent());
        return jsonNode.get("token").asText();
    }

    public HttpUtils.Response createDraftInvoiceCommand(String token, Invoice invoice) {
        String payload;
        try {
            payload = Utils.encode(invoice);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return createCommand(token, Environment.getCreateDraftInvoiceCommand(), Environment.getCreateDraftInvoicePageName(), payload);
    }

    private HttpUtils.Response createCommand(String token, String cmd, String pageName, String payload) {
        String body = String.format("cmd=%s&callid=%s&pageName=%s&token=%s&jp=%s", cmd, Utils.generateUUID(), pageName, token, payload);

        return HttpUtils.postRequest(Environment.getBaseUrl() + Environment.getCommandPath(), body);
    }

}
