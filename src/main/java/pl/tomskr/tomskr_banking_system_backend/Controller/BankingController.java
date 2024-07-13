package pl.tomskr.tomskr_banking_system_backend.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomskr.tomskr_banking_system_backend.Domain.Account;
import pl.tomskr.tomskr_banking_system_backend.Services.AccountServices;

@RestController
public class BankingController {
    private final AccountServices accountServices;

    public BankingController(AccountServices accountServices){
        this.accountServices = accountServices;
    }

    //todo: Display account

    //todo: Create account
    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account newAccount){
        Account saveAccount = accountServices.createAccount(newAccount);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveAccount);
    }
    //todo: Make Deposit

    //todo: Make withdraw

}
