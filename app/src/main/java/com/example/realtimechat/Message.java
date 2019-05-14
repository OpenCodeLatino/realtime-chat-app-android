package com.example.realtimechat;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Message {
    public String user;
    public String text;

    public Message () {

    }

    public Message(String user, String text) {
        this.user = user;
        this.text = text;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("user", user);
        result.put("text", text);

        return result;
    }
}
