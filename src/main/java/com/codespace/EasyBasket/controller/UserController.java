package com.codespace.EasyBasket.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

import com.codespace.EasyBasket.dto.*;
import com.codespace.EasyBasket.service.UserService;

@RestController
@RequestMapping("/api/users")

public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserResponseDTO create(@Valid @RequestBody UserRequestDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<UserResponseDTO> getAll() {
        return service.getAll();
    }
}
