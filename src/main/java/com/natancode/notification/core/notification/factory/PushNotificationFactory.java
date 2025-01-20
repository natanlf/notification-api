package com.natancode.notification.core.notification.factory;

import com.natancode.notification.core.notification.NotificationTypeQualifier;
import com.natancode.notification.core.notification.product.Notification;
import com.natancode.notification.core.notification.product.PushNotification;
import com.natancode.notification.domain.model.NotificationType;
import org.springframework.stereotype.Service;

@Service
@NotificationTypeQualifier(NotificationType.PUSH_NOTIFICATION)
public class PushNotificationFactory extends NotificationFactory {

    @Override
    Notification createNotification() {
        return new PushNotification();
    }

}
