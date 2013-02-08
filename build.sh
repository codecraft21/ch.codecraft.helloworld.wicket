#!/bin/sh
echo 'helloworld.wicket build'
cd $CI_HOME/helloword.wicket
sbt ++$TRAVIS_SCALA_VERSION package
