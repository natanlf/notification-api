package com.natancode.notification.core.notification.factory;

import com.natancode.notification.core.notification.NotificationTypeQualifier;
import com.natancode.notification.core.notification.product.EmailNotification;
import com.natancode.notification.core.notification.product.Notification;
import com.natancode.notification.domain.model.NotificationType;
import org.springframework.stereotype.Service;

@Service
@NotificationTypeQualifier(NotificationType.EMAIL)
public class EmailFactory extends NotificationFactory {

    @Override
    Notification createNotification() {
        return new EmailNotification();
    }

}
