package com.natancode.notification.domain.services;

import com.natancode.notification.core.notification.product.Notification;
import com.natancode.notification.domain.model.User;
import com.natancode.notification.domain.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private UserService userService;

    public Notification insert() {

        //TODO -> get user mock
        User user = userService.findById(1);


        return null;
    }
}
