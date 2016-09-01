CREATE TABLE Variables (
  id SERIAL NOT NULL PRIMARY KEY,
  researchId INTEGER NOT NULL,
  name TEXT NOT NULL,
  type TEXT,

  FOREIGN KEY (researchId) REFERENCES Research (id)
);

CREATE INDEX Variables_id_idx
  ON Variables
  USING BTREE (id);