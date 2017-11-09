package net.matosiuk.itnonstop.async.controller;

import net.matosiuk.itnonstop.async.controller.response.Response;
import net.matosiuk.itnonstop.async.model.AccountDetails;
import net.matosiuk.itnonstop.async.model.Deal;
import net.matosiuk.itnonstop.async.repository.AccountsMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class AccountsController {

    @Autowired
    AccountsMocks mocks;

    @RequestMapping(value = "/accounts/{accountId}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getAccountDetails(@PathVariable("accountId") int accountId) {
        Object data = mocks.getAccountData(accountId);
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }

    @RequestMapping(value = "/accounts", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getAccounts() {
        List<AccountDetails> data = mocks.getAllAccounts();
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }

    @RequestMapping(value = "/accounts/{accountId}/deals", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getDeals(@PathVariable("accountId") int accountId) {
        List<Deal> data = mocks.getDeals(accountId);
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }
}
