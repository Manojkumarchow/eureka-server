## Description about the project

 - Clone the project in your local using HTTPS or SSH.
 - eureka-proxy folder or service will act as the eureka-proxy-server (Service Registry)
 - User-service is a demo service which acts as a client that registers itself while starting up.
 - Start both the applications in your local machine.
 - You can view the list of services in the eureka-proxy using http://localhost:8761
 - Download docker and clone the images and you should be able to run these with mysql.
 - Use `docker build -t <image-name>:tag` for every single project
 - Use `docker run -p host_port:docker_port --name <container_name> -d <image_name>` to run the containers.
 

