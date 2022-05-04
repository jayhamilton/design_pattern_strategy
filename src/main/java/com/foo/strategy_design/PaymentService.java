package com.foo.strategy_design;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    String process(String type){


        PaymentProcessor paymentProcessor = PaymentProcessorFactory.getPaymentProcessor(type);


        paymentProcessor.setValidationStrategy(new StrategyValidateCVVImplementation());

        return paymentProcessor.display() + "<br>" +
                paymentProcessor.validate() + "<br>" +
                paymentProcessor.printReciept();
    }

    
}
