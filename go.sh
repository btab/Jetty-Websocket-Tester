#!/bin/sh -

# taken from https://github.com/harrah/xsbt/wiki/Setup
java_options="-Dfile.encoding=UTF8 -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m"
sbt_command="java $java_options -jar project/sbt_0-11-1.jar"

case $1 in
  # open up an in-project console
  c | console)
    $sbt_command update console;;
    
  # list of the library versions this project depends on
  l | libraries)
    $sbt_command library-dependencies | grep List;;
  
  # run the servlet from within SBT
  r | run)
    $sbt_command update run;;
    
  # open up a raw SBT console
  s | sbt)
    $sbt_command;;
    
  *)
    echo "specify a command: (c)onsole, (l)ibraries, (r)un, (s)bt";;
esac
