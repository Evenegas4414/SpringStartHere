package cl.exql.springhere10.services;

import cl.exql.springhere10.exceptions.NotEnoughMoneyException;
import cl.exql.springhere10.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
