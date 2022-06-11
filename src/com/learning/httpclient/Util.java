package com.learning.httpclient;

public class Util {



    public static String getOnboardData()
    {
        String payload = "{\n" +
                "    \"Vendor\": {\n" +
                "        \"header\": {\n" +
                "            \"actionType\": \"ADD\",\n" +
                "            \"Correlationid\": \"ebde06c2-d451-4108-be05-55e1ea182c70\"\n" +
                "        },\n" +
                "        \"body\": {\n" +
                "            \"MerchantId\": \"100009200092229\",\n" +
                "            \"TerminalId\": \"10272601\",\n" +
                "            \"MerchantStatus\": \"S\",\n" +
                "            \"MerchantEntityLevel\": \"8\",\n" +
                "            \"SuperMerchantId\": \"100009200092229\",\n" +
                "            \"BusinessName\": \"Trading CO\",\n" +
                "            \"ContactPersonName\": \"Trading CO\",\n" +
                "            \"MobileNumber\": \"+919200092229\",\n" +
                "            \"IsKYCCompleted\": true,\n" +
                "            \"GstNumber\": \"27AOLCT5252W1Y8\",\n" +
                "            \"StoreAddress\": {\n" +
                "                \"Addressline1\": \"5 KATGARA HOUSE\",\n" +
                "                \"Addressline2\": \"4TH FLOOR 15, S V S Marg\",\n" +
                "                \"Addressline3\": \"DADAR\",\n" +
                "                \"City\": \"Mumbai\",\n" +
                "                \"State\": \"MH\",\n" +
                "                \"Pincode\": \"400028\"\n" +
                "            },\n" +
                "            \"SetupLevel\": \"1\",\n" +
                "            \"onboardingworkitemstatus\": \"3\",\n" +
                "            \"AccountDetails\": {\n" +
                "                \"AccountNumber\": null,\n" +
                "                \"IfscCode\": null,\n" +
                "                \"BeneName\": null\n" +
                "            },\n" +
                "            \"documents\": {\n" +
                "                \"document\": [\n" +
                "                    {\n" +
                "                        \"documentType\": \"POI\",\n" +
                "                        \"documentNumber\": null,\n" +
                "                        \"documentName\": \"Z00005\",\n" +
                "                        \"documentExpiryDate\": null,\n" +
                "                        \"documentStatus\": null\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"documentType\": \"POI\",\n" +
                "                        \"documentNumber\": null,\n" +
                "                        \"documentName\": \"Z00005\",\n" +
                "                        \"documentExpiryDate\": null,\n" +
                "                        \"documentStatus\": null\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"documentType\": \"POI\",\n" +
                "                        \"documentNumber\": null,\n" +
                "                        \"documentName\": \"Z00005\",\n" +
                "                        \"documentExpiryDate\": null,\n" +
                "                        \"documentStatus\": null\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"documentType\": \"POI\",\n" +
                "                        \"documentNumber\": null,\n" +
                "                        \"documentName\": \"Z00005\",\n" +
                "                        \"documentExpiryDate\": null,\n" +
                "                        \"documentStatus\": null\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";



        return payload;
    }
}
