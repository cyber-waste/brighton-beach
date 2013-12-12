#!/bin/bash

export CATALINA_HOME="$(pwd)/tomcat"

sh "$CATALINA_HOME/bin/shutdown.sh"

rm -rf "$CATALINA_HOME/webapps/brighton-beach"
rm "$CATALINA_HOME/webapps/brighton-beach.war"

cp build/libs/brighton-beach.war "$CATALINA_HOME/webapps"