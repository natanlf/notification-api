package com.natancode.notification.core.notification.factory;

import com.natancode.notification.core.notification.NotificationTypeQualifier;
import com.natancode.notification.core.notification.product.Notification;
import com.natancode.notification.core.notification.product.SmsNotification;
import com.natancode.notification.domain.model.NotificationType;
import org.springframework.stereotype.Service;

@Service
@NotificationTypeQualifier(NotificationType.SMS)
public class SmsFactory extends NotificationFactory {

    @Override
    Notification createNotification() {
        return new SmsNotification();
    }

}
