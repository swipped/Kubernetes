Deploy with: kubectl apply -f k8s/deployment.yaml
Confirm it is running with: kubectl logs -f deployment/log-output

k3d cluster create --port 8082:30080@agent:0 -p 8081:80@loadbalancer --agents 2