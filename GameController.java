package com.yourgame;

import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {

    private final GameService service = new GameService();

    @GetMapping("/")
    public String hello() {
        return "Добро пожаловать в игру!";
    }

    @GetMapping("/start")
    public String startGame() {
        return service.start();
    }

    // Добавляй сюда свои команды, например /draw, /step и т.д.
}
