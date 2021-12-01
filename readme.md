# How to run 
`kubectl apply -f deployment.yaml`  
`kubectl exec -it hellojava-65685c7458-2gstk /bin/bash`  
`-Dserver.port=9000 -XX:ErrorFile=/dump/log.txt -Xmx5m -XX:+CrashOnOutOfMemoryError -XX:+CrashOnOutOfMemoryError -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/dump/oom.bin app.jar`
