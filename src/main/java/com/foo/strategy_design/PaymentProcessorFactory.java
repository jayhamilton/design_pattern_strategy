package com.foo.strategy_design;

public class PaymentProcessorFactory {

    static PaymentProcessor getPaymentProcessor(String type){

        PaymentProcessor paymentProcessor = null;

        switch (type) {

            case "credit":
                paymentProcessor = new PaymentProcessorCredit();
                break;
            case "paypal":
                paymentProcessor = new PaymentProcessorPaypal();
                break;
            default: {
            }

        }


        return paymentProcessor;

    }
    
}
