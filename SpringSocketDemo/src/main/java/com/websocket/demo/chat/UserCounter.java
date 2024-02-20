package com.websocket.demo.chat;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class UserCounter {

    private int onlineUsers = 0;

    public void userConnected() {
        onlineUsers++;
    }

    public void userDisconnected() {
        onlineUsers--;
    }
}
