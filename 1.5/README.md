DEPLOY WITH:

k3d cluster create -a 2
kubectl apply -f manifests/deployment.yaml
kubectl port-forward <NAME_OF_POD> 8080:9090

CHECK IF IT IS WORKING:

http://localhost/users

DELETE WITH:

kubectl delete -f manifests/deployment.yaml
k3d cluster delete
