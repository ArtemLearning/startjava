CREATE DATABASE jaegers;
\c jaegers;
CREATE TABLE Jaegers (  id         SERIAL PRIMARY KEY,
                        modelName  TEXT,
                        mark       CHAR(6),
                        height     NUMERIC(4, 2),
                        weight     NUMERIC(4, 3),
                        status     CHAR(10),
                        origin     CHAR(10),
                        launch     DATE,
                        kaijuKill  INTEGER
                     );