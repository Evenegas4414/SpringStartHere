package cl.exql.springhere14;

import cl.exql.springhere14.models.Account;
import cl.exql.springhere14.repositories.AccountRepository;
import cl.exql.springhere14.services.TransferService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TransferServiceUnitTest {

    @Test
    @DisplayName("Test the amount is transfered from one account to another if no exception occurs.")
    public void transferMoneySuccessful() {
        AccountRepository accountRepository = mock(AccountRepository.class);
        TransferService transferService = new TransferService(accountRepository);

        Account sender = new Account();
        sender.setId(1);
        sender.setName("Miles Good");
        sender.setAmount(new BigDecimal(1000));

        Account receiver = new Account();
        receiver.setId(2);
        receiver.setName("Siles Doog");
        receiver.setAmount(new BigDecimal(1200));

        given(accountRepository.findById(sender.getId())).willReturn(Optional.of(sender));
        given(accountRepository.findById(receiver.getId())).willReturn(Optional.of(receiver));

        transferService.transferMoney(sender.getId(), receiver.getId(), new BigDecimal(150));

        verify(accountRepository).changeAmount(1, new BigDecimal(850));
        verify(accountRepository).changeAmount(2, new BigDecimal(1350));
    }
}
