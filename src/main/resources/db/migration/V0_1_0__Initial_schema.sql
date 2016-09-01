CREATE TABLE Research (
  id SERIAL NOT NULL PRIMARY KEY,
  name TEXT NOT NULL,
  author TEXT NOT NULL
);

CREATE INDEX Research_id_idx
  ON Research
  USING BTREE (id);