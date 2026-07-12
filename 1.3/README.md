DEPLOY WITH: 

k3d cluster create -a 2
kubectl apply -f manifests/deployment.yaml 

CHECK IF IT IS WORKING:

kubectl get pods
kubectl logs <NAME_OF_POD>

DELETE WITH:

kubectl delete -f manifests/deployment.yaml
k3d cluster delete
