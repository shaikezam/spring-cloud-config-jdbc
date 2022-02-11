

create table if not exists properties
(
    id            uuid not null,
    key           TEXT not null,
    value         TEXT,
    application   TEXT,
    profile       TEXT,
    label         TEXT,
    default_value TEXT,
    date_created    TIMESTAMP(3) with time zone not null,
                                     last_updated    TIMESTAMP(3) with time zone not null,
                                     primary key (id)
    );


INSERT INTO properties (id, application, profile, label, key, value, default_value, date_created, last_updated)
VALUES
    ('010ec074-9650-4de4-bca2-e71c86d65e40', 'client', 'dev', 'teva', 'my.value', 'Hello World', 'Hello World', now(), now());