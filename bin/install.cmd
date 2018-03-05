@echo off
echo Install to local

cd %~dp0
cd ..
call mvn clean install -Dmaven.test.skip=true
cd ..
pause