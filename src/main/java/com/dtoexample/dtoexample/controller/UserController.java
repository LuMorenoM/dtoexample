package com.dtoexample.dtoexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dtoexample.dtoexample.dto.UserRequest;
import com.dtoexample.dtoexample.service.UserService;
import com.dtoexample.dtoexample.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request) {
        //Llamamos al servicio para crear el usuario
        UserResponse userResponse = userService.createUser(request);
        //Devolvemos la respuesta con el usuario creado
        return ResponseEntity.ok(userResponse);
    }

    // Otros endpoints (obtener, actualizar, eliminar usuarios) podrían ir aquí
}
