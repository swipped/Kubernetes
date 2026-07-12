DEPLOY WITH:

k3d cluster create -a 2 
kubectl create deployment todo-app --image=swipped/todo-app:latest

CHECK IF IT IS WORKING:

kubectl logs <NAME_OF_POD> | grep "Server is running on port: 8080"

DELETE WITH:

kubectl delete deployment todo-app
k3d cluster delete