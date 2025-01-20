package com.natancode.notification.api.v1.controller;

import com.natancode.notification.api.v1.model.input.NotificationInput;
import com.natancode.notification.domain.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(path = "/v1/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<?> insert(@RequestBody NotificationInput body) {

        //notificationService.insert()

        return ResponseEntity.ofNullable(null);
    }

}
