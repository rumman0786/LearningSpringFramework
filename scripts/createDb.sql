CREATE DATABASE learning_spring_db WITH ENCODING='UTF8';

CREATE USER springUser WITH PASSWORD 'springUser';

ALTER ROLE springUser SET client_encoding TO 'utf8';
ALTER ROLE springUser SET default_transaction_isolation TO 'read committed';
ALTER ROLE springUser SET timezone TO 'UTC';

GRANT ALL PRIVILEGES ON DATABASE learning_spring_db TO springUser;