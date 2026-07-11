package com.example.web_server;

import org.springframework.boot.web.server.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ServerInfo {

    @EventListener
    public void onServerInitialized(WebServerInitializedEvent event) {
        var context = event.getApplicationContext();
        int port = event.getWebServer().getPort();

        System.out.println("Server is running on port: " + port);
    }
}