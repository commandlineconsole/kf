---------------------------------------------------------------
server.properties
log.dirs=/tmp/kafka-logs  log.dirs=C:\msg\kafka\log

zookeeper.proerties
dataDir=/tmp/zookeeper  dataDir=C:\msg\zookeeper\data

---------------------------------------------------------------

cd C:\kafka

zkServer
----------
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties
.\bin\zkServer.sh .\config\zookeeper.properties

Create a topic
--------------
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

List topics
------------
.\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181

Start console producer
---------------------
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test

This is a message
This is another message

.\bin\windows\kafka-console-consumer.bat --zookeeper localhost:2181 --topic test --from-beginning

---------------------------------------------------------------


