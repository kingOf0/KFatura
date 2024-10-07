package com.kingOf0.fatura;

public class Environment {

    private static final String PROD_BASE_URL = "https://earsivportal.efatura.gov.tr";
    private static final String TEST_BASE_URL = "https://earsivportaltest.efatura.gov.tr";
    private static final String LOGIN_PATH = "/earsiv-services/assos-login";
    private static final String COMMAND_PATH = "/earsiv-services/dispatch";
    private static final String DRAFT_INVOICE_COMMAND = "EARSIV_PORTAL_FATURA_OLUSTUR";
    private static final String DRAFT_INVOICE_PAGE_NAME = "RG_BASITFATURA";

    private static boolean TEST_MODE = false;

    public static String getBaseUrl() {
        return TEST_MODE ? TEST_BASE_URL : PROD_BASE_URL;
    }

    public static String getLoginCommand() {
        return TEST_MODE ? "login" : "anologin";
    }

    public static String getCreateDraftInvoiceCommand() {
        return DRAFT_INVOICE_COMMAND;
    }

    public static String getCreateDraftInvoicePageName() {
        return DRAFT_INVOICE_PAGE_NAME;
    }

    public static void enableTestMode() {
        TEST_MODE = true;
    }

    public static String getLoginPath() {
        return LOGIN_PATH;
    }

    public static String getCommandPath() {
        return COMMAND_PATH;
    }
}
