![Java CI](https://github.com/krishnaaaaaaaaaaaaaaaa/Cloud-Resource-Analyzer/actions/workflows/maven.yml/badge.svg)

Cloud-Resource-Analyzer
Overview
A lightweight, Java-based system telemetry tool designed to monitor CPU and heap memory utilization in real-time. This project explores the Java Management Extensions (JMX) API to provide insights into application resource consumption and system health.

The goal of this project was to develop a modular, extensible monitoring utility to better understand JVM performance and identify bottlenecks in data-intensive environments.

Features
Real-time Telemetry: Captures current CPU load and JVM heap memory usage.

Modular Design: Separates data collection, analysis, and logging concerns for better maintainability.

Automated Alerting: Implements threshold monitoring to identify potential performance bottlenecks.

Data Persistence: Automatically logs system metrics to metrics.csv for post-execution trend analysis.

CI/CD Ready: Integrated GitHub Actions workflow for automated build validation.

Technical Stack
Language: Java 17

Build Tool: Maven

Monitoring API: java.lang.management

Automation: GitHub Actions

How to Run
Ensure you have JDK 17 or higher installed.

Clone this repository.

Build the project using Maven:

Bash
mvn clean compile
Execute the main class:

Bash
mvn exec:java -Dexec.mainClass="SystemProfiler"
Future Roadmap
Asynchronous Logging: Implement non-blocking I/O to minimize monitoring overhead during high-load scenarios.

Prometheus Integration: Add exporters for automated time-series visualization in Grafana.

Container Support: Create a Dockerfile to facilitate deployment in cloud-native environments.