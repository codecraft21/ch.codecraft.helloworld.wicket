#!/bin/sh
echo 'helloworld.wicket build'
cd $CI_HOME/helloword.wicket
echo 'pwd'
pwd
echo 'sbt'
sbt ++$TRAVIS_SCALA_VERSION package
