@echo off

set CATALINA_HOME="%CD%\tomcat"

call "%CATALINA_HOME%\bin\shutdown.bat"

rd /S /Q "%CATALINA_HOME%\webapps\brighton-beach"
del /F /Q "%CATALINA_HOME%\webapps\brighton-beach.war"

copy build\libs\brighton-beach.war "%CATALINA_HOME%\webapps"
