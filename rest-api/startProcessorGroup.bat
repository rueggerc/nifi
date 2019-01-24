@echo off

rem curl -i -X PUT -H 'Content-Type: application/json' -d '{"id":"7023d346-0168-1000-48e5-9a575af1eb3c","state":"RUNNING"}' http://sunny:8084/nifi-api/flow/process-groups/7023d346-0168-1000-48e5-9a575af1eb3c

echo "Ruge"
rem curl -i -X PUT -H 'Content-Type: application/json' -d '{"id":"7023d346-0168-1000-48e5-9a575af1eb3c","state":"RUNNING"}' http://sunny:8084/nifi-api/flow/process-groups/7023d346-0168-1000-48e5-9a575af1eb3c

curl -i -X PUT -H ^
'Content-Type: application/json' -XPUT -d^
'{"id":"7023d346-0168-1000-48e5-9a575af1eb3c","state":"RUNNING"}' ^
http://sunny:8084/nifi-api/flow/process-groups/7023d346-0168-1000-48e5-9a575af1eb3c