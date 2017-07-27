#!/usr/bin/env bash
# CLOUDERA-BUILD
export JAVA8_BUILD=true
. /opt/toolchain/toolchain.sh
export CDH_GBN=$(curl "http://builddb.infra.cloudera.com:8080/query?product=cdh&version=6.x&user=jenkins&tag=official")
curl http://github.mtv.cloudera.com/raw/CDH/cdh/cdh6.x/gbn-m2-settings.xml > mvn_settings.xml
export JAVA_HOME=$JAVA_1_8_HOME
echo "Versions used for the build:"
java -version
mvn -version

echo "Running maven test"
export MAVEN_OPTS="-Xms512m -Xmx1024m -XX:PermSize=256m -XX:MaxPermSize=512m"
mvn -s mvn_settings.xml --update-snapshots clean test -B
