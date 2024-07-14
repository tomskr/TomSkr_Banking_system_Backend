package pl.tomskr.tomskr_banking_system_backend.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.tomskr.tomskr_banking_system_backend.Domain.Account;
import pl.tomskr.tomskr_banking_system_backend.Services.AccountServices;

import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class BankingController {
    private final AccountServices accountServices;

    public BankingController(AccountServices accountServices){
        this.accountServices = accountServices;
    }


    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id){
        return accountServices.getAccount(id).orElseThrow(()-> new RuntimeException("Account not Found"));
    }


    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account newAccount){
        Account saveAccount = accountServices.createAccount(newAccount);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveAccount);
    }


    @PostMapping("/{id}/deposit")
    public Account deposit(@PathVariable Long id, @RequestBody Map<String, Double> request) {
        Double amount = request.get("amount");
        return accountServices.makeDeposit(amount, id);
    }

    @PostMapping("/{id}/withdraw")
    public Account withdraw(@PathVariable Long id, @RequestBody Map<String, Double> request){
        Double amount = request.get("amount");
        return accountServices.makeWithdraw(amount, id);
    }

}
