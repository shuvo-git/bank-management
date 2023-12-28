CREATE TABLE acs.account
(
    id BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
	phone VARCHAR(15) NOT NULL,
    dob TIMESTAMP NOT NULL,
	status TINYINT NOT NULL,
    CONSTRAINT account_pk
        PRIMARY KEY (id)
);

CREATE SEQUENCE  account_id_seq START 1 INCREMENT 1;