# Go to directory which has dockerfile for prometheus  
cd <path>

#  Build an Image 
docker build -t my-prometheus .


# Run the image as a Container
docker run -d -p 9090:9090 --rm --name my-prometheus my-prometheus
docker run -d -p 9093:9093 --rm  --name my-alertmanager prom/alertmanager


# Go to Prometheus Dashboard
http://localhost:9090
// ERROR 
// If you encounter the error Get "http://localhost:8080/actuator/prometheus": dial tcp 127.0.0.1:8080: connect: connection refused in the above status page, replace localhost with the right system IP address in the prometheus.yml file
//Use ipconfig command to get the IP address of the system.

# To check that Prometheus is correctly listening to the Spring Boot application. Navigate to Status -> Targets 
http://localhost:9090/targets

# visit below url to view the Prometheus panel where you can query and view the metrics pushed by our Boot app.
http://localhost:9090/graph

# For more information visit following url
https://prometheus.io/docs/prometheus/latest/installation/
