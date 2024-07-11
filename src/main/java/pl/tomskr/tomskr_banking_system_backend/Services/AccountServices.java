package pl.tomskr.tomskr_banking_system_backend.Services;

import org.springframework.stereotype.Service;

@Service
public class AccountServices {

    private final AccountRepository accountRepository;

    AccountServices(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    //todo create account
     public Account createAccount(Account account){
        return accountRepository.save(account);
     }

    //todo display account

    //todo make deposit

    //todo make withdraw
}
