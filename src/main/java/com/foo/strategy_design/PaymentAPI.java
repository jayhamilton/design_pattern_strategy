package com.foo.strategy_design;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentAPI {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/payment")
    String payment(@RequestParam String type) {

       return paymentService.process(type);

    }

}
