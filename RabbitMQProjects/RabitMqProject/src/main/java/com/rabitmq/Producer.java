package com.rabitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Producer {
	public static void main(String[] args) throws IOException, TimeoutException {
		ConnectionFactory factory =new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection =factory.newConnection();
		Channel channel =connection.createChannel();
		channel.queueDeclare("AnkushQueue", false, false, false, null);
		String message ="Hello Ankush !";
		channel.basicPublish(null, "AnkushQueue", null, message.getBytes());
		System.out.println(" [x] Sent '" + message + "'");
		
	}
}
