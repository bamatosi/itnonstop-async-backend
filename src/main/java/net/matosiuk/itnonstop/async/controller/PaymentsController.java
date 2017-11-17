package net.matosiuk.itnonstop.async.controller;


import net.matosiuk.itnonstop.async.Configuration;
import net.matosiuk.itnonstop.async.controller.response.Response;
import net.matosiuk.itnonstop.async.model.PaymentDetails;
import net.matosiuk.itnonstop.async.model.PaymentTypeDetails;
import net.matosiuk.itnonstop.async.repository.PaymentsMocks;
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
public class PaymentsController {

    @Autowired
    PaymentsMocks mocks;

    @Autowired
    Configuration config;

    @RequestMapping(value = "/payments/{paymentId}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getDetails(@PathVariable("paymentId") int paymentId) throws InterruptedException {
        Thread.sleep(config.getRandomSleepTime());
        PaymentDetails data = mocks.getPayment(paymentId);
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }

    @RequestMapping(value = "/payments", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getAllPayments() throws InterruptedException {
        Thread.sleep(config.getRandomSleepTime());
        List<PaymentDetails> data = mocks.getAllPayments();
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }

    @RequestMapping(value = "/payments/types", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getTypes() throws InterruptedException {
        Thread.sleep(config.getRandomSleepTime());
        List<String> data = mocks.getAllPaymentTypes();
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }

    @RequestMapping(value = "/payments/types/{type}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getTypeDetails(@PathVariable("type") String type) throws InterruptedException {
        Thread.sleep(config.getRandomSleepTime());
        PaymentTypeDetails data = mocks.getPaymentTypeDetails(type);
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }

    @RequestMapping(value = "/payments/{paymentId}/headers/{type}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getHeaders(@PathVariable("paymentId") int paymentId, @PathVariable("type") String type) throws InterruptedException {
        Thread.sleep(config.getRandomSleepTime());
        Map<String, String> data = mocks.getHeaders(paymentId, type);
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }
}
