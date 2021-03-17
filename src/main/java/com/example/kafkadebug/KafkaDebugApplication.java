package com.example.kafkadebug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.kafkadebug.kafka.producer.Sender;

@SpringBootApplication
public class KafkaDebugApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDebugApplication.class, args);
	}

    @Autowired
    private Sender sender;

    @Override
    public void run(String... strings) throws Exception {
        sender.send("Spring Kafka Producer and Consumer Example");
    }

}
