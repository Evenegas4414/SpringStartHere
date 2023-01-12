package com.example.springherech11openfeign.proxies;

import com.example.springherech11openfeign.models.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments", url = "${name.service.url}")
public interface PaymentsProxy {

    @PostMapping("/payment")
    Payment createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment
    );
}
