/opt/examples/flume
/usr/lib64/cmf/service/flume
/usr/lib64/cmf/agent/build/env/lib/python2.6/site-packages/cmf-5.10.0-py2.6.egg/cmf/monitor/flume
/usr/lib64/cmf/agent/build/env/lib/python2.6/site-packages/cmf-5.10.0-py2.6.egg/lib/cmf/monitor/flume
[root@quickstart cloudera]# cd /opt/examples/flume
[root@quickstart flume]# ls
conf  morphlines  solr_configs
[root@quickstart flume]# cd conf
[root@quickstart conf]# ls
flume.backup.conf  flume.conf  flume-env.sh  morphline.conf
[root@quickstart conf]# cat flume.conf
[cloudera@quickstart conf]$ cat example.conf
# example.conf: A single-node Flume configuration

# Name the components on this agent
a1.sources = r1
a1.sinks = k1
a1.channels = c1

# Describe/configure the source
# a1.sources.r1.type = netcat
# a1.sources.r1.bind = localhost
#a1.sources.r1.port = 44444

a1.sources.r1.type = exec
a1.sources.r1.command = tail -F /opt/gen_logs/logs/access.log
a1.sources.r1.channel = c1

a1.channels.c1.type = FILE
#a1.sinks.k1.type = FILE

# Describe the sink
# a1.sinks.k1.type = logger
a1.sinks.k1.type = hdfs


# Use a channel which buffers events in memory
# a1.channels.c1.type = memory
a1.channels.c1.capacity = 1000
a1.channels.c1.transactionCapacity = 100
a1.channels.c1.checkpointIntervel = 300000

# customizing sink for hdfs

a1.sinks.k1.type = hdfs
a1.sinks.k1.channel = c1

# a1.sinks.k1.hdfs.path = hdfs://quickstart.cloudera:8020/user/cloudera/flume
a1.sinks.k1.hdfs.path = hdfs://quickstart.cloudera:8020/user/cloudera/flume/%y-%m-%d
a1.sinks.k1.hdfs.filePrefix = flume-%y-%m-%d
a1.sinks.k1.hdfs.useLocalTimeStamp = true


a1.sinks.k1.hdfs.rollSize = 1048576
a1.sinks.k1.hdfs.rollCount = 100
a1.sinks.k1.hdfs.rollInterval = 10
a1.sinks.k1.hdfs.fileType = Datastream
a1.sinks.k1.hdfs.idleTimeout = 10

# a1.sinks.k1.hdfs.fileprefix = netcat

# Bind the source and sink to the channel
a1.sources.r1.channels = c1
a1.sinks.k1.channel = c1
