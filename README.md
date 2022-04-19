# The code uses a library called micrometer to create metrics that Prometheus can understand. These metrics are available over http://localhost:8082/actuator/prometheus
# Check Metrics which are by Spring Boot’s Actuator, and Micrometer.
http://localhost:8080/actuator/prometheus

# Check instructions for Prometheus with SpringBoot app
https://www.tutorialworks.com/spring-boot-prometheus-micrometer/#publishing-metrics-in-spring-boot-2x-with-micrometer