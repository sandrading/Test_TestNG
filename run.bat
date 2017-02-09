@echo off
setlocal
call mvn eclipse:clean
call mvn -npu eclipse:eclipse -Dwtpversion=1.0 -DdownloadSources=true
pause
endlocal
