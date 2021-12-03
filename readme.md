# How to build
```
mvn compile
mvn package
docker build -t mo053/gs-spring-boot-docker .
```

# How to run 
Run on docker

`docker run mo053/gs-spring-boot-docker -p 8080:8080 `

Run on k8s
```
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```  

