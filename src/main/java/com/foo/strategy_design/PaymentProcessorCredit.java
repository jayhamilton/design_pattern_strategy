package com.foo.strategy_design;

public class PaymentProcessorCredit extends PaymentProcessor{

    PaymentProcessorCredit(){

        this.iValidate = new StrategyValidateCVVImplementation();

    }

    String display(){

        return "Displaying credit payment information from concrete class.";

    }
}
