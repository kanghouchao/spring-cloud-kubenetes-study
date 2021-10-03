# Demo
| you must install docker & kubectl & minikube before
### start minikube
```shell
minikube start
```
### get minikube's docker env
```shell
eval $(minikube docker-env)
```
### use maven plugin
```shell
mvn clean package fabric8:build -Dmaven.test.skip=true
```
