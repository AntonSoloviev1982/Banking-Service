-- liquibase formatted sql

-- changeset anton:create_account
DROP TABLE IF EXISTS public.user;
DROP TABLE IF EXISTS account;
CREATE TABLE account
(
    id             SERIAL PRIMARY KEY,
    account_number BIGINT    NOT NULL UNIQUE,
    balance        NUMERIC(20, 2) NOT NULL
);

-- changeset anton:create_user
CREATE TABLE public.user
(
    id         SERIAL PRIMARY KEY,
    username   VARCHAR(30) NOT NULL UNIQUE,
    password   VARCHAR(30) NOT NULL,
    email      VARCHAR(15) NOT NULL UNIQUE,
    phone      VARCHAR(15) NOT NULL UNIQUE,
    account_id INTEGER     NOT NULL,
    first_name VARCHAR(30),
    patronymic VARCHAR(30),
    last_name  VARCHAR(30),
    birthday   DATE,
    FOREIGN KEY (account_id) REFERENCES account (id)
);


