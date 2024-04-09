package com.aws.api.adapter.controllers.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@JsonIgnoreProperties
public class UsuarioDto {

    @JsonProperty("id_usuario")
    private String idUsuario;
    @JsonProperty("nome_usuario")
    private String nomeUsuario;
    @JsonProperty("data_criacao_usuario")
    private LocalDateTime dataCriacaoUsuario;
    @JsonProperty("documento")
    private String documento;
    @JsonProperty("data_nascimento")
    private LocalDateTime dataNascimento;
}
