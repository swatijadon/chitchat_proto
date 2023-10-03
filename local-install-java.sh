#!/bin/sh

./generate-proto-java-code.sh
cd java
./gradlew clean build publishToMavenLocal -Pversion=$1