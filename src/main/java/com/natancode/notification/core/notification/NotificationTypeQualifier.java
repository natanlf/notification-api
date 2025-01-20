package com.natancode.notification.core.notification;

import com.natancode.notification.domain.model.NotificationType;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface NotificationTypeQualifier {

    NotificationType value();

}
