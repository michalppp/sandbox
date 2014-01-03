#!/bin/bash

function setupClasspath() {
	export CLASSPATH=$APP_HOME/conf
	for jar in $APP_HOME/lib/*.jar
		do			
			CLASSPATH=${CLASSPATH}:$jar
		done
	export CLASSPATH
}

function setupAppHome() {
	pushd $(dirname "${0}") > /dev/null
	APP_HOME=$(pwd -L)/..
	popd > /dev/null
}

setupAppHome
setupClasspath

java -Xmx4096m -Xms4096m com.galexis.alloga2mysql.Alloga2MySqlmportMain

