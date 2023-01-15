package cl.exql.springhere14.controllers;

import cl.exql.springhere14.dto.TransferRequest;
import cl.exql.springhere14.models.Account;
import cl.exql.springhere14.services.TransferService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest transferRequest) {
        transferService.transferMoney(transferRequest.getSenderAccountId(),
                transferRequest.getReceiverAccountId(),
                transferRequest.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam(required = false) String name) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name);
        }
    }
}
