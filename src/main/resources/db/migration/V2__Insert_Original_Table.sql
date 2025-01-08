INSERT INTO Genre (Nom) VALUES ('Science Fiction');
INSERT INTO Genre (Nom) VALUES ('Fantasy');
INSERT INTO Genre (Nom) VALUES ('Mystery');

INSERT INTO Livre (Titre, disponible) VALUES ('Dune', false);
INSERT INTO Livre (Titre, disponible) VALUES ('The Hobbit', false);
INSERT INTO Livre (Titre, disponible) VALUES ('Mystery House', true);
INSERT INTO Livre (Titre, disponible) VALUES ('Lord Of The Ring', true);
INSERT INTO Livre (Titre, disponible) VALUES ('StarWars', true);

INSERT INTO livre_genre (livre_id, genre_id) VALUES (1, 1);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (2, 2);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (3, 3);

INSERT INTO Emprunteur (nom, prenom, mail, telephone) VALUES ('Dupont', 'Jean', 'jean.dupont@example.com', '0123456789');
INSERT INTO Emprunteur (nom, prenom, mail, telephone) VALUES ('Martin', 'Marie', 'marie.martin@example.com', '0987654321');

INSERT INTO Emprunt (DATE_EMPRUNT, DATE_RETOUR, emprunteur_id, livre_id) VALUES ('2025-01-01 10:00:00', '2025-01-15 10:00:00', 1, 1);
INSERT INTO Emprunt (DATE_EMPRUNT, emprunteur_id, livre_id) VALUES ('2025-01-02 11:00:00', 2, 2);