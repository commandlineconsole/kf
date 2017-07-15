oozie :

oozie admin -oozie http://quickstart.cloudera:11000/oozie -status

find /opt -name "oozie*examples*"
find /usr -name "oozie*examples*"

oozie admin -oozie http://quickstart.cloudera:11000/oozie -status

cp /usr/share

[root@quickstart bin]# find /usr -name "oozie*examples*"

----------------------------------------------------------------------------

// copy example from  local to demo folder

/usr/lib/hue/apps/oozie/examples/workflows/spark-scala/lib/oozie-examples.jar
/usr/share/doc/oozie-4.1.0+cdh5.10.0+389/oozie-examples.tar.gz

mkdir /root/demo
cd /root/demo
cp /var/lib/oozie/tomcat-deployment/webapps/oozie/docs/oozie-examples.tar.gz .
tar -zxvf oozie-examples.tar.gz

/usr/share/doc/oozie-4.1.0+cdh5.10.0+389/oozie-examples.tar.gz

jar tvf lib/oozie-examples-4.1.0-cdh5.10.0.jar

-----------------------------------------------

/home/cloudera/examples/apps/java-main/lib/ oozie-examples-4.1.0-cdh5.10.0.jar

[cloudera@quickstart examples]$ ls
apps  input-data  src

[cloudera@quickstart java-main]$ pwd
/home/cloudera/examples/apps/java-main
/home/cloudera/examples/apps

jar tvf oozie-examples-4.1.0-cdh5.10.0.jar

-----------------------------------------------

Resource manager url

http://quickstart.cloudera:19888/jobhistory/logs/quickstart.cloudera:8041/container_1497039225046_0002_01_000002/attempt_1497039225046_0002_m_000000_0/cloudera
http://quickstart.cloudera:8088/cluster/app/application_1497039225046_0002

// oozie job submit command
 oozie job -oozie http://quickstart.cloudera:11000/oozie -config examples/apps/java-main/job.properties -run
//oozie job info check command
oozie job -oozie http://quickstart.cloudera:11000/oozie -info  0000002-170609131428172-oozie-oozi-W

-------------------------------------------------------------------------

hadoop fs -cat /user/cloudera/examples/apps/java-main/job.properties
jar tvf oozie-examples-4.1.0-cdh5.10.0.jar ( lib)


hadoop fs -ls /user/cloudera/examples/apps/java-main
[cloudera@quickstart demo]$ hadoop fs -ls /user/cloudera/examples/apps/java-main/

Found 3 items
-rw-r--r--   1 cloudera cloudera       1123 2017-06-09 15:01 /user/cloudera/examples/apps/java-main/job.properties
drwxr-xr-x   - cloudera cloudera          0 2017-06-09 15:01 /user/cloudera/examples/apps/java-main/lib
-rw-r--r--   1 cloudera cloudera       1631 2017-06-09 15:01 /user/cloudera/examples/apps/java-main/workflow.xml

--------------------------------------------------------

oozie job \
-oozie http://quickstart.cloudera:11000/oozie \
-config examples/apps/java-main/job.properties -run

cd ~/examples/apps/java-main/

[cloudera@quickstart java-main]$ ls
job.properties  lib  workflow.xml

job.properties - contain the path for Java-main
lib - contain jar file
workflow - contain the main class

---------------------------------------------------------
 jar tvf /home/cloudera/examples/apps/java-main/lib/oozie-examples-4.1.0-cdh5.10.0.jar
-------------------------------------------------------

// job.properties

nameNode=hdfs://quickstart.cloudera:8020/
jobTracker=quickstart.cloudera:8032
queueName=default
examplesRoot=examples

oozie.wf.application.path=${nameNode}/user/${user.name}/${examplesRoot}/apps/java-main
oozie.wf.application.path=hdfs://quickstart.cloudera:8020/user/cloudera/examples/apps/java-main

# /home/cloudera/examples

---------------------------------------------------------
// workflow.xml

<workflow-app xmlns="uri:oozie:workflow:0.2" name="java-main-wf">
    <start to="java-node"/>
    <action name="java-node">
        <java>
            <job-tracker>${jobTracker}</job-tracker>
            <name-node>${nameNode}</name-node>
            <configuration>
                <property>
                    <name>mapred.job.queue.name</name>
                    <value>${queueName}</value>
                </property>
            </configuration>
            <main-class>org.apache.oozie.example.DemoJavaMain</main-class>
            <arg>Hello</arg>
            <arg>Oozie!</arg>
        </java>
        <ok to="end"/>
        <error to="fail"/>
    </action>
    <kill name="fail">
        <message>Java failed, error message[${wf:errorMessage(wf:lastErrorNode())}]</message>
    </kill>
    <end name="end"/>
</workflow-app>

----------------------------------------------------------

// org.apache.oozie.example.DemoJavaMain

----------------------------------------------------------




