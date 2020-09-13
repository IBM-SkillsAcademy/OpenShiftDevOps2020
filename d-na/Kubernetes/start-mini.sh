#!/bin/bash
echo
echo "...Starting Minikube Cluster"

minikube version
echo

minikube start --network-plugin=cni --memory=4096
echo

minikube ssh -- sudo mount bpffs -t bpf /sys/fs/bpf
echo

kubectl create -f https://raw.githubusercontent.com/cilium/cilium/v1.8/install/kubernetes/quick-install.yaml
echo
echo "Minikube Cluster is ready"