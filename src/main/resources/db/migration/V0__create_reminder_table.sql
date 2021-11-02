CREATE SEQUENCE IF NOT EXISTS reminder_id_sq AS BIGINT;

CREATE TABLE reminder (
	id BIGINT NOT NULL DEFAULT nextval('reminder_id_sq'::regclass),
	title varchar(100) NOT NULL,
	content TEXT NOT NULL,
	created_at TIMESTAMP NOT NULL,
	updated_at TIMESTAMP NOT NULL,
	CONSTRAINT reminder_pkey PRIMARY KEY (id)
);
