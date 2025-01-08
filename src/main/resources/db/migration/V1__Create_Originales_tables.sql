CREATE TABLE Genre (
                       id SERIAL PRIMARY KEY,
                       nom VARCHAR(255) NOT NULL
);

CREATE TABLE Emprunteur (
                            id SERIAL PRIMARY KEY,
                            nom VARCHAR(255) NOT NULL,
                            prenom VARCHAR(255) NOT NULL,
                            mail VARCHAR(255) NOT NULL,
                            telephone VARCHAR(20) NOT NULL
);

CREATE TABLE Livre (
                       id SERIAL PRIMARY KEY,
                       titre VARCHAR(255) NOT NULL,
                        disponible BOOLEAN DEFAULT TRUE
);

CREATE TABLE Emprunt (
                         id SERIAL PRIMARY KEY,
                         DATE_EMPRUNT TIMESTAMP,
                         DATE_RETOUR TIMESTAMP,
                         emprunteur_id BIGINT NOT NULL,
                         livre_id BIGINT NOT NULL,
                         FOREIGN KEY (emprunteur_id) REFERENCES Emprunteur(Id),
                         FOREIGN KEY (livre_id) REFERENCES Livre(Id)
);

CREATE TABLE livre_genre (
                             livre_id BIGINT NOT NULL,
                             genre_id BIGINT NOT NULL,
                             PRIMARY KEY (livre_id, genre_id),
                             FOREIGN KEY (livre_id) REFERENCES Livre(Id),
                             FOREIGN KEY (genre_id) REFERENCES Genre(Id)
);