# Read Me First
Docker Compose Spring boot and MySQL

# Getting Started

### Run the system
We can easily run the whole with only a single command
 * docker compose up
Docker will pull the MySQL and Spring Boot images
The services can be run on the background with command:
* docker compose up -d

### Stop the system
Stopping all running containers is also simple command:
* docker compose down
If you need to stop and remove all containers, networks and all images used by any service in docker-compose.yml file, use the command:
* docker compose down --rmi all


