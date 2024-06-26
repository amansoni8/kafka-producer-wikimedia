package org.example.wikimedia.kafkaproducerwikimedia;

import com.launchdarkly.eventsource.EventSource;
import javafx.event.EventTarget;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;

import java.beans.EventHandler;
import java.net.URI;
import java.util.Properties;
public class WikimediaChangesProducer {

    public static void main(String[] args) {

        String bootstrapServers = "127.0.0.1:9092";

        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        KafkaProducer<String, String> producer =  new KafkaProducer<>(properties);

        String topic = "wikimedia.recentchange";

        EventHandler eventHandler = TODO;

        String url = "https://stream.wikimedia.org/v2/stream/recentchange";

        EventSource.Builder builder = new EventSource.Builder(eventHandler,URI.create(url));

        EventSource eventSource = builder.build();

        eventSource.start();


    }
}
