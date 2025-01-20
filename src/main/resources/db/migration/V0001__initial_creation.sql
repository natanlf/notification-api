create table `category` (
	`id` bigint NOT NULL auto_increment,
    `name` varchar(100) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table `user` (
	`id` bigint NOT NULL auto_increment,
    `name` varchar(100) NOT NULL,
    `phone_number` varchar(20) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table `user_categories` (
	`user_id` bigint NOT NULL,
    `category_id` bigint NOT NULL,

    primary key (`user_id`, `category_id`),
    constraint fk_user_categories_user foreign key (`user_id`) references `user` (id),
    constraint fk_user_categories_category foreign key (`category_id`) references `category` (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table `user_channels` (
	`user_id` bigint NOT NULL,
    `channel` varchar(100) NOT NULL,

    primary key (`user_id`, `channel`),
    constraint fk_user_channel foreign key (`user_id`) references `user` (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table `notification` (
	`id` bigint NOT NULL,
    `user_id` bigint NOT NULL,
    `category_id` bigint NOT NULL,
    `channel` varchar(100) NOT NULL,
    `message` varchar(255) NOT NULL,
    `timestamp` datetime NOT NULL,

    primary key (`id`),
    constraint fk_user_notification foreign key (`user_id`) references `user` (id),
    constraint fk_category_notification foreign key (`category_id`) references `category` (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;