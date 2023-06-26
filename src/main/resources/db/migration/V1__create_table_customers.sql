CREATE SEQUENCE hibernate_sequence start with 1;

CREATE TABLE customers
(
    id         integer      not null,
    code       varchar(36)  not null,
    name       varchar(150) not null,
    last_name  varchar(150) not null,
    document   varchar(15)  not null,
    created_at timestamp    not null,
    created_by varchar(255) not null,
    updated_at timestamp    not null,
    updated_by varchar(255) not null,
    PRIMARY KEY (id),
    UNIQUE (code, document)
);

CREATE TABLE revinfo
(
    REV      integer not null,
    REVTSTMP bigint,
    PRIMARY KEY (rev)
);

CREATE TABLE customers_aud
(
    id         integer      not null,
    REV        integer      not null,
    REVTYPE    integer      not null,
    code       varchar(36)  not null,
    name       varchar(150) not null,
    last_name  varchar(150) not null,
    document   varchar(15)  not null,
    created_at timestamp    not null,
    created_by varchar(255) not null,
    updated_at timestamp    not null,
    updated_by varchar(255) not null,
    PRIMARY KEY (id, REV)
);