@echo off
echo ==============================================================
echo  PICC-PC-Abstract-API-Ecosystem - Local Build
echo ==============================================================
echo.
if exist "mvnw.cmd" (
    call .\mvnw.cmd clean install
) else (
    call mvn clean install
)
echo.
echo Build complete.
@echo on
