# .bashrc
 
# User specific aliases and functions
 
# Source global definitions
if [ -f /etc/bashrc ]; then
        . /etc/bashrc
fi
PS1="$ "
cd

export PATH=$PATH:.
set -o ignoreeof

umask 0026

alias rm="rm -i"

GLASSFISH_HOME=~/appServ/glassfish4/glassfish
PATH=$GLASSFISH_HOME/bin:$PATH

CLASSPATH=$CLASSPATH:$GLASSFISH_HOME/lib/*
CLASSPATH=$CLASSPATH:$GLASSFISH_HOME/lib/appserv-rt.jar
CLASSPATH=$CLASSPATH:$GLASSFISH_HOME/lib/javaee.jar

#DERBY
DERBY_HOME=~/appServ/glassfish4/javadb
PATH=$PATH:$DERBY_HOME/bin

#JAVA
JAVA_HOME=/etc/alternatives/java_sdk/
PATH=$PATH:$JAVA_HOME/bin:$JAVA_HOME:lib

#ANT
ANT_HOME=/mci/inf/chabrido/appServ/apache-ant-1.8.1
PATH=$PATH:$ANT_HOME:$ANT_HOME/lib
CLASSPATH=$CLASSPATH:$ANT_HOME/lib

export PATH CLASSPATH GLASSFISH_HOME DERBY_HOME ANT_HOME JAVA_HOME
