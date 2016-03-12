CREATE TABLE products
(id VARCHAR(20) PRIMARY KEY,
 name VARCHAR(30),
 slug VARCHAR(30),
 description TEXT,
 created_at TIME,
 updated_at TIME,
 active BOOLEAN);
