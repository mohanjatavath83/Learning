package com.learning.string;

import java.util.regex.Pattern;


class BuyerModel
{
    private String businessName;

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}
public class RegExpression {


    private static final String INVALID_NAME_REGEX = "[^A-Za-z0-9&'\",@._$!#\\-\\/ ]";

    private static final String INVALID_NAME_REGEX2 = "[^A-Za-z0-9 ]";
    private static  int BUSINESS_MAX_LENGTH = 50;


    public static void main(String[] args) {


        System.out.println( !"Sole Proprietorship".trim().toLowerCase().contains("Proprietorship".toLowerCase()));


        BuyerModel buyerModel = new BuyerModel();
        buyerModel.setBusinessName("ऊ (oo). ऋ (ri) UNITED TELELINKS  ओ (o) ; औ (ao). अं (am). अः (a:) क (k). ख (BANGALORE) % **** + *** LIMITED MOHAN MOHAN MOHAN MOHAN MOHAN MOAN MOHAN MOHAN MOHAN");
        String businessLegalName = buyerModel.getBusinessName() != null ? buyerModel.getBusinessName().replaceAll(INVALID_NAME_REGEX, "") : "";
        businessLegalName = businessLegalName.length() > BUSINESS_MAX_LENGTH ? businessLegalName.substring(0, BUSINESS_MAX_LENGTH) : businessLegalName;

        System.out.println(businessLegalName);


    }
}


