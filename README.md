# Cloud Resource Analyzer

A lightweight, Java-based system telemetry tool designed for real-time monitoring of CPU load and heap memory utilization.

## 🚀 Overview
This project provides insights into application resource consumption using the Java Management Extensions (JMX) API. It is designed with a modular architecture to separate data collection from logging and analysis.

## 🛠️ Features
* **Modular Design:** Separation of concerns between `MetricsCollector`, `MetricsExporter`, and `SystemProfiler`.
* **Automated CI/CD:** Integrated GitHub Actions pipeline for continuous build validation and quality control.
* **Low Overhead:** Built on core Java APIs to ensure minimal system impact during execution.

## 📋 How to Run
1. Clone the repository: `git clone https://github.com/krishnaaaaaaaaaaaaaaaa/Cloud-Resource-Analyzer.git`
2. Ensure you have **JDK 21** installed.
3. Build the project using Maven: `mvn clean compile`
4. Run the `SystemProfiler` class.

## 📈 CI/CD Status
![Java CI](https://github.com/krishnaaaaaaaaaaaaaaaa/Cloud-Resource-Analyzer/actions/workflows/maven.yml/badge.svg)

## 📄 License
This project is licensed under the MIT License.