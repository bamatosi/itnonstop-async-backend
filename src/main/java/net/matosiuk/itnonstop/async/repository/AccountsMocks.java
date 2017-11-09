package net.matosiuk.itnonstop.async.repository;

import net.matosiuk.itnonstop.async.model.AccountDetails;
import net.matosiuk.itnonstop.async.model.Deal;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AccountsMocks {
    private HashMap<Integer,AccountDetails> accounts = new HashMap();

    public AccountsMocks() {
        this.accounts.put(1, new AccountDetails(1, "BUSINESS ACCOUNT", "Nice fella", "Cool Ave 12/23", true));
        this.accounts.put(2, new AccountDetails(2, "BUSINESS ACCOUNT", "Mr. Kovalsky", "Some street 12", false));
        this.accounts.put(3, new AccountDetails(3, "PRIVATE ACCOUNT", "Barry Novak", "Raclawickie 12", true));
        this.accounts.put(4, new AccountDetails(4, "BUSINESS ACCOUNT", "Julie Nice", "ul. Zana 11/23", false));
        this.accounts.put(5, new AccountDetails(5, "PRIVATE ACCOUNT", "John Feedback", "Narutowicza 1", false));
        this.accounts.put(6, new AccountDetails(6, "BUSINESS ACCOUNT", "Lorem Ipsum", "Kraśnicka 241", true));
        this.accounts.put(7, new AccountDetails(7, "BUSINESS ACCOUNT", "Bartosz M", "Secret Street 1", true));
        this.accounts.put(8, new AccountDetails(8, "PRIVATE ACCOUNT", "Nikodem S", "More secret street 21", true));
        this.accounts.put(9, new AccountDetails(9, "BUSINESS ACCOUNT", "DataArt", "ul. Tomasza Zana 39а", true));
        this.accounts.put(10, new AccountDetails(10, "PRIVATE ACCOUNT", "Jan Nowak", "ul. Nowaka 3", false));
    }

    public AccountDetails getAccountData(int accountId) {
        return (accountId>=1 && accountId<=10) ? this.accounts.get(accountId) : null;
    }

    public List<AccountDetails> getAllAccounts() {
        return new ArrayList<>(this.accounts.values());
    }

    public List<Deal> getDeals(int accountId) {
        List<Deal> out = new ArrayList<>();
        out.add(new Deal("Deal 1", "This will make you rich", "http://localhost/nowhere", LocalDate.now().plusDays(10)));
        out.add(new Deal("Deal 2", "This will make you even richer", "http://localhost/nowhere", LocalDate.now().plusDays(1)));
        out.add(new Deal("Deal 3", "This will make you ... ", "http://localhost/nowhere", LocalDate.now().plusDays(13)));
        return out;
    }
}
