DEPLOY WITH: 

k3d cluster create -a 2

kubectl create deployment hash-generator --image=swipped/hash_generator:latest  

DELETE WITH:

kubectl delete deployment hash-generator

k3d cluster delete