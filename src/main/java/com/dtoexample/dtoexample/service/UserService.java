package com.dtoexample.dtoexample.service;

import org.springframework.stereotype.Service;

import com.dtoexample.dtoexample.dto.UserRequest;
import com.dtoexample.dtoexample.repository.UserRepository;
import com.dtoexample.dtoexample.dto.UserResponse;
import com.dtoexample.dtoexample.entity.User;


@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(UserRequest request) {
        // Convertimos el UserRequest a una entidad User
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        
        // Guardamos el usuario en la base de datos
        User savedUser = userRepository.save(user);
        
        // Convertimos la entidad User guardada a UserResponse
        return new UserResponse(savedUser.getId(), savedUser.getName(), savedUser.getEmail());
    }

    // Otros métodos del servicio (obtener, actualizar, eliminar usuarios) podrían ir aquí
    
}

