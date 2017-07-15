https://archanaschangale.wordpress.com/2013/09/18/sqoopimporting-data-from-mysql-into-hdfs/
https://www.cloudera.com/more/training/certification/cca-data-analyst.html
http://quickstart.cloudera:7180/cmf/home

----------------------------------------------------------------

C:\Users\Ja>putty.exe cloudera@192.168.56.101 -pw cloudera

mysql -u root -p    (hadoop password for hdp)
mysql -u root -pcloudera

-----------

show databases;
create database testDb;
use testDb;

-----------
create table student(id integer, name char(20));
insert into student values(1,'Archan');
insert into student values(2,'xyz');
exit;

-----------

If you have not defined primary key for your table then you have to give ‘-m 1′ option for import.

sqoop import \
--connect jdbc:mysql://localhost/sqoop import \
--connect jdbc:mysql://localhost/databasename \
--username $USER_NAME \
--password $PASSWORD$ \
--table tablename \
--m 1\
--username $USER_NAME \
--password $PASSWORD$ \
--table tablename \
--m 1




http://localhost:4200/ root Password1 ( hdp)
su root/cloudera
su cloudera


sqoop import \
--connect jdbc:mysql://quickstart.cloudera/retail_db \
--username root \
--password cloudera \
--table customers \
--m 1

--- grant all on database.* TO 'user'@'%' IDENTIFIED BY 'password';
-- CREATE USER 'ja'@'localhost' IDENTIFIED BY 'ja';

-- GRANT ALL PRIVILEGES ON *.* TO 'ja'@'%' IDENTIFIED BY 'ja' WITH GRANT OPTION;
-- FLUSH PRIVILEGES;

-- ------------------ --------------- --------------

cloudera cerification commands

------------------
ps -ef|grep  -i manager  ( check the clouder servies up and running)
ps -fu hdfs ( Check the name node )
ps -fu yarn ( Check the yarn status )
-- if yarn and hdfs is running then sqoop won't have any issues

sqoop import --help

mysql - u retail_dba -p
use retail_dba;
show tables;
exit;

hadoop fs -ls /user/cloudera ( Name space or path )
hadoop fs -mkdir /user/cloudera/sqoop_import
sqoop
sqoop help  ( import , Import-all-tables,list databases, list-tables,merge, version)

-- ------------------ --------------- --------------

sqoop list-databases \
--connnect "jdbc:mysql://quickstart.cloudera:3306"
--username retail_dba \
--password cloudera

sqoop list-tables \
--connnect "jdbc:mysql://quickstart.cloudera:3306"
--username retail_dba \
--password cloudera

sqoop eval \
--connnect "jdbc:mysql://quickstart.cloudera:3306"
--username retail_dba \
--password cloudera \
--query "select * from departments"

-- ------------------ --------------- --------------

--Vidio  - 1 ( load the data from source to target and check the number of records on the source and target)

sqoop import-all-tables \
  -m 12 \
  --connect "jdbc:mysql://quickstart.cloudera:3306/retail_db" \
  --username=retail_dba \
  --password=cloudera \
  --as-avrodatafile \
  --warehouse-dir=/user/hive/warehouse/retail_stage.db

  hadoop fs -ls /user/cloudera/sqoop_import
  hadoop fs -ls /user/cloudera/sqoop_import/departments
  hadoop fs -tail /user/cloudera/sqoop_import/departments/part-m-00011

  hadoop fs -cat /user/cloudera/sqooop_import/order_items/part-m-*
  hadoop fs -cat /user/cloudera/sqooop_import/order_items/part-m-*|wc -1  ( check the source count)

 sqoop eval \
  --connect "jdbc:mysql://quickstart.cloudera:3306/retail_db" \   (check the target count)
  --username retail_dba \
  --password cloudera \
  --query "select count(1) from order_items"

  default delimiter is comman delimiter

-- -- ------------------ --------------- --------------
Vidio  - 2

hive
hadoop fs -ls /user/hive/warehouse/
dfs -ls /user/hive/warehouse;
show databases;
use retail;


sqoop import-all-tables \
  --num-mappers 1 \
  --connect "jdbc:mysql://quickstart.cloudera:3306/retail_db" \
  --username=retail_dba \
  --password=cloudera \
  --hive-import \
  --hive-overwrite \
  --create-hive-table \
  --compress \
  --compression-codec org.apache.hadoop.io.compress.SnappyCodec \
  --outdir java_files

show tables;
select * from departments;
describe departments;
describe formated departments;
dfs -ls /user/hive/warehouse/departments;
dfs -ls /user/hive/warehouse/departments;

dfs -du -s -h /user/cloudera/sqooop_import/order_items/departments   ( it will show size of the file)
dfs -tail /user/cloudera/sqooop_import/order_items/part-m-00000.snappy;


select coun(1) from order_items

sqoop eval \
  --connect "jdbc:mysql://quickstart.cloudera:3306/retail_db" \
  --username retail_dba \
  --password cloudera \
  --query "select count(1) from order_items"


-- -- ------------------ --------------- --------------

Import data into hive

sqoop import-all-tables \
  --num-mappers 1 \
  --connect "jdbc:mysql://quickstart.cloudera:3306/retail_db" \
  --username=retail_dba \
  --password=cloudera \
  --hive-import \
  --hive-overwrite \
  --create-hive-table \
  --compress \
  --compression-codec org.apache.hadoop.io.compress.SnappyCodec \
  --outdir java_files

  show tables
  select * from table_name

  mysql -u retail_dba
  use retail_db
  show tables
  describe departments;

  hadoop fs -ls /user/cloudera/sqooop_import/order_items/departments
  hadoop fs -cat /user/cloudera/sqooop_import/order_items/departments/part*

--Insert
sqoop eval --connect "jdbc:mysql://quickstart.cloudera:3306/retail_db" \
  --username retail_dba \
  --password cloudera \
  --query "insert into departments values (10000, 'Inserting for merge')"


hadoop fs -rm -R /user/cloudera/departments


sqoop import \
  --connect "jdbc:mysql://quickstart.cloudera:3306/retail_db" \
  --username=retail_dba \
  --password=cloudera \
  --table departments \
  --as-textfile \
  --target-dir=/user/cloudera/sqoop_merge/departments_delta \
  --where "department_id >= 9000"


-- Boundary Query and columns
sqoop import \
  --connect "jdbc:mysql://quickstart.cloudera:3306/retail_db" \
  --username=retail_dba \
  --password=cloudera \
  --table departments \
  --target-dir /user/cloudera/departments \
  -m 2 \                                                   // thread
  --boundary-query "select 2, 8 from departments limit 1" \
  --columns department_id,department_name


  -- -- ------------------ --------------- -------------


















































