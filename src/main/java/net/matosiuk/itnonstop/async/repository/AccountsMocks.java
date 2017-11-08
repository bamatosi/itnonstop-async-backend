package net.matosiuk.itnonstop.async.repository;

import net.matosiuk.itnonstop.async.model.AccountDetails;
import net.matosiuk.itnonstop.async.model.Deal;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountsMocks {
    public AccountDetails getAccountData(int accountId) {
        return new AccountDetails(accountId, "BUSINESS ACCOUNT", "Nice fella", "Cool Ave 12/23", true);
    }

    public List<Deal> getDeals(int accountId) {
        List<Deal> out = new ArrayList<>();
        out.add(new Deal("Deal 1", "This will make you rich", "http://localhost/nowhere", LocalDate.now().plusDays(10)));
        out.add(new Deal("Deal 2", "This will make you even richer", "http://localhost/nowhere", LocalDate.now().plusDays(1)));
        out.add(new Deal("Deal 3", "This will make you ... ", "http://localhost/nowhere", LocalDate.now().plusDays(13)));
        return out;
    }
}
