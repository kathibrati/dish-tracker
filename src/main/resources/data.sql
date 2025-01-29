-- Spaghetti Bolognese
INSERT INTO dish (id, name, servings) VALUES (1, 'Spaghetti Bolognese', 2);

-- Zutaten für Spaghetti Bolognese
INSERT INTO ingredient (id, name, amount, unit, calories_per_unit, dish_id) VALUES
                                                                                (1, 'Spaghetti', 200, 'g', 150, 1),
                                                                                (2, 'Hackfleisch', 250, 'g', 250, 1),
                                                                                (3, 'Tomatensauce', 150, 'ml', 50, 1),
                                                                                (4, 'Olivenöl', 10, 'ml', 90, 1);

-- Caesar Salad
INSERT INTO dish (id, name, servings) VALUES (2, 'Caesar Salad', 1);

-- Zutaten für Caesar Salad
INSERT INTO ingredient (id, name, amount, unit, calories_per_unit, dish_id) VALUES
                                                                                (5, 'Römersalat', 100, 'g', 20, 2),
                                                                                (6, 'Hähnchenbrust', 150, 'g', 200, 2),
                                                                                (7, 'Croutons', 50, 'g', 150, 2),
                                                                                (8, 'Parmesan', 30, 'g', 110, 2),
                                                                                (9, 'Caesar Dressing', 50, 'ml', 160, 2);
-- Protein Waffeln
INSERT INTO dish (id, name, servings) VALUES (3, 'Protein Waffeln', 2);

-- Zutaten für Protein Waffeln
INSERT INTO ingredient (id, name, amount, unit, calories_per_unit, dish_id) VALUES
                                                                                (10, 'Ei', 6, 'Stück', 90, 3),
                                                                                (11, 'Milch', 120, 'ml', 47, 3),
                                                                                (12, 'Dinkelmehl', 140, 'g', 348, 3);