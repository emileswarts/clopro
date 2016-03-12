-- :name create-product! :! :n
-- :doc creates a new product record
INSERT INTO products
(id, name, slug, description)
VALUES (:id, :name, :slug, :description)

-- :name update-product! :! :n
-- :doc update an existing product record
UPDATE products
SET name = :name, slug = :slug, description = :description
WHERE id = :id

-- :name get-product :? :1
-- :doc retrieve a product given the id.
SELECT * FROM products
WHERE id = :id

-- :name delete-product! :! :n
-- :doc delete a product given the id
DELETE FROM products
WHERE id = :id
