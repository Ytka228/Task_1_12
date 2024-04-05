
package com.mirea.kt.example;


public class Message {
    int id;
    String body;
    String type;
    Boolean isHasAttachments;
    long timestamp;

    public Message(int id, String body, String type, Boolean isHasAttachments, long timestamp) {
        this.id = id;
        this.body = body;
        this.type = type;
        this.isHasAttachments = isHasAttachments;
        this.timestamp = timestamp;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean isHasAttachments() {
        return isHasAttachments;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    
  
}
