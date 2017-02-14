CREATE TABLE Participants (
  id SERIAL NOT NULL PRIMARY KEY,
  researchId INTEGER NOT NULL,
  name TEXT NOT NULL,

  FOREIGN KEY (researchId) REFERENCES Research (id)
);

CREATE INDEX Participants_id_idx
  ON Participants
  USING BTREE (id);