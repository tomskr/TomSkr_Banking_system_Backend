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
    public Optional<Account> displayAccount(Long id){
        return accountRepository = accountRepository.getReferanceById(id)
    }

    //todo make deposit
    public Optional<Account> makeDeposit(Double deposit, Long id){
        Account account = accountRepository.getReferanceById(id);
        //todo make deposit
        return account;

    } 

    //todo make withdraw
    public Optional<account> makeWithdraw(Double withdraw, Long id){
        Account account = accountRepository.getReferanceById(id);
        //todo make withdraw 
        return account;
    }
}
