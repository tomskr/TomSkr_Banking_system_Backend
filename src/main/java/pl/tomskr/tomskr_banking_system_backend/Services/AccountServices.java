package pl.tomskr.tomskr_banking_system_backend.Services;

import org.springframework.stereotype.Service;
import pl.tomskr.tomskr_banking_system_backend.Domain.Account;
import pl.tomskr.tomskr_banking_system_backend.Repositories.AccountRepository;

import java.util.Optional;

@Service
public class AccountServices {

    private final AccountRepository accountRepository;

    AccountServices(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }


     public Account createAccount(Account account){
        return accountRepository.save(account);
     }


    public Optional<Account> getAccount(Long id){
        return accountRepository.findById(id);
    }


    public Account makeDeposit(Double deposit, Long id){
        Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
        account.setBalance(account.getBalance() + deposit);
        return accountRepository.save(account);

    } 


    public Account makeWithdraw(Double withdraw, Long id){
        Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
        if (account.getBalance() < withdraw) {
            throw new RuntimeException("Insufficient funds");
        }
        account.setBalance(account.getBalance() - withdraw);
        return accountRepository.save(account);
    }
}
