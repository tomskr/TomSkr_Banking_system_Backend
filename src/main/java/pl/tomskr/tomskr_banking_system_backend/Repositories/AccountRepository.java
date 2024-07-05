package pl.tomskr.tomskr_banking_system_backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomskr.tomskr_banking_system_backend.Domain.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
