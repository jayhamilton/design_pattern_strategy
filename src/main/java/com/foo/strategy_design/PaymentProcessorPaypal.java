package com.foo.strategy_design;

public class PaymentProcessorPaypal extends PaymentProcessor {
    
    PaymentProcessorPaypal(){

        this.iValidate = new StrategyValidateNoImplementation();

    }

    String display(){
        
        return "Displaying paypal information from concrete class";
    
    }
    
}
