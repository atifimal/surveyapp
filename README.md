# Survey Application
***
### DB and User queries
~~~~sql 
create database TESTDB;
create user devuser with encrypted password 'password';
grant all privileges on database TESTDB to devuser;
alter default privileges in schema public grant all on tables to devuser;
alter default privileges in schema public grant all on sequences to devuser;
~~~~