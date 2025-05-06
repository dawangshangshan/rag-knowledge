package com.dawang.rag.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;

/**
 * @Author: dawang
 * @Description: TODO
 * @Date: 2025/5/5 21:49
 * @Version: 1.0
 */
public interface IAiService {
    ChatResponse generate(String model, String message);

    Flux<ChatResponse> generateStream(String model, String message);
}
