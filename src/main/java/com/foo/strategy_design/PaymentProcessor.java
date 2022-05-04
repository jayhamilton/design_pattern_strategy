package com.foo.strategy_design;

abstract public class PaymentProcessor {

    IStrategyValidate iValidate;
    
    abstract String display();

    String validate() {
        return this.iValidate.validate();
    }

    String printReciept() {

        return "Printing payment reciept";
    }

    void setValidationStrategy( IStrategyValidate iValidationStrategyImplementation){

        this.iValidate = iValidationStrategyImplementation;

    }
}
