package com.natancode.notification.api.v1.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationInput {

    private Long categoryId;

    private CategoryIdInput category;

    private NotificationIdInput notification;

    private String message;

}
