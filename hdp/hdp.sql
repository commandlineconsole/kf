
https://sqoop.apache.org/docs/1.4.0-incubating/SqoopUserGuide.html

org.apache.avro.reflect.reflect.addlogicaltypeconversion

-- create table
create table CDR(loc VARCHAR(100), duration Int, phone VARCHAR(100), errorcode VARCHAR(100) PRIMARY KEY ( loc ))

-- export data from mysql to hive
sqoop export --connect "jdbc:mysql://127.0.0.1/testDb" --username root --password hadoop --table CDR1
--export-dir /test/CDR.csv --input-fields-terminated-by ',' --input-lines-terminated-by '\n' --num-mappers 2  --batch  --outdir java_files

 -- list the mysql table
 sqoop list-tables --connect jdbc:mysql://127.0.0.1/testDb --username root --password hadoop

 -- Import data from hdfs to mysql(export)
 sqoop import --connect "jdbc:mysql://127.0.0.1/testDb" --username=root --password=hadoop --table CDR --driver com.mysql.jdbc.Driver --hive-import --hive-overwrite --create-hive-table --hive-table CDR --outdir java_files --split-by loc;

 -- Import data from hdfs to mysql(export)
 sqoop import --incremental append  --append --check-column "phone" --connect "jdbc:mysql://127.0.0.1/testDb" --username=root --password=hadoop
 --table CDR --driver com.mysql.jdbc.Driver --hive-import --hive-overwrite --create-hive-table --hive-table CDR --outdir java_files --split-by loc;

insert into CDR select '1',10,'1','0x830F09'

 -- Incremental load
sqoop import --connect "jdbc:mysql://127.0.0.1/testDb" --username=root --password=hadoop --table CDR --target-dir hdfs://sandbox.hortonworks.com:8020/apps/hive/warehouse/cdr  --driver com.mysql.jdbc.Driver --append --check-column "duration" --incremental append --where 'duration > 5' --outdir java_files
sqoop import --connect "jdbc:mysql://127.0.0.1/testDb" --username=root --password=hadoop --table CDR --target-dir hdfs://sandbox.hortonworks.com:8020/apps/hive/warehouse/cdr  --driver com.mysql.jdbc.Driver --append --check-column "duration" --incremental append --where 'duration > 5' --outdir java_files

 -- Incremental load
sqoop import --connect "jdbc:mysql://127.0.0.1/testDb" --username=root --password=hadoop --table CDR --target-dir hdfs://sandbox.hortonworks.com:8020/apps/hive/warehouse/cdr  --driver com.mysql.jdbc.Driver --append --check-column "duration" --incremental append --where 'duration > 5' --outdir java_files

-- save file as avrodatafile
sqoop import-all-tables -m 1 --driver com.mysql.jdbc.Driver --connect "jdbc:mysql://127.0.0.1/testDb" --username=root --password=hadoop --as-avrodatafile --warehouse-dir hdfs://sandbox.hortonworks.com:8020/apps/hive/warehouse/cdr12.db --outdir java_files;

sqoop import-all-tables -Dmapreduce.job.user.classpath.first=true -m 1 --driver com.mysql.jdbc.Driver --connect "jdbc:mysql://127.0.0.1/testDb" --username=root --password=hadoop  --as-avrodatafile --warehouse-dir hdfs://sandbox.hortonworks.com:8020/apps/hive/warehouse/cdr14.db --outdir java_files;

sqoop import

-Dmapreduce.job.user.classpath.first=true -Dhadoop.security.credential.provider.path=jceks://x.jceks
--connect jdbc:db2://xxx:60000/x2 --username xx -password-alias xx --as-avrodatafile --target-dir xx/data/test --fields-terminated-by '\001' --table xx -m 1
