package cl.exql.springhere10.controllers;

import cl.exql.springhere10.exceptions.NotEnoughMoneyException;
import cl.exql.springhere10.models.ErrorDetails;
import cl.exql.springhere10.models.PaymentDetails;
import cl.exql.springhere10.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class Payment2Controller {

    private final PaymentService paymentService;

    public Payment2Controller(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment2")
    public ResponseEntity<?> makePayment() {
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
    }
}
