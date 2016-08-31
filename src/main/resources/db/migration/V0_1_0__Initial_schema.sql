CREATE TABLE Research (
  id SERIAL NOT NULL,
  name TEXT NOT NULL,
  author TEXT NOT NULL,

  CONSTRAINT Research_pk PRIMARY KEY (id)
);

CREATE INDEX Research_id_idx
  ON Research
  USING BTREE (id);