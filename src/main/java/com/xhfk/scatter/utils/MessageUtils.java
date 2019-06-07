package com.xhfk.scatter.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xhfk.scatter.api.base.Message;

public final class MessageUtils {
    private static MessageUtils instance;
    private static Map<String, JsonNode> messages;
    private static Logger logger = LoggerFactory.getLogger(MessageUtils.class);

    private MessageUtils() {
        init();
    }

    public static synchronized MessageUtils getInstance() {
        if (instance == null) {
            instance = new MessageUtils();
        }

        return instance;
    }

    /**
     * Load all the messages from message.json file.
     */
    private void init() {
        ObjectMapper objMapper = new ObjectMapper();
        try {
            InputStream jsonStream = MessageUtils.class.getResourceAsStream("/message.json");
            messages = objMapper.readValue(jsonStream, Map.class);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    /**
     * retrieve message object by key, and construct message for usage.
     *
     * @param key
     * @return
     */
    public Message getMessage(String key) {
        if (messages == null || messages.isEmpty()) {
            return new Message();
        }
        Map messageMap = (Map) messages.get(key);
        String code = messageMap.get("code").toString();
        String msg = messageMap.get("message").toString();
        return new Message(code, msg);
    }
}
