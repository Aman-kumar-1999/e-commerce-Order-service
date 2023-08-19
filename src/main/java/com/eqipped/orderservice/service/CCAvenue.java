package com.eqipped.orderservice.service;

import com.eqipped.orderservice.helper.CCAvenuePaymentRequest;

public interface CCAvenue {

    public String ccavenuePaymentGateway(CCAvenuePaymentRequest ccAvenuePaymentRequest);

}
