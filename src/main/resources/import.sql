-- Livros
INSERT INTO TB_BOOK (id, title, price) VALUES (2, 'It', 20.50);
INSERT INTO TB_BOOK (id, title, price) VALUES (3, 'The Name of the Wind', 25.00);
INSERT INTO TB_BOOK (id, title, price) VALUES (4, 'Carrie', 17.90);
INSERT INTO TB_BOOK (id, title, price) VALUES (5, 'The Wise Man''s Fear', 27.30);
INSERT INTO TB_BOOK (id, title, price) VALUES (6, 'Misery', 18.40);
INSERT INTO TB_BOOK (id, title, price) VALUES (7, 'The Shining', 21.75);
INSERT INTO TB_BOOK (id, title, price) VALUES (8, 'Doctor Sleep', 19.99);
INSERT INTO TB_BOOK (id, title, price) VALUES (9, 'Revival', 16.60);
INSERT INTO TB_BOOK (id, title, price) VALUES (10, 'Salem''s Lot', 22.10);
INSERT INTO TB_BOOK (id, title, price) VALUES (11, 'The Slow Regard of Silent Things', 15.20);

-- Gêneros
INSERT INTO TB_GENRE(id, description) VALUES(1,'Horror');
INSERT INTO TB_GENRE(id, description) VALUES(2,'Psychological Thriller');
INSERT INTO TB_GENRE(id, description) VALUES(3,'Fantasy');
INSERT INTO TB_GENRE(id, description) VALUES(4,'Drama');
INSERT INTO TB_GENRE(id, description) VALUES(5,'Thriller');
INSERT INTO TB_GENRE(id, description) VALUES(6,'Supernatural');
INSERT INTO TB_GENRE(id, description) VALUES(7,'Adventure');
-- Autores
INSERT INTO TB_AUTHOR (id, name) VALUES (1, 'Stephen King');
INSERT INTO TB_AUTHOR (id, name) VALUES (2, 'Patrick Rothfuss');

-- Relacionamento livro-gênero
INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (2, 1); -- It: Horror
INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (2, 5); -- It: Thriller

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (3, 3); -- Name of the Wind: Fantasy
INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (3, 7); -- Adventure

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (4, 1); -- Carrie: Horror
INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (4, 4); -- Drama

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (5, 3); -- Wise Man's Fear: Fantasy

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (6, 2); -- Misery: Psychological Thriller

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (7, 1); -- The Shining: Horror
INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (7, 6); -- Supernatural

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (8, 1); -- Doctor Sleep: Horror
INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (8, 6); -- Supernatural

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (9, 1); -- Revival: Horror

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (10, 1); -- Salem's Lot: Horror
INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (10, 5); -- Thriller

INSERT INTO TB_BOOK_GENRES(book_entity_id, genres_id) VALUES (11, 3); -- Slow Regard: Fantasy

-- Relacionamento livro-autor
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (1, 2); -- Stephen King - It
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (2, 3); -- Patrick Rothfuss - Name of the Wind
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (1, 4); -- Stephen King - Carrie
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (2, 5); -- Patrick Rothfuss - Wise Man's Fear
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (1, 6); -- Stephen King - Misery
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (1, 7); -- Stephen King - The Shining
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (1, 8); -- Stephen King - Doctor Sleep
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (1, 9); -- Stephen King - Revival
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (1, 10); -- Stephen King - Salem's Lot
INSERT INTO TB_BOOK_AUTHORS (AUTHORS_ID, BOOK_ENTITY_ID) VALUES (2, 11); -- Patrick Rothfuss - Slow Regard

