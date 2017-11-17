package net.matosiuk.itnonstop.async.controller;

import net.matosiuk.itnonstop.async.Configuration;
import net.matosiuk.itnonstop.async.controller.response.Response;
import net.matosiuk.itnonstop.async.model.PaymentDetails;
import net.matosiuk.itnonstop.async.model.Permissions;
import net.matosiuk.itnonstop.async.repository.PaymentsMocks;
import net.matosiuk.itnonstop.async.repository.PermissionsMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PermissionsController {

    @Autowired
    PermissionsMocks mocks;

    @Autowired
    Configuration config;

    @RequestMapping(value = "/permissions/{userId}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity getPermissions(@PathVariable("userId") int userId) throws InterruptedException {
        Thread.sleep(config.getRandomSleepTime());
        Permissions data = mocks.getPermissions(userId);
        return new ResponseEntity<>(new Response().addData(data), HttpStatus.OK);
    }
}
