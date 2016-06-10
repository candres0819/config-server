# Config Server
External server configuration

* Config Server
    * docker run -d --name config-server -p 8888:8888 anilallewar/config-server
    * docker logs -f config-server

* Eureka Server
    * docker run -d --name registry-server -p 8761:8761 anilallewar/webservice-registry
    * docker logs -f registry-server

* OAuth Server
    * docker run -d --name auth-server -p 8899:8899 anilallewar/auth-server
    * docker logs -f auth-server

* User Webservice
    * docker run -d --name user-webservice anilallewar/user-webservice
    * docker logs -f user-web service

* Task Webservice
    * docker run -d --name task-webservice anilallewar/task-webservice
    * docker logs -f task-webservice

* Comments Webservice    
    * docker run -d --name comments-webservice anilallewar/comments-webservice
    * docker logs -f comments-webservice

* Web Portal
    * docker run -d --name web-portal anilallewar/web-portal
    * docker logs -f web-portal

* Zuul API Gateway
    * docker run -d --name api-gateway -p 8080:8080 anilallewar/api-gateway
    * docker logs -f api-gateway