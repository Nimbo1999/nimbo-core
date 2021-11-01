CREATE TABLE reminder (
	id uuid NOT NULL DEFAULT gen_random_uuid(),
	title varchar(100) NOT NULL,
	content TEXT NOT NULL,
	created_at TIMESTAMP NOT NULL,
	updated_at TIMESTAMP NOT NULL,
	CONSTRAINT reminder_pkey PRIMARY KEY (id)
);