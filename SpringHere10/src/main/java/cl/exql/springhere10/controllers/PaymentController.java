package cl.exql.springhere10.controllers;

import cl.exql.springhere10.exceptions.NotEnoughMoneyException;
import cl.exql.springhere10.models.ErrorDetails;
import cl.exql.springhere10.models.PaymentDetails;
import cl.exql.springhere10.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        try {
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        } catch (NotEnoughMoneyException e) {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make the payment.");
            return ResponseEntity.badRequest().body(errorDetails);
        }
    }
}
