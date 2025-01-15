package dev.vengateshm.kafka.producer.demo_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProducerApplication.class, args);
	}

}

// ~/kafka_2.12-3.9.0/bin/zookeeper-server-start.sh ~/kafka_2.12-3.9.0/config/zookeeper.properties
// ~/kafka_2.12-3.9.0/bin/kafka-server-start.sh ~/kafka_2.12-3.9.0/config/server.properties
