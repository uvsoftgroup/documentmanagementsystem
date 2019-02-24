-- create application database
create database uvsoftgrouptdms;

/* Generate all respective id based on your application model/domain/entity classes:
1. seq_document 2. seq_userrole 3. seq_useregistration 4. seq_fileupload
*/

-- document sequence generation id
CREATE SEQUENCE seq_document
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 100
  CACHE 1;
ALTER TABLE seq_document
  OWNER TO postgres;

-- user role sequence generation id
CREATE SEQUENCE seq_userrole
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE seq_userrole
  OWNER TO postgres;
  
-- user registration sequence generation id
CREATE SEQUENCE seq_useregistration
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 300
  CACHE 1;
ALTER TABLE seq_useregistration
  OWNER TO postgres;

-- file upload sequence generation id
  CREATE SEQUENCE seq_fileupload
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 400
  CACHE 1;
ALTER TABLE seq_fileupload
  OWNER TO postgres;

-- to get next generation id statement/query
 select nextval ('seq_document');
 select nextval ('seq_userrole');
 select nextval ('seq_useregistration');
 select nextval ('seq_fileupload');
 
select * from fileupload
select * from userrole;
select * from userregistration;
 
 
