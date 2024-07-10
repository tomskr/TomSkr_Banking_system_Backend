package pl.tomskr.tomskr_banking_system_backend.Controller;

import org.springframework.web.bind.annotation.RestController;
import pl.tomskr.tomskr_banking_system_backend.Services.AccountServices;

@RestController
public class BankingController {
    private final AccountServices accountServices;

    public BankingController(AccountServices accountServices){
        this.accountServices = accountServices;
    }

    //todo: Display account

    //todo: Create account

    //todo: Make Deposit

    //todo: Make withdraw

}
