CREATE DATABASE jaegers;

CREATE TABLE jaegers (  id         serial primary key,
                        modelName  text,
                        mark       char(7),
                        height     integer,
                        weight     integer,
                        status     char(10),
                        origin     char(20),
                        launch     dats,
                        kaijuKill  integer
                     );