package com.examples.kafkatweets

import java.util
import java.util.Properties
import org.apache.kafka.clients.consumer.KafkaConsumer
import scala.collection.JavaConverters._

object KafkaConsumerApp extends App {
  
  val topic = "topic-twitter-response"

  val properties = new Properties()
  properties.put("bootstrap.servers", "localhost:9092")
  properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  properties.put("group.id", "fkafka-tweet-app")
  
  val consumer = new KafkaConsumer[String, String](properties)
  consumer.subscribe(util.Collections.singletonList(topic))

  while(true){
    val records = consumer.poll(2000)
    for (record <- records.asScala){
      println(record)
    }
  }
  
  
  println("Hello, World!")
}