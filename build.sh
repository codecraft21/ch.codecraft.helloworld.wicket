#!/bin/sh
cd $CI_HOME/helloword.wicket
sbt ++$TRAVIS_SCALA_VERSION package
