package com.foo.strategy_design;

public class StrategyValidateNoImplementation implements IStrategyValidate{

    public String validate(){
        return "Currently don't do validation!";
    }
    
}
