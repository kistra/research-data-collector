CREATE TABLE Results (
  id            SERIAL  NOT NULL PRIMARY KEY,
  researchId    INTEGER NOT NULL,
  participantId INTEGER NOT NULL,
  variableId    INTEGER NOT NULL,
  numericValue  NUMERIC,
  textValue     TEXT,

  FOREIGN KEY (researchId) REFERENCES Research (id),
  FOREIGN KEY (participantId) REFERENCES Participants (id),
  FOREIGN KEY (variableId) REFERENCES Variables (id)
);

CREATE INDEX Results_id_idx
ON Results
USING BTREE (id);