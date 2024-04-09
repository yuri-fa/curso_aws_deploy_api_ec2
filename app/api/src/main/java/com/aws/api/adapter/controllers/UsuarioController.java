package com.aws.api.adapter.controllers;

import com.aws.api.adapter.controllers.model.UsuarioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private List<UsuarioDto> usuarioDtoList= new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> getUsuarios(){
        UsuarioDto usuarioResponse = new UsuarioDto();
        return ResponseEntity.ok(usuarioDtoList);
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> novoUsuario(@RequestBody UsuarioDto usuarioDto){
        usuarioDto.setIdUsuario(UUID.randomUUID().toString());
        usuarioDto.setDataCriacaoUsuario(LocalDateTime.now());
        usuarioDtoList.add(usuarioDto);
        return ResponseEntity.ok(usuarioDto);
    }
}
