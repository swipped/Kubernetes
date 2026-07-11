DEPLOY WITH: 

k3d cluster create -a 2
kubectl create deployment hash-generator --image=swipped/hash_generator:latest  

CHECK IF IT IS WORKING:

kubectl get pods
kubectl attach -it <NAME_OF_POD>

DELETE WITH:

kubectl delete deployment hash-generator
k3d cluster delete